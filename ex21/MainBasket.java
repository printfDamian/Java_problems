package ex21;



public class MainBasket {

	public static void main(String[] args) {
		
		Equipa equipa1 = new Equipa("Lakers");
		Equipa equipa2 = new Equipa("Bulls");
		
		Jogador Jogador1 = new Jogador("LeBron James",1984,"Extremo");
		Jogador Jogador2 = new Jogador("Kevin Durnat",1988,"Extremo");
		Jogador Jogador3 = new Jogador("Anthony Davis",1993,"Poste");
		Jogador Jogador4 = new Jogador("James Harden",1989,"Extremo");
		Jogador Jogador5 = new Jogador("Stephen Curry",1988,"Extremo");
		Jogador Jogador6 = new Jogador("Russell Westbrook",1988,"Base");
		Jogador1.setNumero(23);
		Jogador2.setNumero(7);
		Jogador3.setNumero(3);
		
		Jogador4.setNumero(13);
		Jogador5.setNumero(30);
		Jogador6.setNumero(5);
		
		Jogador6.setNumero(4);
		
		System.out.printf("%s\n",Jogador1.toString());
		System.out.printf("%s\n",Jogador2.toString());
		System.out.printf("%s\n",Jogador3.toString());
		System.out.printf("%s\n",Jogador4.toString());
		System.out.printf("%s\n",Jogador5.toString());
		System.out.printf("%s\n",Jogador6.toString());
		
		equipa1.adicionarJogador(Jogador1);
		equipa1.adicionarJogador(Jogador2);
		equipa1.adicionarJogador(Jogador3);
		
		equipa2.adicionarJogador(Jogador4);
		equipa2.adicionarJogador(Jogador5);
		equipa2.adicionarJogador(Jogador6);
		
		System.out.printf(" %s age:%d\n%s age:%d\n",Jogador3.getNome(),Jogador3.darIdade(),Jogador4.getNome(),Jogador4.darIdade());
		
		System.out.printf("%s\n",equipa1.toString());
		System.out.printf("%s\n",equipa2.toString());
		
		Jogador5.setPosicao("Base");
		
		System.out.printf("%s\n",equipa1.toString());
		System.out.printf("%s\n",equipa2.toString());

		
		
		System.out.printf("\n\n\n%s\n",equipa1.getNome());
		
		
		if(Jogador1.darIdade() < Jogador2.darIdade() && Jogador1.darIdade() < Jogador3.darIdade())
			System.out.printf("%s é o mais novo\n",Jogador1.getNome());
		else if(Jogador2.darIdade() < Jogador3.darIdade())
			System.out.printf("%s é o mais novo\n",Jogador2.getNome());
		else
			System.out.printf("%s é o mais novo\n",Jogador3.getNome());
		
		if(Jogador1.darIdade() > Jogador2.darIdade() && Jogador1.darIdade() > Jogador3.darIdade())
			System.out.printf("%s é o mais velho\n",Jogador1.getNome());
		else if(Jogador2.darIdade() > Jogador3.darIdade())
			System.out.printf("%s é o mais velho\n",Jogador2.getNome());
		else
			System.out.printf("%s é o mais velho\n",Jogador3.getNome());
		
		
		
		System.out.printf("\n\n\n\n%s\n",equipa2.getNome());
		
		
		
		if(Jogador4.darIdade() < Jogador5.darIdade() && Jogador4.darIdade() < Jogador6.darIdade())
			System.out.printf("%s é o mais novo\n",Jogador4.getNome());
		else if(Jogador5.darIdade() < Jogador6.darIdade())
			System.out.printf("%s é o mais novo\n",Jogador5.getNome());
		else
			System.out.printf("%s é o mais novo\n",Jogador6.getNome());
		
		if(Jogador4.darIdade() > Jogador5.darIdade() && Jogador4.darIdade() > Jogador6.darIdade())
			System.out.printf("%s é o mais velho\n",Jogador4.getNome());
		else if(Jogador5.darIdade() > Jogador6.darIdade())
			System.out.printf("%s é o mais velho\n",Jogador5.getNome());
		else
			System.out.printf("%s é o mais velho\n",Jogador6.getNome());
	}

}
