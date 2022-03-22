package DESAFIO_4_EJP_TELALOGIN.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TransferenciaController {

    @FXML
    private Button btProximo;

    @FXML
    private Button btEncerrar;

    @FXML
    private Button btVoltar;

    @FXML
    private TextField txtNumeroConta;

    @FXML
    private TextField txtValorTransferencia;

    @FXML
    void proximo(ActionEvent event) {
        bancoController dbControl = new bancoController();
        dbControl.transferir(String.valueOf(txtNumeroConta.getText()), String.valueOf(txtValorTransferencia.getText()));
        
    }

    @FXML
    void Encerrar(ActionEvent event) {

    }

    @FXML
    void Voltar(ActionEvent event) {

    }


}
