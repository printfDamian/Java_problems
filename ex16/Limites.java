package ex16;
import java.util.Scanner;
import java.util.Arrays;
public class Limites {

	public static void main(String[] args) {
		Scanner teclas  = new Scanner(System.in);
		System.out.println("qual é o limite inferior");
		int limiteinf = teclas.nextInt();
		
		System.out.println("qual é o limite inferior");
		int limitesup = teclas.nextInt();
		int pares[] = new int[limitesup];
		int soma = 0;
		for(int i = 0; i<pares.length;i++)
		{
			if(i % 2 == 0)
				pares[i] = i;
			 soma = soma  + pares[i];
		}
	
		System.out.println(Arrays.toString(pares));
		System.out.printf("A soma é %d\n",soma);
	
	}
	
	
}
