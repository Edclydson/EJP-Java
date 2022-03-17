package controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import src.Cliente;
import src.Conta;
import src.conexaodb;


/**
 * @author:Edclydson Sousa
 */
public class bancoController {
/**
 * 
 * CLASSE QUE VAI CADASTRAR ALTERAR E EXCLUIR OS DADOS
 * FALTA CRIAR CLASSES CLIENTE E CONTA >>>> COPIAR CLASSES DO PROJETO BOOTCAMP GFT
 * 
 */
    Connection conn;
    PreparedStatement pstm,pstm2;
    /**
     * 
     * @param novoCliente
     * Classe onde as informações do cliente ficam
     * 
     * @param contaNova
     * Classe onde as informações da conta aberta pelo cliente ficam
     */
    public void cadastracliente(Cliente novoCliente, Conta contaNova)
    {
        String sql = "INSERT INTO cliente_tb (nome,cpf_cliente) VALUES (?,?);";
        String sql2 = "INSERT INTO conta_tb (cpf_cliente_titular,num_conta,tipo_conta,saldo,senha) VALUES (?,?,?,?,?);";

        conn = new conexaodb().conecta_banco();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, novoCliente.getNomeCliente());
            pstm.setString(2, novoCliente.getCpfCliente());

            pstm.execute();
            pstm.close();

            pstm2 = conn.prepareStatement(sql2);
            pstm2.setString(1, novoCliente.getCpfCliente());
            pstm2.setString(2, contaNova.getNumeroDaConta());
            pstm2.setString(3, contaNova.getTipoDaConta());
            pstm2.setString(4, String.valueOf(contaNova.getSaldo()));
            pstm2.setString(5, contaNova.getSenha());
            
            pstm2.execute();
            pstm2.close();

            JOptionPane.showMessageDialog(null,"Cliente foi cadastrado com sucesso!");

        } 
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"bancoController "+ erro);
        }
    }
}