package banco;

public class Gerente {
    String nome;
    private String cpf;
    private double salario;
    private int senha;
    private int numFuncGerenciados;
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getNumFuncGerenciados() {
        return numFuncGerenciados;
    }
    public void setNumFuncGerenciados(int numFuncGerenciados) {
        this.numFuncGerenciados = numFuncGerenciados;
    }

    public boolean autentica(int senha)
    {
        if(senha == 1234)
            return true;
        else
            return false;
    }
    
    
}
