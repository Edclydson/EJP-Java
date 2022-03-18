package DESAFIO_4_EJP_TELALOGIN.src;


/**
 * @author:Edclydson Sousa
 */
public class loginDTO {
    private String login,senha;
    private String nome;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
}
