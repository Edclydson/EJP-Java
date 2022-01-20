package DESAFIO_2_EJP_BANCO;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mainCaixaEletronico extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage estagio) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("telainiciocaixa.fxml"));
        Parent root = fxmlLoader.load();
        Scene cena = new Scene(root);
        estagio.setTitle("Escola de Jovens Programadores");
        estagio.setScene(cena);
        estagio.show();
    }
}


