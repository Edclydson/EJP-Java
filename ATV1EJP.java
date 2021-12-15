import java.util.Scanner;

public class ATV1EJP 
{
    // PROGRAMA 1
    /*faça um programa que realiza o produto de dois numeros e mostra
    o resultado */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);   
        System.out.println("Digite o primeiro numero: ");
	    int a = scan.nextInt();
	    System.out.println("Digite o segundo numero: ");
		int b = scan.nextInt();
		System.out.println("O produto da soma é: "+(a+b));
        scan.close();
	}    
}
