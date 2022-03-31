package controllers;


import javax.swing.JOptionPane;

import views.DepositoView;
import views.MenuIniciarAtendimentoOperacionalView;
import views.MenuOperadorView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DepositoController {

    @FXML
    private Button btConfirma;

    @FXML
    private Button btEncerrar;

    @FXML
    private Button btVoltar;

    @FXML
    private TextField txtNumeroConta;

    @FXML
    private TextField txtValorDeposito;
    
    public TextField getTxtNumeroConta() {
        return txtNumeroConta;
    }

    public void setTxtNumeroConta(TextField txtNumeroConta) {
        this.txtNumeroConta = txtNumeroConta;
    }

    public TextField getTxtValorDeposito() {
        return txtValorDeposito;
    }

    public void setTxtValorDeposito(TextField txtValorDeposito) {
        this.txtValorDeposito = txtValorDeposito;
    }

    @FXML
    void confirmar(ActionEvent event) {
        bancoController bdControl = new bancoController();
        String conta = txtNumeroConta.getText().toString();
        String valor = txtValorDeposito.getText().toString();
        if(Double.parseDouble(valor) <= 0.0){
            JOptionPane.showMessageDialog(null,"Por favor, informe um valor válido!");
        }
        else{
            bdControl.depositar(conta, valor);
        }
        /*
        ConfirmaView telaseguinte = new ConfirmaView();
        try{
            telaseguinte.start(new Stage());
        }catch(Exception e){e.printStackTrace();}
        */
    }

    @FXML
    void Encerrar(ActionEvent event) {
        MenuIniciarAtendimentoOperacionalView telaanterior = new MenuIniciarAtendimentoOperacionalView();
        try{
            telaanterior.start(new Stage());
            DepositoView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void Voltar(ActionEvent event) {
        MenuOperadorView telaanterior = new MenuOperadorView();
        try{
            telaanterior.start(new Stage());
            DepositoView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }


}
