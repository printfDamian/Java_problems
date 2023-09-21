package ex2;
import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
	  
	  
	  Scanner teclas = new Scanner(System.in);
	  
	  System.out.println("Insira 1º numeros");
	  int n1 = teclas.nextInt();
	  System.out.println("Insira 2º numeros");
	  int n2 = teclas.nextInt();
	  
	  int soma = n1 + n2;
	  
	  System.out.printf("%d + %d = %d",n1,n2,soma);
	  
	  teclas.close();
	  
  }
}
