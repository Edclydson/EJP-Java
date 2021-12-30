import javax.swing.JOptionPane;

public class ATV16EJP 
{
    // PEDRA PAPEL E TESOURA    
    // IF ELSE
    public static void main(String[] args) 
    {
        
        String joga = JOptionPane.showInputDialog(null, "Pedra, Papel ou Tesoura:");
        if(joga.equals("pedra"))
        {
            JOptionPane.showMessageDialog(null,"Você jogou pedra!");
        }
        else if(joga.equals("papel"))
        {
            JOptionPane.showMessageDialog(null,"Você jogou papel!");
        }
        else if(joga.equals("tesoura"))
        {
            JOptionPane.showMessageDialog(null,"Você jogou tesoura!");
        }
    }
}
