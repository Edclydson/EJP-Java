import javax.swing.JOptionPane;

public class ATV15EJP 
{
    public static float compra(float valor_compra)
    {
        float valor_final;
        float desconto;
        if(valor_compra>=1500.0)
        {
            valor_final = (float)(valor_compra -(valor_compra * 0.2));
            desconto = (float)(valor_compra*0.2);
            System.out.println("Valor da compra: R$"+valor_compra);
            System.out.println("Foi aplicado o desconto de 20%");
            System.out.println("Valor do desconto: R$"+desconto);
        }
        else
        {
            valor_final = (float)(valor_compra -(valor_compra * 0.1));
            desconto = (float)(valor_compra * 0.1);
            System.out.println("Valor da compra: R$"+valor_compra);
            System.out.println("Foi aplicado o desconto de 10%");
            System.out.println("Valor do desconto: R$"+desconto);
        }
        return valor_final;
    }

    public static void main(String[] args) 
    {
        System.out.println("Valor final da compra: R$"+compra(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor da compra:"))));
    }
}
