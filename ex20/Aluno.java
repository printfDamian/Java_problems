package ex20;
import java.util.Arrays;
public class Aluno {
	private String nomeAluno;
	private int notas[];
	private int mod;
 Aluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
		notas = new int[3];
		mod = 0;
	} 
	public void setNome(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getNome() {
		return nomeAluno;
	}
	public void darNota(int nota) {
		if(nota >= 10 && nota<= 20)
		{
		notas[mod] = nota;
		mod++;	
		}
		else
		{
			System.out.println("Nota não é válida");
			mod--;
		}
			
	}
	public double darMedia() {
		int soma = 0;
		for(int i = 0;i<notas.length;i++)
		{
			soma = soma + notas[i];
		}
		double media = soma/3;
		
		return media;
	}
	
	
	public String toString() {
		return String.format("Nome:%s\nNotas:%s\n",nomeAluno,Arrays.toString(notas));
	}
}
