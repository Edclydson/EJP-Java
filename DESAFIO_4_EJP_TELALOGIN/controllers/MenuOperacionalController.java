package DESAFIO_4_EJP_TELALOGIN.controllers;

import DESAFIO_4_EJP_TELALOGIN.views.LoginView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuOperadorView;
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

    }

    @FXML
    void sacar(ActionEvent event) {

    }

    @FXML
    void transferir(ActionEvent event) {

    }

    @FXML
    void verextrato(ActionEvent event) {

    }

    @FXML
    void Encerrar(ActionEvent event) {
        LoginView telaanterior = new LoginView();
        try{
            telaanterior.start(new Stage());
            MenuOperadorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }


}
