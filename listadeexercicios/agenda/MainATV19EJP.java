package listadeexercicios.agenda;

public class MainATV19EJP{
    public static void main(String[] args) {
        ATV19EJP novocontato = new ATV19EJP();
        System.out.println("-----------------ADD PESSOAS----------------------");
        novocontato.armazenaPessoa("Edclydson", 25, (float)1.76);
        novocontato.armazenaPessoa("Victoria", 23, (float)1.50);
        novocontato.armazenaPessoa("Edna", 47, (float)1.55);
        novocontato.armazenaPessoa("Francisco", 47, (float)1.73);

        System.out.println("\n-----------------BUSCA PESSOAS----------------------");
        novocontato.buscaPessoa("Francisco");
        
        System.out.println("\n-----------------IMPRIME AGENDA----------------------");
        novocontato.imprimeAgenda();

        System.out.println("\n-----------------IMPRIME PESSOA----------------------");
        novocontato.imprimePessoa(2);
        
        System.out.println("\n-----------------REMOVE PESSOA----------------------");
        ///novocontato.removePessoa("Edna");
        
    }
    
}
