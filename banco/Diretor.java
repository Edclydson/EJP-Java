package banco;

public class Diretor {

    String nome;
    private String cpf;
    private double salario;
    private int senha;
    private int numGerentesGerenciados;
    
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
    public int getNumGerentesGerenciados() {
        return numGerentesGerenciados;
    }
    public void setNumGerentesGerenciados(int numGerentesGerenciados) {
        this.numGerentesGerenciados = numGerentesGerenciados;
    }

    
}
