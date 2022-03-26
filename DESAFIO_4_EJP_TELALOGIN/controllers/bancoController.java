package DESAFIO_4_EJP_TELALOGIN.controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

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
     * CHAMADO NA CLASSE CADASTRO CLIENTE CONTROLLER
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
        catch (SQLException erro) {JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");}
    }

    /**
     * 
     * @param cpf
     * @param conta
     * CPF E CONTA PARA CADASTRO DE NOVA CONTA CORRENTE, PARTINDO DO PONTO QUE O CLIENTE
     * JÁ TENHA SIDO CADASTRADO NO 
     * CHAMADO DENTRO DO METODO CONSULTA CADASTRO CPF NO BANCO CONTROLLER
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
        catch(SQLException e){JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");}
    }
    
    /**
     * 
     * @param cpf
     * @param conta
     * CPF E CONTA PARA CADASTRO DE NOVA CONTA POUPANÇA, PARTINDO DO PONTO QUE O CLIENTE
     * JÁ TENHA SIDO CADASTRADO NO BANCO
     * CHAMADO DENTRO DO METODO CONSULTA CADASTRO CPF NO BANCO CONTROLLER
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
        catch(SQLException e){JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");}
    }

    /**
     * 
     * @param cpf
     * @param conta
     * VERIFICAÇÃO REALIZADA PARA SABER SE O CPF INFORMADO TEM OU NÃO CADASTRO NO BANCO
     * SE SIM ELE ABRE A CONTA 
     * CASO CONTRÁRIO O MESSAGE DIALOG DISPARA
     * CHAMADO NA CLASSE CADASTRO CONTA CONTROLLER
     */
    public void consultaCadastroCPF(String cpf,Conta conta){
        String sql = "SELECT cpf_cliente FROM cliente_tb WHERE cpf_cliente=?;";
        ResultSet rsDAO;
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
        catch(SQLException erro){JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");}
    }

    /**
     * 
     * @param cpf
     * @param nome
     * CONSULTA SIMPLES REALIZADA PELO GERENTE
     * CHAMADA DENTRO DA CLASSE GERENCIAR SENHA CONTROLLER
     */
    public boolean consultaGerente(String cpf){
        String sql = "SELECT * FROM cliente_tb WHERE cpf_cliente = ?;";
        ResultSet rsDAO;
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            rsDAO = pstm.executeQuery();
            if(rsDAO.next()) {
                EmAtendimento.setNomeCliente(rsDAO.getString("nome"));
                EmAtendimento.setEndereço(rsDAO.getString("endereco_cliente"));
                EmAtendimento.setTelefone(rsDAO.getString("telefone_cliente"));
                GerenciarClienteController.nome = EmAtendimento.getNomeCliente();
                GerenciarClienteController.endereco = EmAtendimento.getEndereço();
                GerenciarClienteController.telefone = EmAtendimento.getTelefone();
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null,"CPF informado não consta na base de dados!");
            }
            pstm.close();
        }
        catch(SQLException erro){JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");}
        return false;
    }

    /**
     * 
     * @param cpf
     * @param nome
     * @param endereco
     * @param telefone
     * ATUALIZAÇÃO DE DADOS REALIZADA PELO GERENTE
     * CHAMADO DENTRO DA CLASSE GERENCIAR SENHA CONTROLLER
     */
    public void alteraGerente(String cpf,String nome, String endereco, String telefone){
        String atualizacao = "UPDATE cliente_tb SET nome = ?,endereco_cliente = ?, telefone_cliente = ? WHERE cpf_cliente = ?;";
        try{
            pstm = conn.prepareStatement(atualizacao);
            pstm.setString(1,nome);
            pstm.setString(2, endereco);
            pstm.setString(3, telefone);
            pstm.setString(4, cpf);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");}
        JOptionPane.showMessageDialog(null,"Cadastro Atualizado!");
    }

    /**
     * 
     * @param cpf
     * REMOÇAO DO CLIENTE SE NAO HOUVER MAIS CONTAS ABERTAS VINCULADAS AO SEU CPF
     * CHAMADO NO GERENCIAR CLIENTE CONTROLLER
     */
     public void removeGerente(String cpf){
        String remocao = "DELETE FROM cliente_tb  WHERE cpf_cliente = ?;";
        String verificacao = "SELECT * FROM conta_tb WHERE cpf_cliente_titular = ?;";
        try{
            pstm = conn.prepareStatement(verificacao);
            pstm.setString(1,cpf);
            rsDAO = pstm.executeQuery();
            if(rsDAO.next()){
                JOptionPane.showMessageDialog(null,"O cliente não poderá ser excluído sem antes encerrar as contas!");
            }
            else{
                pstm = conn.prepareStatement(remocao);
                pstm.setString(1,cpf);
                pstm.execute();
                JOptionPane.showMessageDialog(null,"Cliente foi removido da base de dados com sucesso!");
            }
        }catch(SQLException e){JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");}
    }


    /**
     * 
     * @param cpf
     * CONSULTA SIMPLES REALIZADA ANTES DE INICIAR O ATENDIMENTO OPERACIONAL
     * CHAMADO NA CLASSE MENU INICIAR ATENDIMENTO OPERACIONAL CONTROLLER
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
        catch(SQLException erro){JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");}
    }

    /**
     * 
     * @param cpf
     * METODO RESPONSAVEL POR VERIFICAR A SITUAÇAO DO CLIENTE ANTES DO ATENDIMENTO
     * E ATRIBUIR VALORES AS VARIAVEIS DA CLASSE CONTA
     * CHAMADO NO METODO CONSULTA CADASTRO CPF NO BANCO CONTROLLER
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
     * CHAMADO NA CLASSE MENU OPERACIONAL CONTROLLER
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
        catch(SQLException e){JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");}
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
     * CHAMADO NA CLASSE SAQUE CONTROLLER
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
            if(saldoConta < Double.parseDouble(valorSaque)){
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
        catch(SQLException e){JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");}
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
     * CHAMADO NA CLASSE MENU OPERACIONAL CONTROLLER
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
        catch(SQLException e){JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");}

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


    /**
     * 
     * @param nome
     * @param cargo
     * @param salario
     * METODO QUE GERA AS CREDENCIAIS DO COLABORADOR E VERIFICA NO BANCO
     * SE HA REDUNDANCIA, PARA DEPOIS REGISTRAR NA BASE DE DADOS
     * CHAMADO DENTRO DA CLASSE CADASTRO COLABORADOR CONTROLLER
     */
    public void cadastraColaborador(String nome,String cargo, String salario){
        String MatriculaGerada = geraMatricula();
        String userNovo = "";
        String senhaNova = "";
        Random geraSenha = new Random();
        do{
            if(cargo.equals("RH")){
                userNovo = "rec"+MatriculaGerada.substring(10, 14);
                senhaNova = String.valueOf(geraSenha.nextInt(0000,9999));
            }
            else if(cargo.equals("Gerente")){
                userNovo = "ger"+MatriculaGerada.substring(10, 14);
                senhaNova = String.valueOf(geraSenha.nextInt(0000,9999));
            }
            else{
                userNovo = "opr"+MatriculaGerada.substring(10, 14);
                senhaNova = String.valueOf(geraSenha.nextInt(0000,9999));
            }
            // VERIFICA SE EXISTE ALGUMA CREDENCIAL IGUAL
            try{
                String verificaCredencial = "SELECT user_funcionario FROM funcionario_tb WHERE user_funcionario = ?;";
                pstm = conn.prepareStatement(verificaCredencial);
                pstm.setString(1, userNovo);
                rsDAO = pstm.executeQuery();
                if(rsDAO.next()){
                    if(cargo.equals("RH")){
                        userNovo = "rec"+MatriculaGerada.substring(0, 4);
                        senhaNova = String.valueOf(geraSenha.nextInt(0000,9999));
                    }
                    else if(cargo.equals("Gerente")){
                        userNovo = "ger"+MatriculaGerada.substring(0, 4);
                        senhaNova = String.valueOf(geraSenha.nextInt(0000,9999));
                    }
                    else{
                        userNovo = "opr"+MatriculaGerada.substring(0, 4);
                        senhaNova = String.valueOf(geraSenha.nextInt(0000,9999));
                    }
                }
                else{break;}
            }catch(SQLException e){JOptionPane.showMessageDialog(null,"Gerando novas credenciais..");}
        }while(true);
        try {
            String registraColaborador = "INSERT INTO funcionario_tb VALUES(?,?,?,?,?,?);";
            pstm = conn.prepareStatement(registraColaborador);
            pstm.setString(1,nome);
            pstm.setString(2,MatriculaGerada);
            pstm.setString(3,userNovo);
            pstm.setString(4,senhaNova);
            pstm.setString(5,salario);
            pstm.setString(6,cargo);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");}
        finally{JOptionPane.showMessageDialog(null,"Colaborador cadastrado na base de dados\n Dados de Acesso:\nUsuario: "+userNovo+"\nSenha: "+senhaNova);}
    }

    /**
     * 
     * @return
     * FUNÇAO PARA GERAR O NUMERO DA MATRICULA DO FUNCIONARIO
     * CHAMADA DENTRO DO METODO CADASTRA COLABORADOR NO BANCO CONTROLLER
     */
    public String geraMatricula(){
        Random geradorMatricula = new Random();
        String novaMatricula;
        do{
            int part1 = geradorMatricula.nextInt(0000001,9999998);
            int part2 = geradorMatricula.nextInt(0000001,9999998);
    
             novaMatricula = String.valueOf(part1)+String.valueOf(part2);
            
            try{
                String validaMatricula = "SELECT matricula_funcionario FROM funcionario_tb WHERE matricula_funcionario = ?;";
                pstm = conn.prepareStatement(validaMatricula);
                pstm.setString(1,novaMatricula);
                rsDAO = pstm.executeQuery();
                if(rsDAO.next()){
                    continue;
                }
                else{
                    break;
                }
            }
            catch(SQLException e){JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");}
        }while(true);
        return novaMatricula;
    }

    /**
     * 
     * @param cpf
     * METODO PARA BUSCAR CONTA PELO CPF DO TITULAR
     * CHAMADO NA CLASSE DE GERENCIAR SENHA CONTROLLER
     */
    public void buscaContaCPF(String cpf){
        try{
            String buscaConta = "SELECT * FROM conta_tb WHERE cpf_cliente_titular = ?;";
            pstm = conn.prepareStatement(buscaConta);
            pstm.setString(1,cpf);
            rsDAO = pstm.executeQuery();
                while(rsDAO.next()){
                    GerenciarSenhaController.numConta = rsDAO.getString("num_conta");
                    GerenciarSenhaController.senha = rsDAO.getString("senha");
                }

                String buscaTitular = "SELECT nome FROM cliente_tb WHERE cpf_cliente = ?;";
                pstm = conn.prepareStatement(buscaTitular);
                pstm.setString(1, cpf);
                rsDAO = pstm.executeQuery();
                while(rsDAO.next()){
                    GerenciarSenhaController.nomeTitular = rsDAO.getString("nome");
                }
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"Houve um problema com sua requisição:");}
    }
    
     /**
     * 
     * @param cpf
     * METODO PARA BUSCAR CONTA PELO CPF DO TITULAR
     * CHAMADO NA CLASSE DE GERENCIAR ENCERRA CONTROLLER
     */
    public void buscaEncerraContaCPF(String cpf){
        try{
            String buscaConta = "SELECT * FROM conta_tb WHERE cpf_cliente_titular = ?;";
            pstm = conn.prepareStatement(buscaConta);
            pstm.setString(1,cpf);
            rsDAO = pstm.executeQuery();
                while(rsDAO.next()){
                    GerenciarEncerraController.numConta = rsDAO.getString("num_conta");
                    GerenciarEncerraController.saldo = rsDAO.getString("saldo");
                }

                String buscaTitular = "SELECT nome FROM cliente_tb WHERE cpf_cliente = ?;";
                pstm = conn.prepareStatement(buscaTitular);
                pstm.setString(1, cpf);
                rsDAO = pstm.executeQuery();
                while(rsDAO.next()){
                    GerenciarEncerraController.nomeTitular = rsDAO.getString("nome");
                }
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"Houve um problema com sua requisição:");}
    }

    /**
     * 
     * @param numConta
     * METODO PARA BUSCAR CONTA PELO NUMERO DA CONTA
     * CHAMADO NA CLASSE DE GERENCIAR SENHAS CONTROLLER
     */
    public void buscaContaNumConta(String numConta){
        String cpf ="";
        try{
            String buscaConta = "SELECT * FROM conta_tb WHERE num_conta = ?;";
            pstm = conn.prepareStatement(buscaConta);
            pstm.setString(1,numConta);
            rsDAO = pstm.executeQuery();
                while(rsDAO.next()){
                    cpf = rsDAO.getString("cpf_cliente_titular");
                    GerenciarSenhaController.numConta = rsDAO.getString("num_conta");
                    GerenciarSenhaController.senha = rsDAO.getString("senha");
                }
                
                String buscaTitular = "SELECT nome FROM cliente_tb WHERE cpf_cliente = ?;";
                pstm = conn.prepareStatement(buscaTitular);
                pstm.setString(1, cpf);
                rsDAO = pstm.executeQuery();
                while(rsDAO.next()){
                    GerenciarSenhaController.nomeTitular = rsDAO.getString("nome");
                }
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"Houve um problema com sua requisição:");}
    }

    /**
     * 
     * @param numConta
     * METODO PARA BUSCAR CONTA PELO NUMERO DA CONTA
     * CHAMADO NA CLASSE DE GERENCIAR ENCERRA CONTROLLER
     */
    public void buscaEncerraConta(String numConta){
        String cpf ="";
        try{
            String buscaConta = "SELECT * FROM conta_tb WHERE num_conta = ?;";
            pstm = conn.prepareStatement(buscaConta);
            pstm.setString(1,numConta);
            rsDAO = pstm.executeQuery();
                while(rsDAO.next()){
                    cpf = rsDAO.getString("cpf_cliente_titular");
                    GerenciarEncerraController.numConta = rsDAO.getString("num_conta");
                    GerenciarEncerraController.saldo = rsDAO.getString("saldo");
                }
                
                String buscaTitular = "SELECT nome FROM cliente_tb WHERE cpf_cliente = ?;";
                pstm = conn.prepareStatement(buscaTitular);
                pstm.setString(1, cpf);
                rsDAO = pstm.executeQuery();
                while(rsDAO.next()){
                    GerenciarEncerraController.nomeTitular = rsDAO.getString("nome");
                }
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,"Houve um problema com sua requisição:");}
    }

    /**
     * 
     * @param numeroConta
     * @param novaSenha
     * METODO PARA ALTERAR A SENHA DA CONTA BANCARIA DO CLIENTE
     * CHAMADO NA CLASSE GERENCIAR SENHA CONTROLLER
     */
    public void alteraSenha(String numeroConta, String novaSenha){
        try {
            String sql = "UPDATE conta_tb SET senha = ? WHERE num_conta = ?;";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, novaSenha);
            pstm.setString(2, numeroConta);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
        }
        catch (SQLException e) {JOptionPane.showMessageDialog(null,"Houve um problema com sua requisição:");}        
    }

    /**
     * 
     * @param numeroConta
     * @param senhaGerente
     * METODO PARA ENCERRAR A CONTA DO CLIENTE
     * CHAMADO NA CLASSE GERENCIAR ENCERRA CONTROLLER
     */
    public void encerraConta(String numeroConta, String senhaGerente){
        try {
            String authGerente = "SELECT password_funcionario FROM funcionario_tb WHERE password_funcionario = ?;";
            pstm = conn.prepareStatement(authGerente);
            pstm.setString(1,senhaGerente);
            rsDAO = pstm.executeQuery();
            if(rsDAO.next()){
                String fechamentoConta = "delete from conta_tb where num_conta = ?;";
                pstm = conn.prepareStatement(fechamentoConta);
                pstm.setString(1, numeroConta);
                pstm.execute();
                JOptionPane.showMessageDialog(null,"Conta Encerrada com sucesso!");
            }
            else{JOptionPane.showMessageDialog(null,"Senha Incorreta!");}
        }
        catch (SQLException e) {JOptionPane.showMessageDialog(null,"Ocorreu um erro!");}
    }

    /**
     * 
     * @param matriculaColaborador
     * METODO CHAMADO NA CLASSE BUSCAR COLABORADOR CONTROLLER
     */
    public void buscaColaborador(String matriculaColaborador){
        try {
            String busca = "SELECT * FROM funcionario_tb WHERE matricula_funcionario = ?;";
            pstm = conn.prepareStatement(busca);
            pstm.setString(1,matriculaColaborador);
            rsDAO = pstm.executeQuery();
            while(rsDAO.next()){
                BuscarColaboradorController.nomeColaborador = rsDAO.getString("nome_funcionario");
                BuscarColaboradorController.LoginColaborador = rsDAO.getString("user_funcionario");
                BuscarColaboradorController.SenhaColaborador = rsDAO.getString("password_funcionario");
                BuscarColaboradorController.SalarioColaborador = rsDAO.getString("salario_funcionario");
                BuscarColaboradorController.CargoColaborador = rsDAO.getString("cargo_funcionario");
                BuscarColaboradorController.MatriculaColaborador = rsDAO.getString("matricula_funcionario");
            }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");
        }
    }

    /**
     * 
     * @param matricula
     * @param login
     * @param senha
     * @param salario
     * @param cargo
     * METODO CHAMADO NA CLASSE BUSCA COLABORADOR CONTROLLER
     */
    public void alterarColaborador(String matricula,String login,String senha,String salario,String cargo){
        if(matricula.equals("")){
            JOptionPane.showMessageDialog(null,"Para alterar é necessário informar uma matricula!");
        }
        else{
            try {
                String alteracoes = "UPDATE funcionario_tb SET user_funcionario = ?,password_funcionario = ?,salario_funcionario = ?,cargo_funcionario = ? WHERE matricula_funcionario = ?;";
                pstm = conn.prepareStatement(alteracoes);
                pstm.setString(1, login);
                pstm.setString(2, senha);
                pstm.setString(3, salario);
                pstm.setString(4, cargo);
                pstm.setString(5, matricula);
                pstm.execute();
                BuscarColaboradorController.nomeColaborador = "";
                BuscarColaboradorController.LoginColaborador = "";
                BuscarColaboradorController.SenhaColaborador = "";
                BuscarColaboradorController.SalarioColaborador = "";
                BuscarColaboradorController.CargoColaborador = "";
                BuscarColaboradorController.MatriculaColaborador = "";
                JOptionPane.showMessageDialog(null,"Colaborador alterado com sucesso!");
            } 
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");
            }
        }
    }

    /**
     * 
     * @param matricula
     * METODO CHAMADO NA CLASSE BUSCAR COLABORADOR CONTROLLER
     */
    public void removeColaborador(String matricula){
        if(matricula.equals("")){
            JOptionPane.showMessageDialog(null,"Para remover é necessário informar uma matricula!");
        }
        else{
            try {
                String remover = "DELETE FROM funcionario_tb WHERE matricula_funcionario = ?;";
                pstm = conn.prepareStatement(remover);
                pstm.setString(1, matricula);
                pstm.execute();
                BuscarColaboradorController.nomeColaborador = "";
                BuscarColaboradorController.LoginColaborador = "";
                BuscarColaboradorController.SenhaColaborador = "";
                BuscarColaboradorController.SalarioColaborador = "";
                BuscarColaboradorController.CargoColaborador = "";
                BuscarColaboradorController.MatriculaColaborador = "";
                JOptionPane.showMessageDialog(null,"Colaborador foi removido com sucesso!");
            } 
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Houve um problema com a requisição!");
            }
        }
    }
}