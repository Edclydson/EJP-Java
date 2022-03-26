package DESAFIO_4_EJP_TELALOGIN.controllers;

import javax.swing.JOptionPane;

import DESAFIO_4_EJP_TELALOGIN.views.BuscarColaboradorView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuRecrutadorView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarColaboradorController {


    static String nomeColaborador = "",LoginColaborador = "",SenhaColaborador = "",SalarioColaborador = "",CargoColaborador = "", MatriculaColaborador = "";
    bancoController dbControl = new bancoController();
    
    @FXML
    private MenuItem Sair;

    @FXML
    private VBox Janela;

    @FXML
    private Label LabelEJP,lblMatricula;

    @FXML
    private TextField txtBuscaMatriculaColaborador,txtCargoColaborador,txtLoginColaborador,
                            txtNomeColaborador,txtSalarioColaborador,txtSenhaColaborador;

    @FXML
    private Button bttBuscar,bttAlterar,bttRemover,bttVoltar;

    @FXML
    private ImageView imgNovoColaborador,imgbanco;
    
    @FXML
    void Buscar(ActionEvent event) {
        campoVazio(txtBuscaMatriculaColaborador.getText().toString());
        txtNomeColaborador.setText(nomeColaborador);
        txtNomeColaborador.setEditable(false);
        txtLoginColaborador.setText(LoginColaborador);
        txtSenhaColaborador.setText(SenhaColaborador);
        txtSalarioColaborador.setText(SalarioColaborador);
        txtCargoColaborador.setText(CargoColaborador);
    }

    public void campoVazio(String matricula){
        if(matricula.equals("")){
            JOptionPane.showMessageDialog(null,"Campo da Matricula não pode ficar vazio!");
        }
        else{
            dbControl.buscaColaborador(txtBuscaMatriculaColaborador.getText().toString());
        }
    }

    @FXML
    void AlterarColaborador(ActionEvent event) {
        dbControl.alterarColaborador(MatriculaColaborador, txtLoginColaborador.getText().toString(),
         txtSenhaColaborador.getText().toString(), txtSalarioColaborador.getText().toString(), txtCargoColaborador.getText().toString());
        txtBuscaMatriculaColaborador.setText("");
        txtNomeColaborador.setText("");
        txtLoginColaborador.setText("");
        txtSenhaColaborador.setText("");
        txtSalarioColaborador.setText("");
        txtCargoColaborador.setText("");
    }
    @FXML
    void RemoverColaborador(ActionEvent event) {
        dbControl.removeColaborador(MatriculaColaborador);
        txtBuscaMatriculaColaborador.setText("");
        txtNomeColaborador.setText("");
        txtLoginColaborador.setText("");
        txtSenhaColaborador.setText("");
        txtSalarioColaborador.setText("");
        txtCargoColaborador.setText("");
    }

    @FXML
    void Voltar(ActionEvent event) {
        MenuRecrutadorView telaanterior = new MenuRecrutadorView();
        try {
            telaanterior.start(new Stage());
            BuscarColaboradorView.getStage().close();
        } catch (Exception e) {}

    }
}