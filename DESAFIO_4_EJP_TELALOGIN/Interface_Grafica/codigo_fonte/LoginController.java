
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;

public class LoginController {

    @FXML
    private Button bttEntrar;

    @FXML
    private TextField txtLogn;

    @FXML
    private PasswordField txtSenha;

    @FXML
    void Logar(ActionEvent event) {
        if(txtLogn.getText().equals("admin") && txtSenha.getText().equals("admin123"))
        {
            MenuView telaseguinte = new MenuView();
        try{
            telaseguinte.start(new Stage());
            LoginView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
        }
        else{JOptionPane.showMessageDialog(null,"Acesso Negado!");}
    }

}
