package ex20;

public class ProgAluno {

	public static void main(String[] args) {
		 
		Aluno aluno1 = new Aluno("Henrique");
		Aluno aluno2 = new Aluno("Andre");
		Aluno aluno3 = new Aluno("Guilherme");
		Aluno aluno4 = new Aluno("Eduardo");
		
		Aluno aluno5 = new Aluno("Rita");
		Aluno aluno6 = new Aluno("Ariana");
		Aluno aluno7 = new Aluno("Ines");
		Aluno aluno8 = new Aluno("Rafaela");
		
		Turma turma1 = new Turma("Rapazes");
		Turma turma2 = new Turma("Raparigas");
		
		turma1.adicionarAluno(aluno1);
		turma1.adicionarAluno(aluno2);
		turma1.adicionarAluno(aluno3);
		turma1.adicionarAluno(aluno4);
		
		turma2.adicionarAluno(aluno5);
		turma2.adicionarAluno(aluno6);
		turma2.adicionarAluno(aluno7);
		turma2.adicionarAluno(aluno8);
		
		aluno1.darNota(15);
		aluno1.darNota(17);
		aluno1.darNota(15);
		
		
		aluno2.darNota(15);
		aluno2.darNota(17);
		aluno2.darNota(17);
		
		aluno3.darNota(15);
		aluno3.darNota(17);
		aluno3.darNota(17);
		
		aluno4.darNota(15);
		aluno4.darNota(17);
		aluno4.darNota(17);
		
		aluno5.darNota(15);
		aluno5.darNota(17);
		aluno5.darNota(17);
		
		aluno6.darNota(15);
		aluno6.darNota(17);
		aluno6.darNota(17);
		
		aluno7.darNota(15);
		aluno7.darNota(17);
		aluno7.darNota(17);
		
		aluno8.darNota(15);
		aluno8.darNota(17);
		aluno8.darNota(17);
		
		
		System.out.printf("%s %s",turma1.toString(),turma2.toString());
		
		System.out.printf("A média do %s é de %.2f\n",aluno1.getNome(),aluno1.darMedia());
		System.out.printf("A média do %s é de %.2f\n",aluno1.getNome(),aluno2.darMedia());
		System.out.printf("A média do %s é de %.2f\n",aluno1.getNome(),aluno3.darMedia());
		System.out.printf("A média do %s é de %.2f\n",aluno1.getNome(),aluno4.darMedia());
		System.out.printf("A média da %s é de %.2f\n",aluno1.getNome(),aluno5.darMedia());
		System.out.printf("A média da %s é de %.2f\n",aluno1.getNome(),aluno6.darMedia());
		System.out.printf("A média da %s é de %.2f\n",aluno1.getNome(),aluno7.darMedia());
		System.out.printf("A média da %s é de %.2f\n",aluno1.getNome(),aluno8.darMedia());
		System.out.printf("A media da Turma %s é %.2f\n",turma1.darMedia());
		System.out.printf("A media da Turma %s é %.2f\n",turma2.darMedia());
		
	}

}
