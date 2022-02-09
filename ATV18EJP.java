import java.util.Scanner;

public class ATV18EJP
{
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite o numero:");
        int num = numero.nextInt();
        System.out.println("Tabuada de " +num);
        for(int indice =0;indice<10;indice++){
            System.out.println(num +" X "+indice+" = "+(num*indice));
        }
        numero.close();
    }
}