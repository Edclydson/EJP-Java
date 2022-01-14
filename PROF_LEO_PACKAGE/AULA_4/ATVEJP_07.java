package PROF_LEO_PACKAGE.AULA_4;

import javax.swing.JOptionPane;

public class ATVEJP_07 
{
    public static void main(String[] args) 
    {
        String login = "admin";
        String senha = "1234";

        String l = JOptionPane.showInputDialog(null,"Login:");
        String s = JOptionPane.showInputDialog(null,"Senha:");

        if(l.equals(login) && s.equals(senha) || l.equals("root") && s.equals(senha))
        {
            JOptionPane.showMessageDialog(null,"Acesso Liberado!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Acesso Negado!");
        }
    }    
}
