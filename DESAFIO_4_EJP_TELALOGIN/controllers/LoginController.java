package DESAFIO_4_EJP_TELALOGIN.controllers;
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
import DESAFIO_4_EJP_TELALOGIN.src.funcionarioDAO;
import DESAFIO_4_EJP_TELALOGIN.src.loginDTO;
import DESAFIO_4_EJP_TELALOGIN.views.*;


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
        funcionarioDAO dao = new funcionarioDAO();
        ResultSet rsDAO;
        try {
            loginDTO dto = new loginDTO();
            dto.setLogin(txtLogn.getText());
            dto.setSenha(txtSenha.getText());
            
            if(dto.getLogin().contains("rec")){
                
                 rsDAO = dao.authLogin(dto);
    
                if(rsDAO.next()) {
                    MenuRecrutadorView telaseguinte = new MenuRecrutadorView();
                    try{
                        telaseguinte.start(new Stage());
                        LoginView.getStage().close();
                    }
                    catch(Exception e){e.printStackTrace();}
                } 
            }

            else if(dto.getLogin().contains("ger")){
                rsDAO = dao.authLogin(dto);
                if(rsDAO.next()) {
                    MenuGerenteView telaseguinte = new MenuGerenteView();
                    try{
                        telaseguinte.start(new Stage());
                        LoginView.getStage().close();
                    }                        
                        catch(Exception e){e.printStackTrace();}
                } 
                else {JOptionPane.showMessageDialog(null,"Usuario e Senha inválidos!");}
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
