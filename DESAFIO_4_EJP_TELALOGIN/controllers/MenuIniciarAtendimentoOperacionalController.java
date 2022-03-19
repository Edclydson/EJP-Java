package DESAFIO_4_EJP_TELALOGIN.controllers;

import DESAFIO_4_EJP_TELALOGIN.views.LoginView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuIniciarAtendimentoOperacionalView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MenuIniciarAtendimentoOperacionalController {

    @FXML
    private Button btdeslogar;

    @FXML
    private Button bttIniarAtendimento;

    @FXML
    private TextField cpfAtendimento;

    @FXML
    private Label lblCPF;

    @FXML
    void IniciarAtendimento(ActionEvent event) {
        /**
         * ENCONTRAR O CLIENTE PELO CPF
         * SE CADASTRADO AS OPERAÇOES SAO LIBERADAS
         * CASO CONTRARIO O MESSAGE DIALOG INFORMA
         */
    }

    @FXML
    void deslogar(ActionEvent event) {
        LoginView telaanterior = new LoginView();
        try{
            telaanterior.start(new Stage());
            MenuIniciarAtendimentoOperacionalView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

}
