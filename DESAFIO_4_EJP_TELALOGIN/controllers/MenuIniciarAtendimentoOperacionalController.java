package DESAFIO_4_EJP_TELALOGIN.controllers;

import DESAFIO_4_EJP_TELALOGIN.src.Cliente;
import DESAFIO_4_EJP_TELALOGIN.views.LoginView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuIniciarAtendimentoOperacionalView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuOperadorView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MenuIniciarAtendimentoOperacionalController {

    Cliente EmAtendimento = new Cliente();

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
        bancoController bdControl = new  bancoController();
        bdControl.consultaCadastroCPF(cpfAtendimento.getText().toString());
        EmAtendimento.setCpfCliente(cpfAtendimento.getText().toString());
        MenuOperadorView telaseguinte = new MenuOperadorView();
        try{
            telaseguinte.start(new Stage());
            MenuIniciarAtendimentoOperacionalView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
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
