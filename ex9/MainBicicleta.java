package ex9;
import java.util.Scanner;
public class MainBicicleta {

	public static void main(String[] args) {
		Scanner teclas = new Scanner(System.in); 
		Bicicleta bike1 = new Bicicleta(112,30,"Loures");
		int opc;
		
		do
		{
		System.out.println("1- obter valores\n2-adicionar kms á bicicleta\nfazer uma viagem\n3-reiniciar a rota e respetivos quilometros\n4-sair");
		opc = teclas.nextInt();	
		switch(opc)
		{
		case 1:
			System.out.printf(bike1.toString());
			break;
		case 2:
			System.out.println("Inisira o numero de kilometros");
			int k = teclas.nextInt();
			bike1.adkm(k);
			break;
		case 3:
			
			System.out.println("insira a distancia");
			int km = teclas.nextInt();
			teclas.nextLine();
			System.out.println("insira o destino");
			String local = teclas.nextLine();
			teclas.nextLine();
			
			bike1.FazerViagem(local,km);
			break;
		case 4:
			bike1.rr();
			System.out.println("vai sair");
			break;
		default: System.out.println("Opcao invalida");
		}
		}while(opc != 4);
		teclas.close();
	}

}
