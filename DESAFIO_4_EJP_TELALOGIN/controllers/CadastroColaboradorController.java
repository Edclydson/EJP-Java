package DESAFIO_4_EJP_TELALOGIN.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class CadastroColaboradorController implements Initializable{

    private String[] Cargos = {"RH","Gerente","Atendente"};

    @FXML
    private ChoiceBox<String> ChoiceBoxCargo;

    @FXML
    private VBox Janela;

    @FXML
    private Label LabelEJP1,labelNovaConta,lblNomeCompleto,lblCargo,lblSalario;

    @FXML
    private Button bttRegistrar,bttVoltar;

    @FXML
    private TextField txtNomeCompleto,txtSalario;

    @Override
    public void initialize(URL location,ResourceBundle resources){
        ChoiceBoxCargo.getItems().addAll(Cargos);
        ChoiceBoxCargo.setValue(Cargos[0]);
    }

    @FXML
    void Registrar(ActionEvent event) {
        checacampos(txtNomeCompleto.getText().toString(), ChoiceBoxCargo.getValue(), txtSalario.getText().toString());
    }

    @FXML
    void Voltar(ActionEvent event) {

    }

    public void checacampos(String nome, String cargo, String salario){
        if(nome.equals("") || salario.equals("")){
            JOptionPane.showMessageDialog(null,"Existem campos vazios!");
        }
        else{
            try{
                Double salarioNumerico = Double.parseDouble(salario);
                if(salarioNumerico.isNaN() == false && salarioNumerico > 0.0){
                    bancoController dbControl = new bancoController();
                    dbControl.cadastraColaborador(nome, cargo, salario);
                }
                else{JOptionPane.showMessageDialog(null,"Informe um valor de salário válido!");}
            }
            catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"Informe um valor de salário válido!");}
        }
    }

}
