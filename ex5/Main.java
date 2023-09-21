package ex5;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner teclas  = new Scanner(System.in);
		Banco banc = new Banco();
		int opc;
		do {
		System.out.printf("Insira o nome da conta\n");
		String nome = teclas.nextLine();
		banc.setNome(nome);
		banc.setSaldo(1000);
		int saldo = 1000;
		
		System.out.printf("1-Levantar\n");
		System.out.printf("2-Depositar\n");
		System.out.printf("3-Sair\n");
		System.out.printf("4-saldo\n");
		System.out.printf("insira a opc\n");
		 opc = teclas.nextInt();
		switch (opc) {
		case 1:
				System.out.printf("Insira o levantamento\n");
				double levantamento = teclas.nextDouble();
				if(levantamento < saldo) {
				banc.setSaldo(saldo - levantamento);
				banc.mostrarInfo();	
				}
				else
					System.out.println("saldo insuficiente");
				break;
		case 2:
			System.out.printf("Insira o deposito\n");
			double deposito = teclas.nextDouble();
			banc.setSaldo(saldo - deposito);
			banc.mostrarInfo();
			break;
		case 3:
			System.out.println("vai sair");
			break;
		case 4:
			banc.mostrarInfo();
			break;
			
		}
		}while(opc != 3);
		teclas.close();
	}

}
