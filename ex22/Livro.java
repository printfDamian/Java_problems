package ex22;
import java.util.Arrays;
public class Livro {



private String editora;
private double pre�o;
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
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public String getTitulo() {
		return titulo;
	}
	public double getPre�o() {
		return pre�o;
	}
	public String getAutores() {
		return Arrays.toString(autor);
	}
	public void adicionarAutor(Autor J) {
		autor[nrautor] = J;
		nrautor++;
	}
	public String toString() {
		return String.format("Titulo:%s\nAutor/es:%s\nEditora:%s\nPre�o:%s �\nExemplares:%s\n",titulo,Arrays.toString(autor),editora,pre�o,exemplares);
	}
}
