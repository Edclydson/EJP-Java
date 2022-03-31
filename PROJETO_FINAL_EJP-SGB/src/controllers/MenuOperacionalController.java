package controllers;


import views.DepositoView;
import views.MenuIniciarAtendimentoOperacionalView;
import views.MenuOperadorView;
import views.SaqueView;
import views.TransferenciaView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuOperacionalController {

    @FXML
    private Button btdeposito,btextrato,btEncerrar,btsaque,bttransferencia;

    /**
     * OPERAÇOES PARA REALIZAR NA CONTA DO CLIENTE QUE INFORMOU O CPF
     */

    @FXML
    void depositar(ActionEvent event) {
        DepositoView telaseguinte = new DepositoView();
        try{
            telaseguinte.start(new Stage());
            MenuOperadorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void sacar(ActionEvent event) {
        SaqueView telaseguinte = new SaqueView();
        try{
            telaseguinte.start(new Stage());
            MenuOperadorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void transferir(ActionEvent event) {
        TransferenciaView telaseguinte = new TransferenciaView();
        try{
            telaseguinte.start(new Stage());
            MenuOperadorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void verextrato(ActionEvent event) {
        bancoController dbControl = new bancoController();
        dbControl.extrato();
    }

    @FXML
    void Encerrar(ActionEvent event) {
        MenuIniciarAtendimentoOperacionalView telaanterior = new MenuIniciarAtendimentoOperacionalView();
        try{
            telaanterior.start(new Stage());
            MenuOperadorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }


}
