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
        scan.close();
    }
    
}
