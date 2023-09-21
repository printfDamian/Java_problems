package ex7;
import java.util.Scanner;
public class MainPersonagens {
	public  static void main(String [] args) {
		Scanner teclas = new Scanner(System.in);
		
		Personagens p1 = new Personagens("Default",'M');
		Personagens p2 = new Personagens("Ruby",'F');
		
		p1.apanharshield();
		p2.apanharshield();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		p1.Dano(23);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		
		p1.Dano(30);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		p1.Dano(99);
		
		System.out.println(p1.toString());
		
		System.out.println(p2.toString());
		teclas.close();
	}
}
