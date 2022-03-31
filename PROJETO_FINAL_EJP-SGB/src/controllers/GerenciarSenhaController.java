package controllers;


import javax.swing.JOptionPane;

import views.GerenciarSenhaView;
import views.MenuGerenteView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GerenciarSenhaController {
    bancoController dbControl = new bancoController();
    static  String nomeTitular = "";
    static String numConta = "";
    static String senha = "";
    @FXML
    private VBox Janela;

    @FXML
    private Label LabelEJP1,labelNovaConta,lblCPFNumConta;

    @FXML
    private Button bttAlterar,bttBuscar,bttVoltar;

    @FXML
    private TextField txtBuscaCPFNumConta;

    @FXML
    private TextField txtCPFTitular,txtNumConta,txtSenha;

    @FXML
    void Alterar(ActionEvent event) {
        dbControl.alteraSenha(txtNumConta.getText().toString(),txtSenha.getText().toString());
    }

    @FXML
    void Buscar(ActionEvent event) {
        if(txtBuscaCPFNumConta.getText().length() == 8 || txtBuscaCPFNumConta.getText().length() == 6){
            //BUSCAR PELO NUMERO DA CONTA
            dbControl.buscaContaNumConta(txtBuscaCPFNumConta.getText().toString());
            txtCPFTitular.setText(nomeTitular);
            txtNumConta.setText(numConta);
            txtSenha.setText(senha);
            txtCPFTitular.setEditable(false);
            txtNumConta.setEditable(false);
        }
        else if(txtBuscaCPFNumConta.getText().toString().length() == 11){
            //BUSCAR PELO CPF
            dbControl.buscaContaCPF(txtBuscaCPFNumConta.getText().toString());
            txtCPFTitular.setText(nomeTitular);
            txtNumConta.setText(numConta);
            txtSenha.setText(senha);
            txtCPFTitular.setEditable(false);
            txtNumConta.setEditable(false);
        }
        else{
            JOptionPane.showMessageDialog(null,"Digite um CPF ou o Numero da Conta");
        }
    }

    @FXML
    void Voltar(ActionEvent event) {
        MenuGerenteView telaanterior = new MenuGerenteView();
        try{
            telaanterior.start(new Stage());
            GerenciarSenhaView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    
}

