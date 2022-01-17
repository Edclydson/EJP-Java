package PROF_LEO_PACKAGE.AULA_5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button btogin;

    @FXML
    private TextField camposenha;

    @FXML
    private TextField campousuario;

    @FXML
    void logar(ActionEvent event) {
        String usuario = campousuario.getText();
        String senha = camposenha.getText();

        if(usuario.equals("admin") && senha.equals("123"))
        {
            System.out.println("Login feito com sucesso!");
        }
        else
        {
            System.out.println("Errou!");
        }
    }

}
