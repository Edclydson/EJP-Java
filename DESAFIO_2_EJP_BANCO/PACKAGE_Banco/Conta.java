package PACKAGE_Banco;

import javax.swing.JOptionPane;

public class Conta 
{
    static String id_Conta;
    static float Saldo_Conta;    
    
    public String getId_Conta() {
        return id_Conta;
    }
    public static void setId_Conta(String id_conta) {
        id_Conta = id_conta;
    }
    public float getSaldo_Conta() {
        return Saldo_Conta;
    }
    public static void setSaldo_Conta(float saldo_conta) {
        Saldo_Conta = saldo_conta;
    }

    public static void Sacar()
    {
        float valorsaque;
        valorsaque = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor que quer sacar! Ex: R$ 100.0"));
        if(valorsaque>Saldo_Conta)
        {
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente!");
        }
        else
        {
            Saldo_Conta = Saldo_Conta - valorsaque;
            System.out.println("Transação autorizada!");
            Extrato();
        }
    }
    public static void Depositar()
    {
        float valordeposito;
        String num_conta;
        valordeposito = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor que quer depositar! Ex: R$ 100.0"));
        num_conta = JOptionPane.showInputDialog(null,"Digite o numero da conta do beneficiário:");
        if(valordeposito<=0)
        {
            JOptionPane.showMessageDialog(null,"Não é possivel depositar o valor informado!");
        }
        else
        {
            id_Conta = num_conta;
            Saldo_Conta = Saldo_Conta + valordeposito;
            System.out.println("Transação realizada!");
            Extrato();
        }
    }
    ///TERMINAR METODO TRANSFERIR
    /// ADD NUMERO CONTA P TRANSFERIR
    /// ADD CHECAR SE A CONTA EXISTE
    
    public static void Transferir()
    {
        float valortransferencia;
        String num_conta_transfere;
        String num_conta_transferida;

        num_conta_transfere = JOptionPane.showInputDialog(null, "Digite o numero da sua conta:");
        valortransferencia = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor que quer transferir! Ex: R$ 100.0"));
        num_conta_transferida = JOptionPane.showInputDialog(null, "Digite o numero da conta beneficiaria:");
        if(valortransferencia>Saldo_Conta)
        {
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente!");
        }
        else
        {
            Saldo_Conta = Saldo_Conta - valortransferencia;
            System.out.println("Transação autorizada!");
            Extrato();
        }
    }

    public static void Extrato()
    {
        System.out.println("Saldo restante da conta: R$"+Saldo_Conta);
    }
}

