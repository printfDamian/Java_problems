package ex22;

public class Autor {
private String nome;
private char genero;
private String email;


	Autor(String nome,String email,char genero){
		this.nome = nome;
		this.email = email;
		this.genero = genero;
		
	}
	public String getNome() {
		return nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGenero() {
		return genero;
	}
	public String toString() {
		return String.format("Nome:%s\nEmail:%s\nGenero:%s\n",nome,email,genero);
	}
}