package controllers;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import otr.Conta;
import views.CadastroContaView;
import views.MenuGerenteView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastroContaController implements Initializable {

    private String[] tipoconta = {"Conta Corrente","Conta Poupança"};
    Conta abrirConta = new Conta();
    bancoController dbcontroller = new bancoController();
    @FXML
    private ChoiceBox<String> ChoiceboxTipoConta;

    @FXML
    private Label LabelEJP,labelCPF,labelNovaConta,
                    labelSaldoInicial,labelSenhaNovaconta,labelTipoConta;

    @FXML
    private Button bttCadastrar,bttLimpar,bttVoltar;

    @FXML
    private TextField txtCPFNovoCliente,txtSaldoInicial;

    @FXML
    private PasswordField txtSenhaNovoCliente;

    @FXML
    void Cadastrar(ActionEvent event) {
        bttCadastrar.setOnAction(ActionEvent -> {
            checacamposvazios(txtCPFNovoCliente.getText(), txtSaldoInicial.getText(), ChoiceboxTipoConta.getValue(), txtSenhaNovoCliente.getText());
        });
    }

    @FXML
    void LimparCampos(ActionEvent event) {
        bttLimpar.setOnAction(ActionEvent -> {
            txtCPFNovoCliente.setText("");
            ChoiceboxTipoConta.setValue(tipoconta[0]);
            txtSaldoInicial.setText("");
            txtSenhaNovoCliente.setText("");
        });
    }

    @FXML
    void Voltar(ActionEvent event) {
        MenuGerenteView telaanterior = new MenuGerenteView();
        try{
            telaanterior.start(new Stage());
            CadastroContaView.getStage().close();
        }
        catch(Exception e){e.printStackTrace();}
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ChoiceboxTipoConta.setValue(tipoconta[0]);
        ChoiceboxTipoConta.getItems().addAll(tipoconta);
        ChoiceboxTipoConta.setOnAction(ActionEvent -> {
            if(ChoiceboxTipoConta.getValue().equals("Conta Poupança")){
                txtSaldoInicial.setText("R$0.0");
                txtSaldoInicial.setDisable(true);
            }
            else{
                txtSaldoInicial.setText("");
                txtSaldoInicial.setDisable(false);
            } 
        });
    }

    /**
     * 
     * @param campoCPF
     * @param campoSaldoInicial
     * @param campoTipoConta
     * @param campoSenha
     * 
     * CAMPOS DA TELA COM O QUE O USUARIO DIGITAR, VERIFICANDO SE NÂO TEM CAMPO VAZIO
     * CASO NÃO TENHA REALIZA A ATRIBUIÇÂO DOS VALORES AOS PARAMETROS DA CLASSE CONTA
     */
    public void checacamposvazios(String campoCPF, String campoSaldoInicial,String campoTipoConta ,String campoSenha)
    {
        if(campoCPF.equals("") || campoSaldoInicial.equals("")|| campoSenha.equals("")){
            JOptionPane.showMessageDialog(null,"O preenchimento de todos os campos é obrigatório!");
        }
        else{
            Random rand = new Random();
            abrirConta.setSenha(campoSenha);
            if(campoTipoConta.equals("Conta Poupança")){
                abrirConta.setNumeroDaConta(String.valueOf((rand.nextInt(999999 - 100000)+1)+100000));
                abrirConta.setTipoDaConta("CP");
                abrirConta.setSaldo(0.0);
            }
            else{
                abrirConta.setNumeroDaConta(String.valueOf(rand.nextInt((99999999 - 10000000)+1)+10000000));
                abrirConta.setTipoDaConta("CC");
                abrirConta.setSaldo(Double.parseDouble(campoSaldoInicial));
            }
            dbcontroller.consultaCadastroCPF(campoCPF,abrirConta);
        }
    }
    
}
