package ex14;
import java.util.Scanner;
public class ArraySoma {

	public static void main(String[] args) {
		Scanner teclas  = new Scanner(System.in);
		int soma = 0;
		int array[];
		array = new int[5];
		for(int i = 0; i < 5 ;i++)
		{
			System.out.printf("insira o numero %d:",i+1);
			 array[i] = teclas.nextInt();
		}
		for(int i = 0; i < 5 ;i++)
		{
			 soma = soma + array[i];
		}
		System.out.printf("A soma dos 5 numeros é %d",soma);
		teclas.close();
	}

}
