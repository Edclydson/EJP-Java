import java.util.Scanner;
public class ATV2EJP 
{   
    // PROGRAMA 2
    /* Criar um programa onde sejam informados a base
        e altura  de um retangulo  e o programa  calcula e mostra
        a sua area*/
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a altura do retangulo:");
        int altura = scan.nextInt();
        System.out.println("Digite a base do retangulo:");
        int base = scan.nextInt();
        System.out.println("A área do retangulo é: "+base * altura); 
        scan.close();  
    }    
}
