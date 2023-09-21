package ex3;
import java.util.Scanner;
public class MainEmpregado {

	public static void main(String[] args) {
		Scanner teclas  = new Scanner(System.in);
		
		System.out.printf("insira o numero\n");
		int numero = teclas.nextInt();
		
		Empregado emp1 = new Empregado(null, numero);
		
		System.out.println("Insira o seu nome");
		
		String name = teclas.next();
		
		
		
		emp1.setNome(name);
		
		System.out.printf("O nome é %s\n",emp1.getNome());
		System.out.printf("O numero é %d\n",emp1.getNumEmp());
		emp1.receberSalario();
		teclas.close();
	}
}
