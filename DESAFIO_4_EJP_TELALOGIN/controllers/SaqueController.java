package DESAFIO_4_EJP_TELALOGIN.controllers;

import DESAFIO_4_EJP_TELALOGIN.src.Cliente;
import DESAFIO_4_EJP_TELALOGIN.views.MenuOperadorView;
import DESAFIO_4_EJP_TELALOGIN.views.SaqueOutroValorView;
import DESAFIO_4_EJP_TELALOGIN.views.SaqueView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SaqueController {

    @FXML
    private Button btEncerrar;

    @FXML
    private Button btsacar100;

    @FXML
    private Button btsacar150;

    @FXML
    private Button btsacarOutroValor;

    @FXML
    private Button btsaque50;
    
    bancoController dbControl = new bancoController();
    
    @FXML
    void sacar100(ActionEvent event) {
        dbControl.sacar("100.0", Cliente.getCpfCliente());
    }
    
    @FXML
    void sacar150(ActionEvent event) {
        dbControl.sacar("150.0", Cliente.getCpfCliente());
    }
    
    @FXML
    void sacar50(ActionEvent event) {
        dbControl.sacar("50.0", Cliente.getCpfCliente());
    }
    
    @FXML
    void sacarOutroValor(ActionEvent event) {
        SaqueOutroValorView telaseguinte = new SaqueOutroValorView();
        try{
            telaseguinte.start(new Stage());
            SaqueView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }
   
    @FXML
    void Encerrar(ActionEvent event) {
        MenuOperadorView telaanterior = new MenuOperadorView();
        try{
            telaanterior.start(new Stage());
            SaqueView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }
}