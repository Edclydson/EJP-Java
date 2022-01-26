package banco;

import java.io.IOException;
import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) throws IOException{
        Conta novaconta = new Conta();
        novaconta.setTitular("Edclydson Sousa");
        novaconta.setSaldo(10000.00);
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor do saque: R$");
        novaconta.sacar(scan.nextDouble());
        System.out.println(novaconta.getTitular()+ "\nSeu saldo é "+novaconta.getSaldo());

        Conta outraconta = new Conta();
        outraconta.setTitular("Elisa Barros");
        System.out.println("Valor da transferencia:");
        transferir(novaconta, outraconta);

        scan.close();
    }
    
    public static void transferir(Conta minhaConta, Conta outraConta)
    {
        Scanner scan = new Scanner(System.in);
        double transferencia = scan.nextDouble();
        if(minhaConta.sacar(transferencia)==false)
        {
            System.out.println("Saldo insuficiente");
        }
        else
        {
            outraConta.setSaldo(outraConta.getSaldo()+transferencia);
            System.out.println("Você transferiu "+transferencia);
        }
        scan.close();
    }
}
