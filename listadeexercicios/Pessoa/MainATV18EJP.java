package listadeexercicios.Pessoa;

import java.util.Scanner;

public class MainATV18EJP {
    public static void main(String[] args) {
        ATV18EJP pessoa = new ATV18EJP();
        String nome,dataNascimento;
        double altura;
        Scanner dados = new Scanner(System.in);
        

        System.out.println("Nome:");
        nome = dados.nextLine();
        pessoa.setNomePessoa(nome);
        System.out.println("\nData de Nascimento: dd/MM/yyyy");
        dataNascimento = dados.nextLine();
        pessoa.setDataNascimento(dataNascimento);
        System.out.println("Altura:");
        altura = Double.parseDouble(dados.nextLine().replace(",", "."));
        pessoa.setAlturaPessoa(altura);

        System.out.println("\n");
        pessoa.calculaidadepessoa(pessoa.getDataNascimento());
        System.out.println("\nImprimindo dados...");
        pessoa.imprimidadospessoa();

        dados.close();
    }
    
}
