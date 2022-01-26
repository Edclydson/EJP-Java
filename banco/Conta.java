package banco;

public class Conta {
   
    private String titular;
    private int numero;
    private double saldo;
    
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean sacar(double valorsacar)
    {
        if(this.saldo < valorsacar)
        {
            System.out.println("Saldo Insuficiente");
            return false;
        }
        else
        {
            System.out.println("Transação autorizada");
            this.saldo -= valorsacar;
            System.out.println("Valor sacado:  R$"+this.saldo);
            return true;
        }
    }
}
