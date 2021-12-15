import java.util.Scanner;
class hraula
{
    
    static Object calc_hraula()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da hora trabalhada: R$");
        float valor_hr = scan.nextFloat();
        System.out.println("Digite a quantidade de horas trabalhadas:");
        int horas_trab = scan.nextInt();
        float salario = valor_hr *horas_trab;
        scan.close();
        return salario;
    }
}
public class ATV9EJP 
{
    /** 
     * Faça um programa onde o usuário digita o valor da hora aula
    de um professor e o total de horas trabalhadas no mês, ao final o programa
    calcula e mostra o seu salario
    */
    public static void main(String[] args) 
    {
        System.out.println("O salario é de: R$ "+hraula.calc_hraula() );
    }    
}
