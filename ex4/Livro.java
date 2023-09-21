package ex4;

public class Livro {
	private String nomeCurso;
	
 public void setNomeCurso(String nome) {
	nomeCurso = nome;
 }
 public String getNomeCurso() {
	 return nomeCurso;
 }
 
 
 public void mostrarInfo() {
	 
	 System.out.printf("Este é o livro do curso de %s\n",getNomeCurso());
	
 }
}
