

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private ImageView imgbanco;
    
    @FXML
    private Label LabelEJP;
    
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
            MenuView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void NovaConta(ActionEvent event) {
        CadastroContaView telaseguinte = new CadastroContaView();
        try{
            telaseguinte.start(new Stage());
            MenuView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }


    @FXML
    void AbrirAbaSistema(ActionEvent event){}

    @FXML
    void SairMenu(ActionEvent event) {
        LoginView telaanterior = new LoginView();
        try{
            telaanterior.start(new Stage());
            MenuView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }
}
