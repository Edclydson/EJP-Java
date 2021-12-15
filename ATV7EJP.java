import java.util.Scanner;
class calc_custoceia
{
    static Object custo_ceia()
    {
        Scanner scan = new Scanner(System.in);
        float total = 0;
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Digite o nome da "+i+"º pessoa:");
            String nome = scan.nextLine();
            System.out.println("Digite o valor que "+nome+" colaborou: R$");
            float valor = Float.parseFloat(scan.nextLine());
            total = total + valor;
            System.out.println("\n"+nome+" contribuiu com R$ "+valor+"\n");            
        }
        scan.close();
        return total;
    }
}
public class ATV7EJP 
{
    /**A tia Marilak dividiu os custos da ceia
    natalina entre 5 pessoas. Faça um programa que
    cadastra o nome de cada pessoa e o valor em espécie de cada
    um. Ao final o programa informa o total arrecadado.
    */
    public static void main(String[] args) 
    {
        System.out.println("O total arrecadado foi de R$ "+calc_custoceia.custo_ceia());        
    }
}
