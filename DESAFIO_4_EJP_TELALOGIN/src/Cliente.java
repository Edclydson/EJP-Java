package DESAFIO_4_EJP_TELALOGIN.src;


public class Cliente {
    private String NomeCliente;
    private static String CpfCliente;
    
    public String getNomeCliente() {
        return NomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }
    public static String getCpfCliente() {
        return CpfCliente;
    }
    public void setCpfCliente(String cpfCliente) {
        CpfCliente = cpfCliente;
    }
   
}
