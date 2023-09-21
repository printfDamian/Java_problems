package ex22;
import java.util.Scanner;
public class MainLivraria {

	public static void main(String[] args) {
		Scanner teclas  = new Scanner(System.in);
		
		Autor autor1 = new Autor("Mario","Mario@livrariaesjal.pt",'M');
		Autor autor2 = new Autor("Ana Bela Andrade","AnaBela@livrariaEsjal.pt",'F');
		Autor autor3 = new Autor("Rosa Moinhos","Rosa@livrariaEsjal.pt",'F');
		
		Livro livro1 = new Livro("Java 6 � Programa��o Orientada pelos Objectos","FCA Editores",70);
		Livro livro2 = new Livro("Sociologia � M�dulos 5 a 7","Pl�tano Editora ",45);
	
		livro1.adicionarAutor(autor1);
		livro2.adicionarAutor(autor2);
		livro2.adicionarAutor(autor3);
		

		livro1.setPre�o(28.95);
		livro2.setPre�o(6.20);
		
		
		
		
		System.out.printf("%s\n\n%s\n\n",livro1.toString(),livro2.toString());
		livro1.setEditora("LIDEL");
		
		System.out.printf("%s\n\n",livro1.toString());
		
		/*System.out.printf("insira o vale de desconto");
		double disconto = teclas.nextDouble();
		System.out.printf("pre�o sem o desconto %.2f\npre�o com disconto %.2f",livro1.getPre�o(),livro1.getPre�o()*disconto);
		*/
		teclas.close();
	}
	
}
