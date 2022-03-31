package controllers;


import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import views.CadastroColaboradorView;
import views.MenuRecrutadorView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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
        txtNomeCompleto.setText("");
        txtSalario.setText("");
        ChoiceBoxCargo.setValue(Cargos[0]);
    }

    @FXML
    void Voltar(ActionEvent event) {
        MenuRecrutadorView telaanterior = new MenuRecrutadorView();
        try{
            telaanterior.start(new Stage());
            CadastroColaboradorView.getStage().close();
        }
        catch(Exception e){}

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
