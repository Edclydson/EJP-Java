import java.util.Scanner;
public class ATV8EJP 
{
    /**Criar um programa que calcula e mostra quanto uma pessoa
    deverá gastar no seu carro com gasolina para se deslocar de
    uma cidade A para uma cidade B nas festas de final de ano.
    consumo
    preço
    distancia
    valor */    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a distancia entre a Cidade A e a Cidade B:");
        int distancia = Integer.parseInt(scan.nextLine());
        System.out.println("Digite qual o consumo do carro:");
        int consumo = Integer.parseInt(scan.nextLine());
        System.out.println("Informe o valor atual da gasolina");
        float preco_gasolina = Float.parseFloat(scan.nextLine());
        float gasto = (distancia/consumo)*preco_gasolina;
        System.out.println("O gasto vai ser no valor de R$"+gasto);
        scan.close();
    }
}
