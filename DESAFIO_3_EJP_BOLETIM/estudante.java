package DESAFIO_3_EJP_BOLETIM;

public class estudante 
{
    private String nome;
    private String signo;
    private double nota1,nota2,nota3,nota4;
    private double media;
    public void mostrarmedia()
    {
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A media do aluno "+nome+" é: "+media);
    }
     public void mostrasigno(){System.out.println("O signo do aluno "+nome+" é: "+signo);}
    public void mostraboletim(){
        System.out.println("Nota 1:"+nota1+"\nNota 2:"+nota2+"\nNota 3:"+nota3+"\nNota 4:"+nota4);
        mostrarmedia();
        mostrasigno();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSigno() {
        return signo;
    }
    public void setSigno(String signo) {
        this.signo = signo;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public double getNota4() {
        return nota4;
    }
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }   
}