package views;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuIniciarAtendimentoOperacionalView extends Application{
    private static Stage stage;
    public static void main(String[] args)
    {launch(args);}
    //TELA INICIAL DO ATENDIMENTO OPERACIONAL
    @Override
    public void start(Stage estagio) throws Exception
    {
        stage = estagio;
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("../modelos/telainiciaratendimentooperacional.fxml"));
        Parent root = fxmlLoader.load();
        Scene cena = new Scene(root);
        estagio.setTitle("Atendimento - Sistema de Gerenciamento Bancário");
        estagio.setScene(cena);
        estagio.setResizable(false);
        estagio.show();
    }    
    public static Stage getStage()
    {return stage;}    
}