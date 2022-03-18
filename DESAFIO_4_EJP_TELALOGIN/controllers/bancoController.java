package DESAFIO_4_EJP_TELALOGIN.controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DESAFIO_4_EJP_TELALOGIN.src.Cliente;
import DESAFIO_4_EJP_TELALOGIN.src.Conta;
import DESAFIO_4_EJP_TELALOGIN.src.conexaodb;


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
    public void cadastracliente(Cliente novoCliente, Conta contaNova){
        String sql = "INSERT INTO cliente_tb (nome,cpf_cliente) VALUES (?,?);";
        conn = new conexaodb().conecta_banco();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, novoCliente.getNomeCliente());
            pstm.setString(2, novoCliente.getCpfCliente());
            pstm.execute();
            pstm.close();

            if(contaNova.getTipoDaConta().equals("CC")){
                cadastraContaCorrente(novoCliente.getCpfCliente(), contaNova);
            }
            else{
                cadastraContaPoupanca(novoCliente.getCpfCliente(),contaNova);
            }
            
            JOptionPane.showMessageDialog(null,"Cliente foi cadastrado com sucesso!");

        } 
        catch (Exception erro) {JOptionPane.showMessageDialog(null,"bancoController "+ erro);}
    }

    /**
     * 
     * @param cpf
     * @param conta
     * CPF E CONTA PARA CADASTRO DE NOVA CONTA CORRENTE, PARTINDO DO PONTO QUE O CLIENTE
     * JÁ TENHA SIDO CADASTRADO NO BANCO
     */
    public void cadastraContaCorrente(String cpf, Conta conta){
        String sql = "INSERT INTO conta_tb (cpf_cliente_titular,num_conta,tipo_conta,saldo,senha) VALUES (?,?,?,?,?);";
        conn = new conexaodb().conecta_banco();
        try{
            pstm2 = conn.prepareStatement(sql);
            pstm2.setString(1, cpf);
            pstm2.setString(2, conta.getNumeroDaConta());
            pstm2.setString(3, conta.getTipoDaConta());
            pstm2.setString(4, String.valueOf(conta.getSaldo()));
            pstm2.setString(5, conta.getSenha());
            pstm2.execute();
            pstm2.close();

            JOptionPane.showMessageDialog(null,"Uma nova conta vinculada ao cpf: "+cpf+" foi registrada com sucesso!");
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"bancoController "+ e);}
    }
    
    /**
     * 
     * @param cpf
     * @param conta
     * CPF E CONTA PARA CADASTRO DE NOVA CONTA POUPANÇA, PARTINDO DO PONTO QUE O CLIENTE
     * JÁ TENHA SIDO CADASTRADO NO BANCO
     */
    public void cadastraContaPoupanca(String cpf, Conta conta){
        String sql = "INSERT INTO conta_tb (cpf_cliente_titular,num_conta,tipo_conta,saldo,senha) VALUES (?,?,?,?,?);";
        conn = new conexaodb().conecta_banco();
        try{
            pstm2 = conn.prepareStatement(sql);
            pstm2.setString(1, cpf);
            pstm2.setString(2, conta.getNumeroDaConta());
            pstm2.setString(3, conta.getTipoDaConta());
            pstm2.setString(4, String.valueOf(conta.getSaldo()));
            pstm2.setString(5, conta.getSenha());
            pstm2.execute();
            pstm2.close();

            JOptionPane.showMessageDialog(null,"Uma nova conta vinculada ao cpf: "+cpf+" foi registrada com sucesso!");
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"bancoController "+ e);}
    }

    /**
     * 
     * @param cpf
     * @param conta
     * VERIFICAÇÃO REALIZADA PARA SABER SE O CPF INFORMADO TEM OU NÃO CADASTRO NO BANCO
     * SE SIM ELE ABRE A CONTA 
     * CASO CONTRÁRIO O MESSAGE DIALOG DISPARA
     */
    public void consultaCadastroCPF(String cpf,Conta conta){
        String sql = "SELECT cpf_cliente FROM cliente_tb WHERE cpf_cliente=?;";
        ResultSet rsDAO;
        conn = new conexaodb().conecta_banco();
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            rsDAO = pstm.executeQuery();
            if(rsDAO.next()){
             //CADASTRA NOVA CONTA  
                if(conta.getTipoDaConta().equals("CC")) {
                    cadastraContaCorrente(cpf, conta);
                }
                else{
                    cadastraContaPoupanca(cpf, conta);
                }
            }
            else{JOptionPane.showMessageDialog(null,"CPF informado não possui cadastro na base de dados!");}
        }
        catch(SQLException erro){JOptionPane.showMessageDialog(null,"bancoController "+ erro);}
    }

    /**
     * 
     * @param cpf
     * @param nome
     * CONSULTA SIMPLES REALIZADA PELO GERENTE
     */
    public void consultaCadastroCPF(String cpf, String nome){
        String sql = "SELECT * FROM cliente_tb WHERE cpf_cliente=? and nome=?;";
        ResultSet rsDAO;
        conn = new conexaodb().conecta_banco();
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            pstm.setString(2, nome);
            rsDAO = pstm.executeQuery();
            if(rsDAO.next()) {JOptionPane.showMessageDialog(null,"Nome e CPF informados constam na base de dados!");}
            else{
                //PARA CONSULTA DO GERENTE
            }
        }
        catch(SQLException erro){JOptionPane.showMessageDialog(null,"bancoController "+ erro);}
    }
}