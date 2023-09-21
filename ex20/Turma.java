package ex20;

import java.util.Arrays;

public class Turma {
	private Aluno ListaAlunos[];
	private String nomeTurma;
	private int num;
	 
	public Turma(String nome) {
		this.nomeTurma = nome;
		ListaAlunos = new Aluno[4];
	}
	public String getNome() {
		return nomeTurma;
	}
	public void setNome(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	public Aluno[] getListaAlunos() {
		return ListaAlunos;
	}
	public void adicionarAluno(Aluno novoAluno) {
		ListaAlunos[num] = novoAluno;
		num++;
	}
	public double darMedia() {
		double media = 0;
		for(int i=0;i<4;i++)
		{
			 media = media + ListaAlunos[i].darMedia();
		}
		return media/4;
	}
	public String toString() {
		return String.format("Turma:%s\nAlunos:%s\n",nomeTurma,Arrays.toString(ListaAlunos));
	}
}
