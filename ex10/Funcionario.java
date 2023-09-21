package ex10;

public class Funcionario {
	private String nome;
	private int anosempresa;
	private double salarioBruto;
	
	public Funcionario(String nome,double salarioBruto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		anosempresa = 0;
	}
	public String getNome() {
		return nome;
	}
	
	public double calculaSalarioLiquido(){
		double salarioLiquido; 
		salarioLiquido = salarioBruto - (salarioBruto * 0.08) + (salarioBruto * 0.10);
		return salarioLiquido;
	}
	public double reajustarSalario() {
		if (anosempresa > 5)
			salarioBruto = salarioBruto + (salarioBruto * 0.10);
		else
			System.out.println("Ainda não tem direito a um aumento de salario");
		return salarioBruto;	
	
	}
	public void setAnosEmpresa(int anosempresa) {
		this.anosempresa =  anosempresa;
	}
	public String toString() {
		
		return String.format("Nome: %s\t Anos na empresa: %d \t Salario: %.2f\tSalario Liquido: %.2f\n",nome,anosempresa,salarioBruto,calculaSalarioLiquido());
	
	}

}
