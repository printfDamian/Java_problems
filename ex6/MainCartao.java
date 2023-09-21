package ex6;
import java.util.Scanner;


public class MainCartao {

	public static void main(String[] args) {
		Scanner teclas  = new Scanner(System.in);
		Cartao cart1 = new Cartao("Samuel","11�PSI");
		int opc;
		do {
			System.out.println("---------Menu--------");
			System.out.printf("1-Ativar\n");
			System.out.printf("2-Dar entrada\n");
			System.out.printf("3-Dar saida\n");
			System.out.printf("4-carragar cartao\n");
			System.out.printf("5-comprar\n");
			System.out.printf("6-anular cartao\n");
			System.out.printf("7-sair\n");
			System.out.printf("8-ver informa��es\n");
			System.out.printf("insira a op��o:");
				 opc = teclas.nextInt();
				switch (opc) {
				case 1:
					if (cart1.getAtivo()== false)
						cart1.ativarCartao();
					else
						System.out.printf("Cart�o j� est� ativo");
					break;
				case 2:
					if (cart1.getAtivo()== true && cart1.getEntrou() == false)
						cart1.entrada();
					else
						System.out.printf("O aluno n�o pode entrar");
				break;
				case 3:
					if (cart1.getAtivo()== true && cart1.getEntrou() == true)
							System.out.println("Pode sair");
					else
						System.out.printf("o Aluno n�o pode sair");
					break;
				case 4:
					if (cart1.getAtivo() == true && cart1.getEntrou() == true)
					{
						System.out.printf("Insira o quantia que quer colocar no cart�o\n");
						double carregar = teclas.nextDouble();
						cart1.carregarCartao(carregar);
					}
					else
						System.out.println("N�o pode carrgar o cart�o");
					
					break;
				case 5:
					if(cart1.getAtivo() == true && cart1.getEntrou() == true )
					{
						System.out.printf("Insira o pre�o do que quer comprar\n");
						double deposito = teclas.nextDouble();
						cart1.movimento(deposito);	
					}
					
					else
						System.out.println("N�o pode comprar\n");
					break;
				case 6:
					if(cart1.getAtivo() == true)
						cart1.anularCartao();
					else
						System.out.println("Cart�o n�o est� ativo");
					break;
				case 7: System.out.println("vai sair"); break;
				
				case 8: 
					System.out.println(cart1);
					break;
				default:
					System.out.println("Op��o inv�lida");
				
				}
		}while(opc != 7);
		teclas.close();
	}

}
