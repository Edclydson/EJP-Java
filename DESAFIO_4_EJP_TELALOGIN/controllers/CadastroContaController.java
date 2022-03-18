package DESAFIO_4_EJP_TELALOGIN.controllers;
import DESAFIO_4_EJP_TELALOGIN.views.CadastroContaView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuGerenteView;

import java.net.URL;
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
import javafx.stage.Stage;

public class CadastroContaController implements Initializable {

    private String[] tipoconta = {"Conta Corrente","Conta Poupança"};
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
            checacamposvazios(txtCPFNovoCliente.getText(), txtSaldoInicial.getText(), txtSenhaNovoCliente.getText());
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
        }catch(Exception e){e.printStackTrace();}
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ChoiceboxTipoConta.setValue(tipoconta[0]);
        ChoiceboxTipoConta.getItems().addAll(tipoconta);
        ChoiceboxTipoConta.setOnAction(ActionEvent -> {
            if(ChoiceboxTipoConta.getValue().equals("Conta Poupança"))
            {
                txtSaldoInicial.setText("R$0.0");
                txtSaldoInicial.setDisable(true);}
            else{
                txtSaldoInicial.setText("");
                txtSaldoInicial.setDisable(false);} });
    }

    public void checacamposvazios(String campoCPF, String campoSaldoInicial,String campoSenha)
    {
        if(campoCPF.equals("") || campoSaldoInicial.equals("")|| campoSenha.equals(""))
        {
            JOptionPane.showMessageDialog(null,"O preenchimento de todos os campos é obrigatório!");
        }
    }
    
}
