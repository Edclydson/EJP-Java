package DESAFIO_4_EJP_TELALOGIN.controllers;

import DESAFIO_4_EJP_TELALOGIN.src.Cliente;
import DESAFIO_4_EJP_TELALOGIN.src.Conta;
import DESAFIO_4_EJP_TELALOGIN.views.CadastroClienteView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuGerenteView;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;



public class CadastroClienteController implements Initializable{

    private String[] tipoconta = {"Conta Corrente","Conta Poupança"};
    Cliente novoCliente = new Cliente();
    Conta contaNova = new Conta();
    
    @FXML
    private ImageView imgNovoCliente;

    @FXML
    private Label LabelEJP,labelCPF, 
                labelTipoConta, labelSenhaNovoCliente,
                labelSaldoInicial, labelNomeCompleto;
    @FXML
    private ChoiceBox<String> ChoiceboxTipoConta;

    @FXML
    private Button bttVoltar,bttCadastrar,bttLimpar;
    
    @FXML
    private TextField txtSaldoInicial,txtCPFNovoCliente,txtNomeNovoCliente;

    @FXML
    private PasswordField txtSenhaNovoCliente;

    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        ChoiceboxTipoConta.setValue(tipoconta[0]);
        ChoiceboxTipoConta.getItems().addAll(tipoconta);
        ChoiceboxTipoConta.setOnAction(ActionEvent -> {
            if(ChoiceboxTipoConta.getValue().equals("Conta Poupança"))
            {
                txtSaldoInicial.setText("R$0.0");
                txtSaldoInicial.setDisable(true);}
            else{
                txtSaldoInicial.setText("");
                txtSaldoInicial.setDisable(false);} });
    }

    @FXML
    void Cadastrar(ActionEvent event) 
    {
        bttCadastrar.setOnAction(ActionEvent -> {
            checacampos(txtNomeNovoCliente.getText(), txtCPFNovoCliente.getText(),ChoiceboxTipoConta.getValue(),
                                txtSaldoInicial.getText(), txtSenhaNovoCliente.getText());
            bancoController bdControl = new bancoController();
            bdControl.cadastracliente(novoCliente, contaNova);
        });
    }

    @FXML
    void LimparCampos(ActionEvent event) 
    {
        bttLimpar.setOnAction(ActionEvent -> {
            txtNomeNovoCliente.setText("");
            txtCPFNovoCliente.setText("");
            ChoiceboxTipoConta.setValue(tipoconta[0]);
            txtSaldoInicial.setText("");
            txtSenhaNovoCliente.setText("");
        });
    }

    @FXML
    void Voltar(ActionEvent event) 
    {
        MenuGerenteView telaanterior = new MenuGerenteView();
        try{
            telaanterior.start(new Stage());
            CadastroClienteView.getStage().close();
        }catch(Exception e){e.printStackTrace();}
    }

    public void checacampos(String campoNome, String campoCPF, String campoTipoConta ,String campoSaldoInicial, String campoSenha)
    {
        if(campoNome.equals("") || campoCPF.equals("") || campoSaldoInicial.equals("") || campoSenha.equals(""))
        {
            JOptionPane.showMessageDialog(null,"O preenchimento de todos os campos é obrigatório!");
        }else if(campoCPF.length() != 11)
        {
            JOptionPane.showMessageDialog(null,"O campo CPF deve possuir 11 caracteres numéricos!");
        }
        else
        {
            Random rand = new Random();
            novoCliente.setNomeCliente(campoNome);
            novoCliente.setCpfCliente(campoCPF);
            contaNova.setSaldo(Double.parseDouble(campoSaldoInicial));
            contaNova.setSenha(campoSenha);
            if(campoTipoConta.equals("Conta Poupança"))
            {contaNova.setNumeroDaConta(String.valueOf(rand.nextInt(100000,999999)));}
            else
            {contaNova.setNumeroDaConta(String.valueOf(rand.nextInt(10000000,99999999)));}
        }
    }
    
}
