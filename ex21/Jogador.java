package ex21;



public class Jogador {
	private String nome;
	private int numero;
	private String posicao;
	private int anonascimento;
	
	Jogador (String nome,int anonascimento,String posicao) {
		this.nome = nome;
		this.anonascimento = anonascimento;
		this.posicao = posicao;
	} 
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String  getNome() {
		return nome;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public int darIdade() {
		int idade = 0;
		idade = 2022 - anonascimento;
		return idade;
	}
	public String toString() {
		return String.format("Nome:%s\nIdade:%s\nPosicao:%s\nNumero:%s",nome,darIdade(),posicao,numero);
	}
	
}

