package ex18;
import java.util.Scanner;
import java.util.Arrays;

public class ProgAluno {

	public static void main(String[] args) {
		Scanner teclas  = new Scanner(System.in);
		int nota;
		int i;
		
		System.out.print("Insira o seu nome:");
		String nome = teclas.nextLine();
		Aluno a1 = new Aluno(nome);
		
		for(i=0;i<4;i++)
		{
			System.out.printf("insira a nota do modulo %d:",i);
			nota = teclas.nextInt();
			if(nota < 10 || nota > 20) {
				System.out.println("Só aceito notas entre 10 e 20");
				i--;
			} 
				else
				a1.addNota(nota);

		}
		System.out.printf("%s\n",a1.toString());
		System.out.printf("A média é: %.2f\n",a1.media());
		System.out.printf("A nota mais alta é %d\n",a1.Maior());
		System.out.printf("A nota mais baixa é %d\n",a1.Menor());
		
		
	}

}
