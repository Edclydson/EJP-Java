import javax.swing.JOptionPane;

public class ATV17EJP 
{
    // PEDRA PAPEL E TESOURA
    // SWITCH
    
    public static void main(String[] args) 
    {
        String joga = JOptionPane.showInputDialog(null, "Pedra, Papel ou Tesoura:");
        switch(joga)
        {
            case "pedra":
            {
                JOptionPane.showMessageDialog(null,"Você jogou pedra!");
                break;
            }
            case "papel":
            {
                JOptionPane.showMessageDialog(null,"Você jogou papel!");
                break;
            }
            case "tesoura":
            {
                JOptionPane.showMessageDialog(null,"Você jogou tesoura!");
                break;
            }
            default:
            {
                JOptionPane.showMessageDialog(null,"Opção Inválida!");
            }
        }
    }
}
