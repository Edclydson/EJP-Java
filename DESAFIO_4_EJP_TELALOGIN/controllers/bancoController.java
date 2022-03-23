package DESAFIO_4_EJP_TELALOGIN.controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DESAFIO_4_EJP_TELALOGIN.src.Cliente;
import DESAFIO_4_EJP_TELALOGIN.src.Conta;
import DESAFIO_4_EJP_TELALOGIN.src.conexaodb;
import DESAFIO_4_EJP_TELALOGIN.views.DepositoView;
import DESAFIO_4_EJP_TELALOGIN.views.MenuOperadorView;
import DESAFIO_4_EJP_TELALOGIN.views.SaqueOutroValorView;
import DESAFIO_4_EJP_TELALOGIN.views.SaqueView;
import DESAFIO_4_EJP_TELALOGIN.views.TransferenciaView;
import javafx.stage.Stage;


/**
 * @author:Edclydson Sousa
 */
public class bancoController {

    Connection conn = new conexaodb().conecta_banco();
    PreparedStatement pstm,pstm2;
    ResultSet rsDAO;
    Conta operandoConta1;
    Cliente EmAtendimento = new Cliente();
    /**
     * 
     * @param novoCliente
     * Classe onde as informações do cliente ficam
     * 
     * @param contaNova
     * Classe onde as informações da conta aberta pelo cliente ficam
     */
    public void cadastracliente(Cliente novoCliente, Conta contaNova){
        String sql = "INSERT INTO cliente_tb (nome,cpf_cliente,endereco_cliente,telefone_cliente) VALUES (?,?,?,?);";
        conn = new conexaodb().conecta_banco();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, novoCliente.getNomeCliente());
            pstm.setString(2, Cliente.getCpfCliente());
            pstm.setString(3, novoCliente.getEndereço());
            pstm.setString(4, novoCliente.getTelefone());
            pstm.execute();
            pstm.close();

            if(contaNova.getTipoDaConta().equals("CC")){
                cadastraContaCorrente(Cliente.getCpfCliente(), contaNova);
            }
            else{
                cadastraContaPoupanca(Cliente.getCpfCliente(),contaNova);
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
        String sql = "SELECT * FROM cliente_tb WHERE cpf_cliente=? AND nome=?;";
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

    /**
     * 
     * @param cpf
     * CONSULTA SIMPLES REALIZADA ANTES DE INICIAR O ATENDIMENTO OPERACIONAL
     */
    public void consultaCadastroCPF(String cpf){
        String sql = "SELECT * FROM cliente_tb WHERE cpf_cliente=?;";
        conn = new conexaodb().conecta_banco();
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            rsDAO = pstm.executeQuery();
            if(rsDAO.next()) {
                //CHAMA METODO PARA INICIAR OPERAÇÃO NA CONTA DO CLIENTE
                IniciaOperacaoContaCliente(cpf);
            }
            else{JOptionPane.showMessageDialog(null,"CPF informado não consta na base de dados!");}
        }
        catch(SQLException erro){JOptionPane.showMessageDialog(null,"bancoController "+ erro);}
    }

    /**
     * 
     * @param cpf
     * METODO RESPONSAVEL POR VERIFICAR A SITUAÇAO DO CLIENTE ANTES DO ATENDIMENTO
     * E ATRIBUIR VALORES AS VARIAVEIS DA CLASSE CONTA
     */
    public void IniciaOperacaoContaCliente(String cpf){
        Conta operandoConta = new Conta();
        try{
            String sql = "SELECT * FROM conta_tb WHERE cpf_cliente_titular = ?;";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            rsDAO = pstm.executeQuery();
            while(rsDAO.next()){
                operandoConta.setNumeroDaConta(rsDAO.getString("num_conta"));
                operandoConta.setSaldo(Double.parseDouble(rsDAO.getString("saldo")));
                operandoConta.setSenha(rsDAO.getString("senha"));
            }
            operandoConta1 = operandoConta;
            pstm.close();
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"bancoController "+e);}
    }

    /**
     * 
     * @param numeroConta
     * @param valorDeposito
     * METODO QUE REALIZA O DEPOSITO NA CONTA INFORMADA
     * ainda não solicita a senha para realizar a operação
     */
    public void depositar(String numeroConta,String valorDeposito){
        Conta contaDeposito = new Conta();
        String cpf_titular_conta_destino = "";
        Double saldoConta = 0.0;
        contaDeposito.setSaldo(contaDeposito.getSaldo()+Double.parseDouble(valorDeposito));
        try{
            String puxaCPF = "SELECT cpf_cliente_titular,saldo FROM conta_tb WHERE num_conta = ?;";
            pstm = conn.prepareStatement(puxaCPF);
            pstm.setString(1, numeroConta);
            rsDAO = pstm.executeQuery();
            while(rsDAO.next()){
                cpf_titular_conta_destino = rsDAO.getString("cpf_cliente_titular");
                saldoConta = Double.parseDouble(rsDAO.getString("saldo"));
            }
            pstm.close();
            saldoConta += Double.parseDouble(valorDeposito);
            String Deposito = "UPDATE conta_tb SET saldo = ? WHERE num_conta = ? AND cpf_cliente_titular = ?;";
            pstm = conn.prepareStatement(Deposito);
            pstm.setString(1, String.valueOf(saldoConta));
            pstm.setString(2, numeroConta);
            pstm.setString(3, cpf_titular_conta_destino);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null,"Deposito foi realizado com sucesso!");
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"bancoController "+e);}
        finally{
            MenuOperadorView telaanterior = new MenuOperadorView();
            try{
                telaanterior.start(new Stage());
                DepositoView.getStage().close();
            }
            catch(Exception e){e.printStackTrace();}
        }
    }

    /**
     * 
     * @param valorSaque
     * @param cpf
     * METODO QUE REALIZA SAQUE NA CONTA 
     * ainda não solicita a senha para realizar a operação
     */
    public void sacar(String valorSaque, String cpf){
        Double saldoConta = 0.0;
        try{
            String puxaSaldo = "SELECT saldo FROM conta_tb WHERE cpf_cliente_titular = ?;";
            pstm = conn.prepareStatement(puxaSaldo);
            pstm.setString(1, Cliente.getCpfCliente());
            rsDAO = pstm.executeQuery();
            while(rsDAO.next()){
                saldoConta = Double.parseDouble(rsDAO.getString("saldo"));
            }
            pstm.close();
            if(saldoConta <= 0.0){
                JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
            }
            else{
                saldoConta -= Double.parseDouble(valorSaque);
                String Saque = "UPDATE conta_tb SET saldo = ? WHERE cpf_cliente_titular = ?;";
                pstm = conn.prepareStatement(Saque);
                pstm.setString(1, String.valueOf(saldoConta));
                pstm.setString(2, cpf);
                pstm.execute();
                pstm.close();
                JOptionPane.showMessageDialog(null,"Saque Autorizado!");
            }
        }
        catch(SQLException e){}
        finally{
            MenuOperadorView telaanterior = new MenuOperadorView();
            try{
                telaanterior.start(new Stage());
                SaqueView.getStage().close();
                SaqueOutroValorView.getStage().close();
            }
            catch(Exception e){e.printStackTrace();}
        }
    }
    
    /**
     * 
     * @param numeroContaDestino
     * @param valorTransferencia
     * METODO QUE REALIZA TRANSFERENCIA ENTRE AS CONTAS
     * ainda não solicita a senha para realizar a operação
     */
    public void transferir(String numeroContaDestino, String valorTransferencia){
        String cpfDestino = "",  saldoContaDestino =""; //, nomeDestino = "", tipoContaDestino = "";
        Double saldoContaOrigem = 0.0;
        try{
            String sql = "SELECT * FROM conta_tb WHERE cpf_cliente_titular = ?;";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, Cliente.getCpfCliente());
            rsDAO = pstm.executeQuery();
            while(rsDAO.next()){
                saldoContaOrigem = Double.parseDouble(rsDAO.getString("saldo"));
            }
        }
        catch(Exception e){e.printStackTrace();}

        if(saldoContaOrigem <= 0.0 || Double.parseDouble(valorTransferencia) > saldoContaOrigem){
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
        }
        else{
            try {
                String sqlContaorigem = "UPDATE conta_tb SET saldo = ? WHERE cpf_cliente_titular = ?;";
                String sqlContadestino = "UPDATE conta_tb SET saldo = ? WHERE cpf_cliente_titular = ?;";
                String sqlPuxaCpfDestino = "SELECT cpf_cliente_titular,tipo_conta,saldo FROM conta_tb WHERE num_conta = ?;";
                pstm = conn.prepareStatement(sqlPuxaCpfDestino);
                pstm.setString(1, numeroContaDestino);
                rsDAO = pstm.executeQuery();
                while(rsDAO.next()){
                    cpfDestino = rsDAO.getString("cpf_cliente_titular");
                    saldoContaDestino = rsDAO.getString("saldo");
                   
                   /* if(rsDAO.getString("tipo_conta").equals("CC")){
                        tipoContaDestino = "Conta Corrente";
                    }else{tipoContaDestino = "Conta Poupança";}*/
                }
                //RETIRANDO DA CONTA ORIGEM
                pstm = conn.prepareStatement(sqlContaorigem);
                pstm.setString(1, String.valueOf(saldoContaOrigem - Double.parseDouble(valorTransferencia)));
                pstm.setString(2, Cliente.getCpfCliente());
                pstm.execute();

                //ATRIBUINDO A CONTA DESTINO
                pstm = conn.prepareStatement(sqlContadestino);
                pstm.setString(1, String.valueOf(Double.parseDouble(saldoContaDestino) + Double.parseDouble(valorTransferencia)));
                pstm.setString(2, cpfDestino);
                pstm.execute();
                
                pstm.close();
                JOptionPane.showMessageDialog(null,"Transferencia realizada com sucesso!");
                
                /*
                pstm = conn.prepareStatement("SELECT nome FROM cliente_tb WHERE cpf_cliente = ?");
                pstm.setString(1, cpfDestino);
                rsDAO = pstm.executeQuery();
                while(rsDAO.next()){
                    nomeDestino = rsDAO.getString("nome");
                }
                pstm.close();
                */


            }
            catch (Exception e) {e.printStackTrace();}
            finally{
                try{
                    MenuOperadorView telaseguinte = new MenuOperadorView();
                    telaseguinte.start(new Stage());
                    TransferenciaView.getStage().close();
                }
                catch(Exception e){e.printStackTrace();}
            }
        }
    }

    public void extrato(){JOptionPane.showMessageDialog(null,"Aguarde a impressão do seu extrato!");}

}