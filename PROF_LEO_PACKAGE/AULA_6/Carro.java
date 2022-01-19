package PROF_LEO_PACKAGE.AULA_6;

public class Carro {

    public static String marca;
    public String modelo;
    public int capPassageiro;
    public double capCombustivel;
    public double consumoCombustivel;

    public void exibirAutonomia()
    {
        System.out.println("A autonomia do carro é: " +(capCombustivel * consumoCombustivel)+ "Km");
    }
    
}
