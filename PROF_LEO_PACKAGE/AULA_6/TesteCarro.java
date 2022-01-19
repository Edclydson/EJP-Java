package PROF_LEO_PACKAGE.AULA_6;

public class TesteCarro{

    
    public static void main(String[] args) 
    {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Van";
        van.capPassageiro = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();
        System.out.println("--------------------------------------------------");
 
        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "fusca";
        fusca.capPassageiro = 5;
        fusca.capCombustivel = 40;
        fusca.consumoCombustivel = 0.5;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        fusca.exibirAutonomia();
        System.out.println("--------------------------------------------------");

        Carro kwid = new Carro();
        kwid.marca = "Renault";
        kwid.modelo = "Kwid";
        kwid.capPassageiro = 5;
        kwid.capCombustivel = 65;
        kwid.consumoCombustivel = 0.4;

        System.out.println(kwid.marca);
        System.out.println(kwid.modelo);
        kwid.exibirAutonomia();
        System.out.println("--------------------------------------------------");
    }

}