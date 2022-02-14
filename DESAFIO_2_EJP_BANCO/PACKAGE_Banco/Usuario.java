package PACKAGE_Banco;

public class Usuario 
{
    private static String nome;
    private static String cpf_usuario;
    private static int id_usuario;
   
    public static String getNome() {
        return nome;
    }
    public static void setNome(String nome) {
        Usuario.nome = nome;
    }
    public static String getCpf_usuario() {
        return cpf_usuario;
    }
    public static void setCpf_usuario(String cpf_usuario) {
        Usuario.cpf_usuario = cpf_usuario;
    }
    public static int getId_usuario() {
        return id_usuario;
    }
    public static void setId_usuario(int id_usuario) {
        Usuario.id_usuario = id_usuario;
    }    
}
