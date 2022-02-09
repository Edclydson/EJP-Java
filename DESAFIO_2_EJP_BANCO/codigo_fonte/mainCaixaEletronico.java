
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mainCaixaEletronico extends Application{
    private static Stage stage;
    public static void main(String[] args) 
    {launch(args);}
    //ABRE TELA INICIAL DO CAIXA
    @Override
    public void start(Stage estagio) throws Exception {
        stage = estagio;
        Scene cena;
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("/DESAFIO_2_EJP_BANCO/telas/telainiciocaixa.fxml"));
        Parent root = fxmlLoader.load();
        cena = new Scene(root);
        estagio.setTitle("Escola de Jovens Programadores");
        estagio.setScene(cena);
        estagio.show();        
    }
    public static Stage getStage() {return stage;}    
}


