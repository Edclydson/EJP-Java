import java.util.Scanner;
public class ATV4EJP 
{
    // PROGRAMA 4
    /*Crie um programa que simula a compra de um produto
        em uma loja. Deve-se ter o preço do produto, valor que uma 
        pessoa tem para pagar e o programa calcula e mostra seu 
        troco */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        float valor_produto = scan.nextFloat();
        System.out.println("Digite o valor da quantia recebida:");
        float quantia_recebida = scan.nextFloat();
        System.out.println("O troco é de: R$" +(quantia_recebida-valor_produto));
     
    }    
}
