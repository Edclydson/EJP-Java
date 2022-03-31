package controllers;


import javax.swing.JOptionPane;

import views.GerenciarEncerraView;
import views.MenuGerenteView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GerenciarEncerraController {
    bancoController dbControl = new bancoController();
    static  String nomeTitular = "";
    static String numConta = "";
    static String saldo = "";
    @FXML
    private VBox Janela;

    @FXML
    private Label LabelEJP1,labelNovaConta,lblCPFNumConta;

    @FXML
    private Button bttBuscar,bttEncerrar,bttVoltar;

    @FXML
    private TextField txtBuscaCPFNumConta,txtCPFTitular,txtNumConta,txtSaldo;

    @FXML
    private PasswordField txtSenhaGerente;


    @FXML
    void Buscar(ActionEvent event) {
        if(txtBuscaCPFNumConta.getText().length() == 8 || txtBuscaCPFNumConta.getText().length() == 6){
            //BUSCAR PELO NUMERO DA CONTA
            dbControl.buscaEncerraConta(txtBuscaCPFNumConta.getText().toString());
            txtCPFTitular.setText(nomeTitular);
            txtNumConta.setText(numConta);
            txtSaldo.setText(saldo);
            txtCPFTitular.setEditable(false);
            txtNumConta.setEditable(false);
        }
        else if(txtBuscaCPFNumConta.getText().toString().length() == 11){
            //BUSCAR PELO CPF
            dbControl.buscaEncerraContaCPF(txtBuscaCPFNumConta.getText().toString());
            txtCPFTitular.setText(nomeTitular);
            txtNumConta.setText(numConta);
            txtSaldo.setText(saldo);
            txtCPFTitular.setEditable(false);
            txtNumConta.setEditable(false);
        }
        else{
            JOptionPane.showMessageDialog(null,"Digite um CPF ou o Numero da Conta");
        }
    }

    @FXML
    void Encerrar(ActionEvent event) {
        if(txtSenhaGerente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O Gerente deve informar sua senha!");
        }
        else{
            if(txtNumConta.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Informe a conta que deseja encerrar!");
            }
            else{
                dbControl.encerraConta(txtNumConta.getText().toString(),txtSenhaGerente.getText().toString());
            }
        }
    }

    @FXML
    void Voltar(ActionEvent event) {
        MenuGerenteView telaanterior = new MenuGerenteView();
        try{
            telaanterior.start(new Stage());
            GerenciarEncerraView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

}
