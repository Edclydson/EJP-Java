package DESAFIO_4_EJP_TELALOGIN.views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BuscarColaboradorView extends Application
{
    private static Stage stage;
    public static void main(String[] args)
    {launch(args);}
    //TELA BUSCA COLABORADOR
    @Override
    public void start(Stage estagio) throws Exception
    {
        stage = estagio;
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("../modelos/telabuscacolaborador.fxml"));
        Parent root = fxmlLoader.load();
        Scene cena = new Scene(root);
        estagio.setTitle("Buscar Colaborador - Sistema de Gerenciamento Bancário");
        estagio.setScene(cena);
        estagio.show();
    }    
    public static Stage getStage()
    {return stage;}    
    
}