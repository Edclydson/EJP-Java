package DESAFIO_4_EJP_TELALOGIN.controllers;

import DESAFIO_4_EJP_TELALOGIN.views.BuscarColaboradorView;
import DESAFIO_4_EJP_TELALOGIN.views.LoginView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuFGTSView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuFaltaView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuHoraExtraView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuInsalubridadeView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuSalarioFamiliaView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuValeTransporteView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarColaboradorController {

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
    void AbrirAbaSistema(ActionEvent event) {

    }

    @FXML
    void BuscarColaborador(ActionEvent event) {}

    @FXML
    void CadastrarColaborador(ActionEvent event) {

    }

    @FXML
    void CalcularFGTS(ActionEvent event) {
        MenuFGTSView telaseguinte = new MenuFGTSView();
        try{
            telaseguinte.start(new Stage());
            BuscarColaboradorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void CalcularFalta(ActionEvent event) {
        MenuFaltaView telaseguinte = new MenuFaltaView();
        try{
            telaseguinte.start(new Stage());
            BuscarColaboradorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void CalcularHoraExtra(ActionEvent event) {
        MenuHoraExtraView telaseguinte = new MenuHoraExtraView();
        try{
            telaseguinte.start(new Stage());
            BuscarColaboradorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void CalcularInsalubridade(ActionEvent event) {
        MenuInsalubridadeView telaseguinte = new MenuInsalubridadeView();
        try{
            telaseguinte.start(new Stage());
            BuscarColaboradorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void CalcularSalarioFamilia(ActionEvent event) {
        MenuSalarioFamiliaView telaseguinte = new MenuSalarioFamiliaView();
        try{
            telaseguinte.start(new Stage());
            BuscarColaboradorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void CalcularVT(ActionEvent event) {
        MenuValeTransporteView telaseguinte = new MenuValeTransporteView();
        try{
            telaseguinte.start(new Stage());
            BuscarColaboradorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void SairMenu(ActionEvent event) {
        LoginView telaanterior = new LoginView();
        try{
            telaanterior.start(new Stage());
            BuscarColaboradorView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

}