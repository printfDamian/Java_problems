package ex6;
import java.util.Scanner;


public class MainCartao {

	public static void main(String[] args) {
		Scanner teclas  = new Scanner(System.in);
		Cartao cart1 = new Cartao("Samuel","11ºPSI");
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
			System.out.printf("8-ver informações\n");
			System.out.printf("insira a opção:");
				 opc = teclas.nextInt();
				switch (opc) {
				case 1:
					if (cart1.getAtivo()== false)
						cart1.ativarCartao();
					else
						System.out.printf("Cartão já está ativo");
					break;
				case 2:
					if (cart1.getAtivo()== true && cart1.getEntrou() == false)
						cart1.entrada();
					else
						System.out.printf("O aluno não pode entrar");
				break;
				case 3:
					if (cart1.getAtivo()== true && cart1.getEntrou() == true)
							System.out.println("Pode sair");
					else
						System.out.printf("o Aluno não pode sair");
					break;
				case 4:
					if (cart1.getAtivo() == true && cart1.getEntrou() == true)
					{
						System.out.printf("Insira o quantia que quer colocar no cartão\n");
						double carregar = teclas.nextDouble();
						cart1.carregarCartao(carregar);
					}
					else
						System.out.println("Não pode carrgar o cartão");
					
					break;
				case 5:
					if(cart1.getAtivo() == true && cart1.getEntrou() == true )
					{
						System.out.printf("Insira o preço do que quer comprar\n");
						double deposito = teclas.nextDouble();
						cart1.movimento(deposito);	
					}
					
					else
						System.out.println("Não pode comprar\n");
					break;
				case 6:
					if(cart1.getAtivo() == true)
						cart1.anularCartao();
					else
						System.out.println("Cartão não está ativo");
					break;
				case 7: System.out.println("vai sair"); break;
				
				case 8: 
					System.out.println(cart1);
					break;
				default:
					System.out.println("Opção inválida");
				
				}
		}while(opc != 7);
		teclas.close();
	}

}
