package listadeexercicios.Pessoa;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author: EDCLYDSON SOUSA
 * 
 * Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
    nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
    método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
    da pessoa. 
 * 
 */
public class ATV18EJP {
   private String nomePessoa;
   private String dataNascimento;
   private double alturaPessoa;
  
   public void imprimidadospessoa()
   {
      System.out.println("Nome: "+nomePessoa);
      System.out.println("Data de Nascimento: "+dataNascimento);
      System.out.println("Altura: "+alturaPessoa);
   }

   public void calculaidadepessoa(String datanascimento)
   {
      int dia,mes,ano;
      String[] data = datanascimento.split("/");
      dia = Integer.parseInt(data[0]);
      mes = Integer.parseInt(data[1]);
      ano = Integer.parseInt(data[2]);
      System.out.println(nomePessoa+" tem "+ChronoUnit.YEARS.between(LocalDate.of(ano, mes, dia), LocalDateTime.now())+" anos de idade!");
   }
      public String getNomePessoa() {
      return nomePessoa;
   }
   public void setNomePessoa(String nomePessoa) {
      this.nomePessoa = nomePessoa;
   }
   public String getDataNascimento() {
      return dataNascimento;
   }
   public void setDataNascimento(String dataNascimento) {
      SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
      formatadata.applyPattern(dataNascimento);
      this.dataNascimento = dataNascimento;
   }
   public double getAlturaPessoa() {
      return alturaPessoa;
   }
   public void setAlturaPessoa(double alturaPessoa) {
      new DecimalFormat("#,##0.00").format(alturaPessoa);
      this.alturaPessoa = alturaPessoa;
   }

   
}
