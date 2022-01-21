package DESAFIO_2_EJP_BANCO;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class operacoesController {

    //FALTA FAZER AS OUTRAS FUNÇOES DO CAIXA 
    @FXML
    private Button btdeposito;

    @FXML
    private Button btextrato;

    @FXML
    private Button btsair;

    @FXML
    private Button btsaque;

    @FXML
    private Button bttransferencia;

    @FXML
    void depositar(ActionEvent event) {

    }

    @FXML
    void sacar(ActionEvent event) {

    }

    @FXML
    void sair(ActionEvent event) {
        mainCaixaEletronico tela1 = new mainCaixaEletronico();
        try{
            tela1.start(mainCaixaEletronico.getStage());
            operacoes.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    @FXML
    void transferir(ActionEvent event) {

    }

    @FXML
    void verextrato(ActionEvent event) {

    }

}