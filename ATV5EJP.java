import java.util.Scanner;
class saliquido
{
    static Object calc_salario_liq(String nome ,float sal_brt)
    {
        float sal_liq = (float) (sal_brt - (sal_brt * 0.05));
        return sal_liq;
    }
}
public class ATV5EJP 
{
    /**Criar um programa onde o usuario digita o seu nome,
     * salario bruto e o programa calcula o seu salario liquido
     * que será o bruto menos o desconto. Sabe-se que o desconto 
     * será de 5% do salario bruto
     */
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite o valor do seu salario bruto: ");
        float salario_brt = scan.nextFloat();
        System.out.println("O salario liquido dx funcionarie "+nome+" é de R$ "+saliquido.calc_salario_liq(nome, salario_brt));
        scan.close();

    }    
}
