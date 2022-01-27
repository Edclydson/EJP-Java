package listadeexercicios.elevador;

public class MainATV20EJP {
    public static void main(String[] args) {
        ATV20EJP elevador = new ATV20EJP(10, 10);
        
        elevador.sobe();
        elevador.entra();
        elevador.sobe();
        elevador.sai();
    }
    
}
