package DESAFIO_4_EJP_TELALOGIN.views;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuHoraExtraView extends Application {
    private static Stage stage;
    public static void main(String[] args)
    {launch(args);}
    //TELA CALCULO HORA EXTRA
    @Override
    public void start(Stage estagio) throws Exception
    {
        stage = estagio;
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("../modelos/telahoraextra.fxml"));
        Parent root = fxmlLoader.load();
        Scene cena = new Scene(root);
        estagio.setTitle("Banco EJP");
        estagio.setScene(cena);
        estagio.setResizable(false);
        estagio.show();
    }    
    public static Stage getStage()
    {return stage;}    
}
