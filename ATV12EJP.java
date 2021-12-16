import javax.swing.JOptionPane;
class Par
{
    public String testaparidade(int num)
    {
        if(num%2==0)
        {
            return "numero par";
        }
        else
        {
            return "numero impar";
        }
    }
}
public class ATV12EJP 
{
    public static void main(String[] args) 
    {
        Par testapar = new Par();
        System.out.println(testapar.testaparidade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero 1"))));
        System.out.println(testapar.testaparidade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero 2"))));
        System.out.println(testapar.testaparidade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero 3"))));        
    }
}
