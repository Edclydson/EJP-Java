package controllers;


import otr.Cliente;
import otr.Conta;
import views.CadastroClienteView;
import views.MenuGerenteView;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;



public class CadastroClienteController implements Initializable{

    private String[] tipoconta = {"Conta Corrente","Conta Poupança"};
    Cliente novoCliente = new Cliente();
    Conta contaNova = new Conta();
    
    @FXML
    private ImageView imgNovoCliente;

    @FXML
    private Label LabelEJP,labelCPF, 
                labelTipoConta, labelSenhaNovoCliente,
                labelSaldoInicial, labelNomeCompleto,labelEndereco,labelTelefone;

    @FXML
    private ChoiceBox<String> ChoiceboxTipoConta;

    @FXML
    private Button bttVoltar,bttCadastrar,bttLimpar;
    
    @FXML
    private TextField txtSaldoInicial,txtCPFNovoCliente,txtNomeNovoCliente,txtEnderecoNovoCliente,txtTelefoneNovoCliente;

    @FXML
    private PasswordField txtSenhaNovoCliente;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ChoiceboxTipoConta.setValue(tipoconta[0]);
        ChoiceboxTipoConta.getItems().addAll(tipoconta);
        ChoiceboxTipoConta.setOnAction(ActionEvent -> {
            if(ChoiceboxTipoConta.getValue().equals("Conta Poupança")){
                txtSaldoInicial.setText("R$0.0");
                txtSaldoInicial.setDisable(true);}
            else{
                txtSaldoInicial.setText("");
                txtSaldoInicial.setDisable(false);
            } 
        });
    }

    @FXML
    void Cadastrar(ActionEvent event) 
    {
        bttCadastrar.setOnAction(ActionEvent -> {
            checacampos(txtNomeNovoCliente.getText(), txtCPFNovoCliente.getText(),txtEnderecoNovoCliente.getText(), txtTelefoneNovoCliente.getText(),ChoiceboxTipoConta.getValue(),
                                txtSaldoInicial.getText(), txtSenhaNovoCliente.getText());
        });
    }

    @FXML
    void LimparCampos(ActionEvent event) 
    {
        bttLimpar.setOnAction(ActionEvent -> {
            txtNomeNovoCliente.setText("");
            txtCPFNovoCliente.setText("");
            ChoiceboxTipoConta.setValue(tipoconta[0]);
            txtSaldoInicial.setText("");
            txtSenhaNovoCliente.setText("");
        });
    }

    @FXML
    void Voltar(ActionEvent event) 
    {
        MenuGerenteView telaanterior = new MenuGerenteView();
        try{
            telaanterior.start(new Stage());
            CadastroClienteView.getStage().close();
        }
        catch(Exception e){e.printStackTrace();}
    }

    /**
     * 
     * @param campoNome
     * @param campoCPF
     * @param campoEndereco
     * @param campoTelefone
     * @param campoTipoConta
     * @param campoSaldoInicial
     * @param campoSenha
     * 
     * CHECA SE OS CAMPOS DO FORMULARIO PARA CADASTRO DE UM NOVO CLIENTE E CONTA ESTÃO VAZIOS E PREENCHIDOS DE FORMA CORRETA
     * SE HOUVER CAMPOS VAZIOS OU CAMPO DO CPF COM MAIS DE 11 DIGITOS NÃO AVANÇA, CASO CONTRARIO PROSSEGUE COM O REGISTRO
     */
    public void checacampos(String campoNome, String campoCPF, String campoEndereco, String campoTelefone, String campoTipoConta ,String campoSaldoInicial, String campoSenha){
        if(campoNome.equals("") || campoCPF.equals("") || campoSaldoInicial.equals("") || campoSenha.equals("")){
            JOptionPane.showMessageDialog(null,"O preenchimento de todos os campos é obrigatório!");
        }
        else if(campoCPF.length() != 11){
            JOptionPane.showMessageDialog(null,"O campo CPF deve possuir 11 caracteres numéricos!");
        }
        else{
            Random rand = new Random();
            novoCliente.setNomeCliente(campoNome);
            novoCliente.setCpfCliente(campoCPF);
            novoCliente.setEndereço(campoEndereco);
            novoCliente.setTelefone(campoTelefone);
            
            contaNova.setSenha(campoSenha);
            if(campoTipoConta.equals("Conta Poupança")){
                contaNova.setNumeroDaConta(String.valueOf(rand.nextInt((999999 - 100000)+1)+100000));
                contaNova.setTipoDaConta("CP");
                contaNova.setSaldo(0.0);
            }
            else{
                contaNova.setNumeroDaConta(String.valueOf(rand.nextInt((99999999 - 10000000)+1)+10000000));
                contaNova.setTipoDaConta("CC");
                contaNova.setSaldo(Double.parseDouble(campoSaldoInicial));
            }
            bancoController bdControl = new bancoController();
            bdControl.cadastracliente(novoCliente, contaNova);
        }
    }
}
