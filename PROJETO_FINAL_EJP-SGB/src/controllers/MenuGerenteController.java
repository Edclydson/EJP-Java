package controllers;

import views.CadastroClienteView;
import views.CadastroContaView;
import views.GerenciarClienteView;
import views.GerenciarEncerraView;
import views.GerenciarSenhaView;
import views.LoginView;
import views.MenuGerenteView;
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
    private MenuItem EncerrarConta,AlterarSenha;

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
    void GerenciarEncerrarConta(ActionEvent event) {
        GerenciarEncerraView telaseguinte = new GerenciarEncerraView();
        try{
            telaseguinte.start(new Stage());
            MenuGerenteView.getStage().close();
        }catch(Exception e ){e.printStackTrace();}
    }

    @FXML
    void GerenciarSenhaConta(ActionEvent event) {
        GerenciarSenhaView telaseguinte = new GerenciarSenhaView();
        try{
            telaseguinte.start(new Stage());
            MenuGerenteView.getStage().close();
        }catch(Exception e ){e.printStackTrace();}
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
