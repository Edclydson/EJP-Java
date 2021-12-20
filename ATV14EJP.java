import javax.swing.JOptionPane;

public class ATV14EJP 
{
    public String situacao_estoque(int p1, int p2,int p3,int p4)
    {
        String situacao_estoque;
        int quant_estoque = p1 + p2 + p3 + p4;
        System.out.println("----------ESTOQUE DE PRODUTOS----------");
        System.out.println("Produto 1:" +p1+"\nProduto 2:" +p2+"\nProduto 3:"+p3+"\nProduto 4:" +p4);
        System.out.println("---------------------------------------");
        System.out.println("Total:" +quant_estoque);
        if(quant_estoque >= 100)
        {
            situacao_estoque = "Estoque Normal";
            System.out.println(situacao_estoque);
        }
        else
        {
            situacao_estoque = "Estoque Baixo";
            System.out.println(situacao_estoque);
        }
        return situacao_estoque;
    }
    private static void estoque(ATV14EJP inf)
    {
       
        inf.situacao_estoque(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade do Produto 1:")),Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade do Produto 2:")), Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade do Produto 3:")), Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade do Produto 4:")));
    }
    public static void main(String[] args) 
    {
        ATV14EJP inf = new ATV14EJP(); 
        estoque(inf);
    }
}
