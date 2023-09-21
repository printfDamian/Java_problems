package ex22;
import java.util.Scanner;
public class MainLivraria {

	public static void main(String[] args) {
		Scanner teclas  = new Scanner(System.in);
		
		Autor autor1 = new Autor("Mario","Mario@livrariaesjal.pt",'M');
		Autor autor2 = new Autor("Ana Bela Andrade","AnaBela@livrariaEsjal.pt",'F');
		Autor autor3 = new Autor("Rosa Moinhos","Rosa@livrariaEsjal.pt",'F');
		
		Livro livro1 = new Livro("Java 6 – Programação Orientada pelos Objectos","FCA Editores",70);
		Livro livro2 = new Livro("Sociologia – Módulos 5 a 7","Plátano Editora ",45);
	
		livro1.adicionarAutor(autor1);
		livro2.adicionarAutor(autor2);
		livro2.adicionarAutor(autor3);
		

		livro1.setPreço(28.95);
		livro2.setPreço(6.20);
		
		
		
		
		System.out.printf("%s\n\n%s\n\n",livro1.toString(),livro2.toString());
		livro1.setEditora("LIDEL");
		
		System.out.printf("%s\n\n",livro1.toString());
		
		/*System.out.printf("insira o vale de desconto");
		double disconto = teclas.nextDouble();
		System.out.printf("preço sem o desconto %.2f\npreço com disconto %.2f",livro1.getPreço(),livro1.getPreço()*disconto);
		*/
		teclas.close();
	}
	
}
