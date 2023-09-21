package ex5;
public class Banco {
	private String nome;
	private double saldo;
	
	public void setNome(String nome) {
		 this.nome = nome;
	 }
	
	public String getNome() {
		 return nome;
	 }
	
	
	public void levantarDinheiro(double dinheiro) {
		 saldo = saldo - dinheiro;
	 }
	public void setSaldo(double novoSaldo) {
		 saldo = novoSaldo;
	 }
	public double getSaldo() {
		 return saldo;
	 }
	
	
	public void mostrarInfo() {
		 
		 System.out.printf("O nome da conta é %s tem %.2f € na conta \n",getNome(),getSaldo());
		
	 }
}
