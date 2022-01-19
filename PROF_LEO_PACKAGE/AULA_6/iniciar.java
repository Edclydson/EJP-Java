package PROF_LEO_PACKAGE.AULA_6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class iniciar extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage estagio) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("imc.fxml"));
        Parent root = fxmlLoader.load();
        Scene cena = new Scene(root);
        estagio.setTitle("Escola de Jovens Programadores");
        estagio.setScene(cena);
        estagio.show();
    }
}



    