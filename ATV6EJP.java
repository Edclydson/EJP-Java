import java.util.Scanner;
class areatrapezio
{
     static int calc_area_trapezio(int b_maior,int b_menor,int alt)
    {
        int area_trapezio = ((b_maior+b_menor) * alt) / 2;
        return area_trapezio;
    }
}

public class ATV6EJP 
{
    /**Faça um programa que calcula a área de
    um trapézio com os dados digitados pelo
    usuário. */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho da base maior do trapezio:");
        int b_maior = scan.nextInt();
        System.out.println("Digite o tamanho da base menor do trapezio:");
        int b_menor = scan.nextInt();
        System.out.println("Digite a altura do trapezio:");
        int alt = scan.nextInt();
        System.out.println("A area do trapezio é " +areatrapezio.calc_area_trapezio(b_maior, b_menor, alt));
        scan.close();
    }    
}
