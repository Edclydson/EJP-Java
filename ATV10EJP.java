import java.util.Scanner;
class compra
{
    static Object dadoscompra()
    {
        float total_compra = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do cliente:");
        String nome_comprador = scan.nextLine();
        System.out.println("Informe o nome do produto:");
        String nome_produto = scan.nextLine();
        System.out.println("Informe a quantidade comprada do produto:");
        int quant_produto =Integer.parseInt( scan.nextLine());
        System.out.println("Insira o valor unitário do produto:");
        float valor_produto = Float.parseFloat(scan.nextLine());
        total_compra =valor_produto * quant_produto;
        scan.close();
        System.out.println("Nome Cliente:"+nome_comprador+"\n Produto adquirido: "+nome_produto);
        System.out.println("Quantidade adquirida: "+quant_produto+"\n Preço unitário: R$"+valor_produto);
        return total_compra;
    }
}
public class ATV10EJP 
{
 /**
  * Escreva um programa para uma loja que imprima os dados de uma compra.
    Quando o programa é executado, deve-se fornecer os seguintes dados:

    • Nome do comprador
    • Produto adquirido
    • Quantidade adquirida
    • Preço unitário do produto

    Ao final o programa calcula e mostra o total da compra bem como mostra
     também todos os dados digitados. */   
    public static void main(String[] args) 
    {
        System.out.println("O total da compra do cliente foi de: R$ "+compra.dadoscompra());
    }
 }
