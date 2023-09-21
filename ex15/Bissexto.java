package ex15;
import java.util.Scanner;
import java.util.Arrays;
public class Bissexto {

	public static void main(String[] args) {
		Scanner teclas  = new Scanner(System.in);
		int ano;
		int anobi[];
		anobi = new int[10];
		
		for(int i = 0; i < 10 ;i++)
		{
			System.out.printf("insira o ano %d:",i+1);
			 ano = teclas.nextInt();
			 if(ano % 4 == 0) 
			 {
				 anobi[i] = ano;
			 }
			 else
				 i--;
		}
		
		Arrays.sort(anobi);
		System.out.println(Arrays.toString(anobi));
		teclas.close();
	}

}
