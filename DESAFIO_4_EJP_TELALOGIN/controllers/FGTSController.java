package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import views.MenuFGTSView;
import views.MenuFaltaView;
import views.MenuHoraExtraView;
import views.MenuInsalubridadeView;
import views.MenuSalarioFamiliaView;
import views.MenuValeTransporteView;

public class FGTSController {

    @FXML
    private Menu AbaSistema;

    @FXML
    private MenuBar BarraMenu;

    @FXML
    private MenuItem CadastrarNovoColaborador;

    @FXML
    private VBox Janela;

    @FXML
    private Label LabelEJP1;

    @FXML
    private MenuItem Sair;

    @FXML
    private ImageView imgNovoColaborador;

    @FXML
    private Label labelNovaConta;

    @FXML
    private MenuItem mnFGTS;

    @FXML
    private MenuItem mnFalta;

    @FXML
    private MenuItem mnHoraExtra;

    @FXML
    private MenuItem mnInsalubridade;

    @FXML
    private MenuItem mnSalarioFamilia;

    @FXML
    private MenuItem mnValeTransporte;

    @FXML
    void AbrirAbaSistema(ActionEvent event) {

    }

    @FXML
    void CadastrarColaborador(ActionEvent event) {

    }

    @FXML
    void CalcularFGTS(ActionEvent event) {}

    @FXML
    void CalcularFalta(ActionEvent event) {
        MenuFaltaView telaseguinte = new MenuFaltaView();
        try{
            telaseguinte.start(new Stage());
            MenuFGTSView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void CalcularHoraExtra(ActionEvent event) {
        MenuHoraExtraView telaseguinte = new MenuHoraExtraView();
        try{
            telaseguinte.start(new Stage());
            MenuFGTSView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void CalcularInsalubridade(ActionEvent event) {
        MenuInsalubridadeView telaseguinte = new MenuInsalubridadeView();
        try{
            telaseguinte.start(new Stage());
            MenuFGTSView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void CalcularSalarioFamilia(ActionEvent event) {
        MenuSalarioFamiliaView telaseguinte = new MenuSalarioFamiliaView();
        try{
            telaseguinte.start(new Stage());
            MenuFGTSView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void CalcularVT(ActionEvent event) {
        MenuValeTransporteView telaseguinte = new MenuValeTransporteView();
        try{
            telaseguinte.start(new Stage());
            MenuFGTSView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void SairMenu(ActionEvent event) {

    }

}
