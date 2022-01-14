package PROF_LEO_PACKAGE.AULA_3;

import javax.swing.JOptionPane;

public class ATVEJP_05 
{
    public static void soma(int n1, int n2)
    {
        int n_1 = n1;
        int n_2 = n1;
        int total = n_1 + n_2;
        System.out.println("A soma de "+n_1+" mais "+n_2+" é igual a "+total);
    }
    public static void subtracao(double n1,double n2)
    {
        double n_1 = n1;
        double n_2 = n1;
        if(n_1 <= 0 || n_2 <= 0)
        {
            JOptionPane.showMessageDialog(null,"Não é possivel realizar a divisão!");
        }else
        {
            double total = n_1 - n_2;
            System.out.println(n_1+" menos "+n_2+" é igual a "+total);
        }
    }
    public static void multiplicacao(double n1, double n2)
    {
        double n_1 = n1;
        double n_2 = n1;
        double total = n_1 * n_2;
        System.out.println(+n_1+" multiplicado por "+n_2+" é igual a "+total);
    }
    public static void divisao(double n1, double n2)
    {
        double n_1 = n1;
        double n_2 = n1;
        if(n_1 <= 0 || n_2 <= 0)
        {
            JOptionPane.showMessageDialog(null,"Não é possivel realizar a divisão!");
        }
        else
        {
            double total = n_1 / n_2;
            System.out.println(n_1+" dividido por "+n_2+" é igual a "+total);
        }
    }
    public static void main(String[] args)
    {
        //calculadora
        String op = JOptionPane.showInputDialog(null,"Qual operação deseja realizar? +  -  *  /");
        switch(op)
        {
            case "+":
            {
                soma(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro numero:")), Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o segundo numero:")));
            }
            case "-":
            {
                subtracao(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro numero:")), Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o segundo numero:")));
            }
            case "*":
            {
                multiplicacao(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro numero:")),Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o segundo numero:")));
            }
            case "/":
            {
                divisao(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro numero:")), Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o segundo numero:")));
            }
            default:
            {
                JOptionPane.showMessageDialog(null,"Informe uma operação válida!");
            }
        }
    }
}
