package ex6;

public class Cartao {
	private String nome;
	private double saldo;
	private String turma;
	private boolean ativar;
	private boolean entrar;
	private boolean sair;
	private double dinheiro;
	
	
	public Cartao(String nome, String turma) {
		this.nome = nome;
		this.turma = turma;
	}
	public void ativarCartao() {
		ativar = true;
		System.out.println("ativou o cartão");
	}
	public void saida() {
		sair = true;
		entrar = false;
	}
	public void entrada() {
		entrar = true;
		sair = false;
	}
	public void anularCartao() {
		ativar = false;
		System.out.println("desativou o cartão");
	}
	public void carregarCartao(double dinheiro) {
		saldo = saldo + dinheiro;
	}
	public void movimento(double dinheiro) {
		saldo = saldo - dinheiro;
	}
	public void setSaldo(double novoSaldo) {
		 saldo = novoSaldo;
	 }
	public boolean getAtivo() {
		return ativar;
	}
	public boolean getEntrou() {
		return entrar;
	}
	public boolean getSaida() {
		return sair;
	}
		public String toString() {
		return String.format("Nome:%s \t Turma:%s \t Saldo: %.2f\t\t entrou:%b \t sair:%b \t ativação:%b",nome,turma,saldo,entrar,sair,ativar);
	}
}
