package views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Objetivo: cadastro de clientes e contas bancarias permitindo a otimização dos processos de um banco.
 */

public class LoginView extends Application{
    private static Stage stage;
    public static void main(String[] args)
    {launch();}
    //TELA LOGIN
    @Override
    public void start(Stage estagio) throws Exception
    {
        stage = estagio;
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("../modelos/telalogin.fxml"));
        Parent root = fxmlLoader.load();
        Scene cena = new Scene(root);
        estagio.setTitle("Sistema de Gerenciamento Bancário");
        estagio.setScene(cena);
        estagio.setResizable(false);
        estagio.show();
    }    
    public static Stage getStage()
    {return stage;}    
}