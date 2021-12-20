import javax.swing.JOptionPane;

public class ATV13EJP 
{
    public String medialuno(float n1,float n2,float n3,float n4) // METODO PARA CALCULAR MEDIA DO ALUNO
    {
        String msg;
        float mediafinal = (n1+n2+n3+n4)/4;
        System.out.println("----------BOLETIM ESCOLAR----------");
        System.out.println("Nota 1:" +n1+"\nNota 2:" +n2+"\nNota 3:"+n3+"\nNota 4:" +n4);
        System.out.println("-----------------------------------");
        System.out.println("Media Final:" +mediafinal);
        if (mediafinal>=7.0){msg = "Aluno Aprovado!";}
        else{msg = "Aluno Reprovado!";}
        return msg;
    }
    private static void consulta(ATV13EJP calc_med, String nomealuno) //FUNÇÃO PARA CHAMAR METODO
    {
        JOptionPane.showMessageDialog(null,"Situação alunx "+nomealuno+": "+calc_med.medialuno(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a 1º nota")),Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a 2º nota")),Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a 3º nota")),Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a 4º nota"))));
    }
    public static void main(String[] args) 
    {
        ATV13EJP calc_med = new ATV13EJP();
        String nomealuno = JOptionPane.showInputDialog(null, "Digite o nome do aluno:");
        consulta(calc_med, nomealuno);
    }

}
