import java.math.BigDecimal;

public class ATV19EJP {
    static String nomeFuncionario = "Edclydson Sousa";
    static BigDecimal salario = new BigDecimal(3000.00);

    public static void main(String[] args) 
    {
        System.out.println("Nome do Funcionario: "+nomeFuncionario);
        System.out.println("Salário: R$"+salario+"\n");
        
        calculovt(salario);
        FGTS(salario);
        horaExtra(salario);
        falta(salario,3);
        salariofamilia(salario,2);
        insalubridade(salario, "Med");
    }


    public static void calculovt(BigDecimal salario) 
    {
        double valorPassagem = 3.90;
        int qtdConducoes = 2;
        int diasTrabalhados = 5;
        System.out.println("------------------DESCONTO VALE TRANSPORTE------------------");
        double valorsemana = (valorPassagem * qtdConducoes)* diasTrabalhados;
        System.out.println("Custo de passagens por semana: R$"+valorsemana);
        System.out.println("Custo de passagens por mês: R$"+valorsemana*4);
        double porcDescontada = Double.valueOf(salario.toString()) * 0.06;
        System.out.println("O desconto de 6% será o valor de: R$"+porcDescontada+"\n");
    }
    public static void FGTS(BigDecimal salario)
    {
        double valorFgts = Double.parseDouble(salario.toString()) * 0.08;
        System.out.println("------------------FGTS------------------");
        System.out.println("O valor do FGTS: R$"+Math.ceil(valorFgts)+"\n");
    }
    public static void horaExtra(BigDecimal salario)
    {
        double vlrHoranormal = Double.parseDouble(salario.toString()) / 220;
        double vlrHoraextra = (Double.parseDouble(salario.toString()) / 220) * 0.5;
        System.out.println("------------------Hora Extra------------------");
        System.out.println("Valor hora normal trabalhada: R$"+Math.ceil(vlrHoranormal));
        System.out.println("Valor hora extra trabalhada: R$"+Math.ceil(vlrHoraextra)+"\n");
    }
    public static void falta(BigDecimal salario, int qtdFaltas)
    {
        double valorFaltadia = Double.parseDouble(salario.toString()) / 30;
        double descFalta = valorFaltadia * qtdFaltas;
        System.out.println("------------------Faltas------------------");
        System.out.println("Quantidade de faltas: "+qtdFaltas);
        System.out.println("Valor descontado por dia: R$"+Math.ceil(valorFaltadia));
        System.out.println("Descontos do mês: R$"+Math.ceil(descFalta)+"\n");
    }
    public static void salariofamilia(BigDecimal salario,int qtdFilhos)
    {
        System.out.println("------------------Salário Familia------------------");
        if(Double.parseDouble(salario.toString()) < 1655.5)
        {
            double vlrSalariofamilia = 56.47;
            System.out.println("Tem direito: SIM");
            double abono = qtdFilhos * vlrSalariofamilia;
            System.out.println("O valor do abono será de: R$"+abono);
        }
        else
        {
            System.out.println("Tem direito: NAO");
        }
    }
    public static void insalubridade(BigDecimal salario,String nivelInsalubridade)
    {
        double salInsalubridade = 0, salarioFinal = 0;
        System.out.println("------------------Insalubridade------------------");
        switch(nivelInsalubridade)
        {
            case "Min":
            {
                salInsalubridade = Double.parseDouble(salario.toString()) * 0.1;
                salarioFinal = Double.parseDouble(salario.toString()) + salInsalubridade;
                System.out.println("Nivel de Insalubridade: Minimo - 10%");
                break;
            }
            case "Med":
            {
                salInsalubridade = Double.parseDouble(salario.toString()) * 0.2;
                salarioFinal = Double.parseDouble(salario.toString()) + salInsalubridade;
                System.out.println("Nivel de Insalubridade: Minimo - 20%");
                break;
            }
            case "Max":
            {
                salInsalubridade = Double.parseDouble(salario.toString()) * 0.4;
                salarioFinal = Double.parseDouble(salario.toString()) + salInsalubridade;
                System.out.println("Nivel de Insalubridade: Minimo - 40%");
                break;
            }
            default:{System.out.println("Nivel de insalubridade inválido!");}
        }
        System.out.println("Valor: R$"+salInsalubridade);
        System.out.println("Salário: R$"+salarioFinal);
    }
}
