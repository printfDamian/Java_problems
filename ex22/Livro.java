package ex22;
import java.util.Arrays;
public class Livro {



private String editora;
private double preço;
private String titulo;
private Autor autor[];
private int exemplares;
private int nrautor;


	Livro(String titulo,String editora,int exemplares){
		this.titulo = titulo;
		this.editora = editora;
		this.exemplares = exemplares;
		autor = new Autor[3];
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public String getTitulo() {
		return titulo;
	}
	public double getPreço() {
		return preço;
	}
	public String getAutores() {
		return Arrays.toString(autor);
	}
	public void adicionarAutor(Autor J) {
		autor[nrautor] = J;
		nrautor++;
	}
	public String toString() {
		return String.format("Titulo:%s\nAutor/es:%s\nEditora:%s\nPreço:%s €\nExemplares:%s\n",titulo,Arrays.toString(autor),editora,preço,exemplares);
	}
}
