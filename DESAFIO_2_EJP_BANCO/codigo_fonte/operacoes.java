package DESAFIO_2_EJP_BANCO.codigo_fonte;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class operacoes extends Application
{
    private static Stage stage;
    public static void main(String[] args)
    {launch(args);}
    //TELA OPERACOES
    @Override
    public void start(Stage estagio) throws Exception
    {
        stage = estagio;
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("/DESAFIO_2_EJP_BANCO/telas/telaoperacoes.fxml"));
        Parent root = fxmlLoader.load();
        Scene cena = new Scene(root);
        estagio.setTitle("Escola de Jovens Programadores");
        estagio.setScene(cena);
        estagio.show();
    }    
    public static Stage getStage()
    {return stage;}    
    
}
