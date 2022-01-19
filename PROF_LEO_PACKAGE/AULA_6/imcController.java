package PROF_LEO_PACKAGE.AULA_6;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class imcController {

    @FXML
    private TextField alturauser;

    @FXML
    private Button bttcalcular;

    @FXML
    private TextField pesouser;

    @FXML
    private Label seuimce;

    @FXML
    void calcimc(ActionEvent event) 
    {
        if(pesouser.getText().equals("") || alturauser.getText().equals("") || pesouser.getText().equals("0") || alturauser.getText().equals("0"))
        {
            JOptionPane.showMessageDialog(null,"Digite valores válidos!");
        }
        else
        {
        double peso = Double.parseDouble(pesouser.getText().replaceAll(",", "."));
        double altura = Double.parseDouble(alturauser.getText().replaceAll(",", "."));
        float imc = (float)(peso /  Math.pow(altura ,2));
        String res = "Seu IMC é:  " +String.format("%.2f",imc);
        seuimce.setText(res);
        }

        
    }


}