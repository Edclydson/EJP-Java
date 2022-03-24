package DESAFIO_4_EJP_TELALOGIN.controllers;
import DESAFIO_4_EJP_TELALOGIN.views.CadastroClienteView;
import DESAFIO_4_EJP_TELALOGIN.views.CadastroContaView;
import DESAFIO_4_EJP_TELALOGIN.views.GerenciarClienteView;
import DESAFIO_4_EJP_TELALOGIN.views.LoginView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuGerenteView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MenuGerenteController {

    @FXML
    private ImageView imgbanco;
    
    @FXML
    private Label LabelEJP,lblBoasVindas;

    @FXML
    private VBox Janela;
    
    @FXML
    private MenuBar BarraMenu;

    @FXML
    private Menu Sistema;

    @FXML
    private MenuItem Sair;

    @FXML
    private MenuItem CadastrarNovoCliente,CadastrarNovaConta;

    @FXML
    private MenuItem SimulaEmprestimo,SimulaFinanciamento,SimulaFundoImobiliario,SimulaRendaFixa;

    @FXML
    private MenuItem GerenciarClientes,GerenciarContas;

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
    void gerenciarClientes(ActionEvent event) {
        GerenciarClienteView telaseguinte = new GerenciarClienteView();
        try{
            telaseguinte.start(new Stage());
            MenuGerenteView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void gerenciarContas(ActionEvent event) {

    }
    
    @FXML
    void simularFundoImobiliario(ActionEvent event) {

    }

    @FXML
    void simularRendaFixa(ActionEvent event) {

    }

    @FXML
    void simularEmprestimo(ActionEvent event) {

    }

    @FXML
    void simularFinanciamento(ActionEvent event) {

    }  

    @FXML
    void SairMenu(ActionEvent event) {
        LoginView telaanterior = new LoginView();
        try{
            telaanterior.start(new Stage());
            MenuGerenteView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }
}
