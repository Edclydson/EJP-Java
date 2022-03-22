package DESAFIO_4_EJP_TELALOGIN.controllers;

import DESAFIO_4_EJP_TELALOGIN.views.DepositoView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuIniciarAtendimentoOperacionalView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuOperadorView;
import DESAFIO_4_EJP_TELALOGIN.views.SaqueView;
import DESAFIO_4_EJP_TELALOGIN.views.TransferenciaView;
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
