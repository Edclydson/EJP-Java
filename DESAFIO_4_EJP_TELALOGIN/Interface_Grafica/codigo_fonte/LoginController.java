import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * @author:Edclydson Sousa
 */
public class LoginController {

    @FXML
    private Button bttEntrar;

    @FXML
    private ImageView imglogin;

    @FXML
    private TextField txtLogn;

    @FXML
    private PasswordField txtSenha;

    /**
     * 
     * @param event
     * Evento responsavel por checar/realizar/negar o login do usuario
     */
    @FXML
    void Logar(ActionEvent event) {
        try {
            loginDTO dto = new loginDTO();
            dto.setLogin(txtLogn.getText());
            dto.setSenha(txtSenha.getText());
            
            funcionarioDAO dao = new funcionarioDAO();
            ResultSet rsDAO = dao.authLogin(dto);

            if(rsDAO.next()) {
                MenuView telaseguinte = new MenuView();
                try{
                telaseguinte.start(new Stage());
                LoginView.getStage().close();
                }
                catch(Exception e){e.printStackTrace();}
            } 
            else {
                JOptionPane.showMessageDialog(null,"Usuario e Senha inválidos!");
            }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"LoginController "+e);
        }
    }
}
