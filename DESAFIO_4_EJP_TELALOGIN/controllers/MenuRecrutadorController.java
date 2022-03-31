package DESAFIO_4_EJP_TELALOGIN.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import DESAFIO_4_EJP_TELALOGIN.views.*;

public class MenuRecrutadorController {

    @FXML
    private MenuBar BarraMenu;
    
    @FXML
    private Menu AbaSistema;

    @FXML
    private MenuItem mnBuscarColaborador,mnCadastrarNovoColaborador;

    @FXML
    private MenuItem mnFGTS,mnFalta,mnHoraExtra,mnInsalubridade,mnValeTransporte,mnSalarioFamilia;
    
    @FXML
    private MenuItem Sair;

    @FXML
    private VBox Janela;

    @FXML
    private Label LabelEJP;

    @FXML
    private ImageView imgNovoColaborador,imgbanco;


    @FXML
    void AbrirAbaSistema(ActionEvent event) {}

    @FXML
    void BuscarColaborador(ActionEvent event) {
        BuscarColaboradorView telaseguinte = new BuscarColaboradorView();
        try{
            telaseguinte.start(new Stage());
            MenuRecrutadorView.getStage().close();
        }
        catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void CadastrarColaborador(ActionEvent event) {
        CadastroColaboradorView telaseguinte = new CadastroColaboradorView();
        try{
            telaseguinte.start(new Stage());
            MenuRecrutadorView.getStage().close();
        }
        catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void SairMenu(ActionEvent event) {
        LoginView telaanterior = new LoginView();
        try{
            telaanterior.start(new Stage());
            MenuRecrutadorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

}