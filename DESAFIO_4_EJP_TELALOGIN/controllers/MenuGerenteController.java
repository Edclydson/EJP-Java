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
import views.CadastroClienteView;
import views.CadastroContaView;
import views.LoginView;
import views.MenuGerenteView;


public class MenuGerenteController {

    @FXML
    private ImageView imgbanco;
    
    @FXML
    private Label LabelEJP;

    @FXML
    private VBox Janela;
    
    @FXML
    private MenuBar BarraMenu;

    @FXML
    private Menu Sistema;

    @FXML
    private MenuItem Sair;

    @FXML
    private MenuItem CadastrarNovoCliente;

    @FXML
    private MenuItem CadastrarNovaConta;

    @FXML
    void CadastrarCliente(ActionEvent event) {

        CadastroClienteView telaseguinte = new CadastroClienteView();
        try{
            telaseguinte.start(new Stage());
            MenuGerenteView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void NovaConta(ActionEvent event) {
        CadastroContaView telaseguinte = new CadastroContaView();
        try{
            telaseguinte.start(new Stage());
            MenuGerenteView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void AbrirAbaSistema(ActionEvent event){}

    @FXML
    void SairMenu(ActionEvent event) {
        LoginView telaanterior = new LoginView();
        try{
            telaanterior.start(new Stage());
            MenuGerenteView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }
}
