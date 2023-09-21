package ex18;
import java.util.Arrays;
public class Aluno {

	private String nome;
	private int nota[];
	private int numeroModulo;
	
	public Aluno(String nome) {
		this.nome = nome;
		nota = new int[4];
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addNota(int nota) {
		this.nota[numeroModulo] = nota;
		numeroModulo++;
	}
	public double media() {
		double  soma = 0;
		for(int i=0;i<nota.length;i++) 
		{
			soma = soma + nota[i];
			
		}
		soma = soma/4;
		return soma;
			
	}
	public  int Maior() {
		int maior = 0;
		for(int i=0;i<nota.length;i++)
		{
			if(nota[i]>maior)
				maior = nota[i];
		}
		return maior;
	}
	
	public int Menor() {
		int menor = 21;
		for(int i= 0;i<nota.length;i++)
		{
			if(nota[i]<menor)
				menor = nota[i];
		}
		return menor;
	}
	
	 public String toString() {
		 return String.format("Nome: %s\nNotas: %s",nome,Arrays.toString(nota));
	 }
	
}
