package DESAFIO_4_EJP_TELALOGIN.src;


public class Cliente {
    private String NomeCliente;
    private static String CpfCliente;
    private String endereço;
    private String telefone;
    
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
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
