package ex3;

public class Empregado {

	
		private String nome;
		private int numEmp;
		
		public Empregado(String nome,int numEmp) {
			this.nome = nome;
			this.numEmp = numEmp;
		}
		
		public void receberSalario(){
			System.out.printf("Recebeu Salário +€\n");
			
			}
		public void setNome(String nome) {
			this.nome = nome;
		}
	
		public String getNome() {
			return nome;
		}
		public int getNumEmp() {
			return numEmp;
		}
}
