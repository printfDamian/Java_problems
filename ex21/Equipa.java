package ex21;

import java.util.Arrays;

public class Equipa {
private String nome;
private Jogador jogador[];
private int nrjogador;

Equipa(String nome){
	jogador = new Jogador[5];
	this.nome = nome;
}

public String getNome() {
	return nome;
}
public void adicionarJogador(Jogador j) {
	jogador[nrjogador] = j;
	nrjogador++;
}

public String getJogadores() {
	return Arrays.toString(jogador);
	
}

public String toString() {
	return String.format("Nome da Equipa:%s Jogadores:%s\n",nome,Arrays.toString(jogador));
}

}
