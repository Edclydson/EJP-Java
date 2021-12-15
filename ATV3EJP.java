import java.util.Scanner;
public class ATV3EJP 
{
    // PROGRAMA 3
    /*Criar um programa onde seja digitado o ano atual,
     o ano que a pessoa nasceu e o programa calcula e 
     mostra  a sua idade atual */
    public static void main(String[] args) 
    {
         Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ano atual:");
        int ano_atual = scan.nextInt();
        System.out.println("Digite o ano de nascimento:");
        int ano_nascimento = scan.nextInt();
        System.out.println("A sua idade é: "+ (ano_atual-ano_nascimento) +" anos");
        scan.close();
    }    
}
