package ex10;
import java.util.Scanner;
public class ProgFuncionario {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		Funcionario f1 = new Funcionario("Lopes",700);
		Funcionario f2 = new Funcionario("Antunes",1300);
		
		System.out.printf("%s",f1.toString());
		System.out.printf("%s",f2.toString());
		
		System.out.printf("Há quantos trabalha na empresa %s?",f1.getNome());
		int anosf1 = teclado.nextInt();
		f1.setAnosEmpresa(anosf1);
		System.out.printf("Há quantos trabalha na empresa %s?",f2.getNome());
		int anosf2 = teclado.nextInt();
		f1.setAnosEmpresa(anosf1);
		f2.setAnosEmpresa(anosf2);
		
		f1.reajustarSalario();
		f2.reajustarSalario();
		
		System.out.printf("%s",f1.toString());
		System.out.printf("%s",f2.toString());
		teclado.close();
		
	}
}

