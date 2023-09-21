package ex19;
import java.util.Scanner;
public class Progiphone {

	public static void main(String[] args) {
		Scanner teclas  = new Scanner(System.in);
		
		System.out.print("Insira o numero de serie:");
		int num = teclas.nextInt();
		
		Iphone x = new Iphone(num);
		
		System.out.print("Insira o peso:");
		double peso = teclas.nextDouble();
		
		x.setPeso(peso);
		teclas.nextLine();
		System.out.print("Insira cor:");
		String cor = teclas.nextLine();
		
		x.setCor(cor);
		System.out.printf("%s\n",x.toString());
		
		teclas.close();
	}

}
