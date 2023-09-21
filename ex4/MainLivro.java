package ex4;
import java.util.Scanner;
public class MainLivro {

	public static void main(String[] args) {
		Scanner teclas  = new Scanner(System.in);
		Livro liv1 = new Livro();
		System.out.printf("Insira o nome do livro\n");
		
		String nome = teclas.next();
		
		
		liv1.setNomeCurso(nome);
		
			liv1.mostrarInfo();
			
			teclas.close();
	}

}
