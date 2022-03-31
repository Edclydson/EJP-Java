package controllers;

import otr.Cliente;
import views.MenuIniciarAtendimentoOperacionalView;
import views.MenuOperadorView;
import views.SaqueOutroValorView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SaqueOutroValorController {

    @FXML
    private Button btConfirma;

    @FXML
    private Button btEncerrar;

    @FXML
    private Button btVoltar;

    @FXML
    private TextField txtValorSaque;

    bancoController dbControl = new bancoController();

    @FXML
    void confirmar(ActionEvent event) {
        String valorDosaque = txtValorSaque.getText().toString();
        dbControl.sacar(valorDosaque, Cliente.getCpfCliente());
    }
  
    @FXML
    void Encerrar(ActionEvent event) {
        MenuIniciarAtendimentoOperacionalView telaanterior = new MenuIniciarAtendimentoOperacionalView();
        try{
            telaanterior.start(new Stage());
            SaqueOutroValorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void Voltar(ActionEvent event) {
        MenuOperadorView telaanterior = new MenuOperadorView();
        try{
            telaanterior.start(new Stage());
            SaqueOutroValorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }
}