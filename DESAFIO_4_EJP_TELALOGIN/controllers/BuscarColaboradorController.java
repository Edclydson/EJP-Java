package DESAFIO_4_EJP_TELALOGIN.controllers;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class BuscarColaboradorController {


    @FXML
    private MenuItem Sair;

    @FXML
    private VBox Janela;

    @FXML
    private Label LabelEJP,lblMatricula;

    @FXML
    private TextField txtMatriculaColaborador;

    @FXML
    private Button bttBuscar;

    @FXML
    private ImageView imgNovoColaborador,imgbanco;
    
    @FXML
    void Buscar(ActionEvent event) {
        campoVazio(txtMatriculaColaborador.getText().toString());
    }

    @FXML
    void BuscarColaborador(ActionEvent event) {}

    public void campoVazio(String matricula){
        if(matricula.equals("") || matricula.equals(null)){
            JOptionPane.showMessageDialog(null,"Campo da Matricula não pode ficar vazio!");
        }
        else{

        }
    }
}