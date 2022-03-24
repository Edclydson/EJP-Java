package DESAFIO_4_EJP_TELALOGIN.controllers;

import DESAFIO_4_EJP_TELALOGIN.views.GerenciarClienteView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuGerenteView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GerenciarClienteController {

    static String cpf = "", nome = "",endereco = "", telefone = "";
    bancoController dbcontrol = new bancoController();

    @FXML
    private Label LabelEJP1;

    @FXML
    private Button bttAtualizar,bttBuscar,bttRemover,bttVoltar;

    @FXML
    private Label labelCPF,labelEndereco,labelNomeCompleto,labelTelefone;
    
    @FXML
    private TextField txtCPFBusca,txtEnderecoCliente,txtNomeCliente,txtTelefoneCliente;

    @FXML
    void Buscar(ActionEvent event) {
        if(dbcontrol.consultaGerente(txtCPFBusca.getText().toString())){
            txtEnderecoCliente.setText(endereco);
            txtNomeCliente.setText(nome);
            txtTelefoneCliente.setText(telefone);
            ativaBtt();
        }
        else{}        
    }

    @FXML
    void Atualizar(ActionEvent event) {
        dbcontrol.alteraGerente(
            txtCPFBusca.getText().toString(),
            txtNomeCliente.getText().toString(), 
            txtEnderecoCliente.getText().toString() ,
            txtTelefoneCliente.getText().toString());
    }

    @FXML
    void Remover(ActionEvent event) {
        dbcontrol.removeGerente(txtCPFBusca.getText());
        txtCPFBusca.setText("");
        txtNomeCliente.setText("");
        txtEnderecoCliente.setText("");
        txtTelefoneCliente.setText("");
    }

    @FXML
    void Voltar(ActionEvent event) {
        MenuGerenteView telaanterior = new MenuGerenteView();
        try{
            telaanterior.start(new Stage());
            GerenciarClienteView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    public void ativaBtt(){
        bttAtualizar.setDisable(false);
        bttRemover.setDisable(false);
    }

}
