package listadeexercicios.elevador;

/**
 * @author: EDCLYDSON SOUSA
 * 
 * Crie uma classe denominada Elevador para armazenar as informações de um elevador
    dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
    no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
    presentes nele. A classe deve também disponibilizar os seguintes métodos:
    
    Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de
    andares no prédio (os elevadores sempre começam no térreo e vazio);
    Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
    Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
    Sobe : para subir um andar (não deve subir se já estiver no último andar);
    Desce : para descer um andar (não deve descer se já estiver no térreo);

    Encapsular todos os atributos da classe (criar os métodos set e get).
 */
public class ATV20EJP {

    private int AndarAtual;
    private int TotalAndares;
    private int CapacidadeMAXElevador;
    private int PessoasNoElevador;
   
   ATV20EJP(int capacidadeElevador,int totaldeAndares)
   {
    this.PessoasNoElevador = 0;
    this.AndarAtual = 0;
    this.CapacidadeMAXElevador = capacidadeElevador;
    this.TotalAndares = totaldeAndares;
    System.out.println("Terreo");
   }

   public void entra()
   {
       if(CapacidadeMAXElevador>(PessoasNoElevador+1))
       {
            PessoasNoElevador = PessoasNoElevador + 1;
            System.out.println("Agora há "+PessoasNoElevador+ " pessoas no elevador");
        }
        else if(CapacidadeMAXElevador == (PessoasNoElevador+1))
        {
            PessoasNoElevador = PessoasNoElevador + 1;
            System.out.println("Agora há "+PessoasNoElevador+" pessoas no elevador");
            System.out.println("Elevador Lotado!");
        }
        else
        {
            System.out.println("Elevador Lotado!");
        }
    }

    public void sai()
    {
        if(CapacidadeMAXElevador == PessoasNoElevador || PessoasNoElevador < CapacidadeMAXElevador && PessoasNoElevador > 0)
       {
            PessoasNoElevador = PessoasNoElevador - 1;
            System.out.println("Agora há "+PessoasNoElevador+" pessoas no elevador");
        }
        else
        {
            System.out.println("Elevador vazio!");
        }
    }
   
    public void sobe()
    {
         if(AndarAtual>=0 && AndarAtual<TotalAndares)
        {
            AndarAtual = AndarAtual + 1;
            System.out.println("Subindo...\n");
            System.out.println(AndarAtual+" andar");
        }
        else
        {
            System.out.println("Cobertura!");
            System.out.println("Já chegamos na cobertura!");
        }
    }

    public void desce()
    {
        if(AndarAtual>0 && AndarAtual<TotalAndares)
        {
            AndarAtual = AndarAtual - 1;
            System.out.println("Descendo...\n");
            System.out.println(AndarAtual+" andar");
        }
        else
        {
            System.out.println("Terreo!");
            System.out.println("Já chegamos no terreo!");
        }
    }

    public int getAndarAtual() {
        return AndarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        AndarAtual = andarAtual;
    }
    public int getTotalAndares() {
        return TotalAndares;
    }
    public void setTotalAndares(int totalAndares) {
        TotalAndares = totalAndares;
    }
    public int getCapacidadeMAXElevador() {
        return CapacidadeMAXElevador;
    }
    public void setCapacidadeMAXElevador(int capacidadeMAXElevador) {
        CapacidadeMAXElevador = capacidadeMAXElevador;
    }
    public int getPessoasNoElevador() {
        return PessoasNoElevador;
    }
    public void setPessoasNoElevador(int pessoasNoElevador) {
        PessoasNoElevador = pessoasNoElevador;
    }

    

    
}
