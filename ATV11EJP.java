import javax.swing.JOptionPane;
class Calc
{
    public float media(float nota1, float nota2)
    {
        float mediafinal = (nota1 + nota2) /2;
        return mediafinal;
    }
}
public class ATV11EJP {
    public static float nota1;
    public static float nota2;
    public static float media;
    
    public static void main(String[] args) 
    {
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a primeira nota:"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a segunda nota:"));
        Calc calcmedia = new Calc();
        System.out.println("A media final do aluno foi "+calcmedia.media(nota1,nota2));
        if(calcmedia.media(nota1,nota2)>= 7)
        {
            JOptionPane.showMessageDialog(null,"Aluno Aprovado! Parabéns!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Aluno Reprovado! Busque se esforçar mais!");
        }
    }
}
