package ex19;
import java.util.Random;


public class Iphone {
	private int numserie;
	private double peso;
	private String cor;
	private String estado;
	
	public Iphone(int numserie) {
		this.numserie = numserie;
		estado = "Nao testado";
	} 
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	public boolean testaUnidade() {
		Random gerador = new Random();
		int chance = gerador.nextInt(101);
		if (chance < 50)
		{
			estado = "Reprovado"; 
			 return false;
		}
			
		else
		{
			estado = "Aprovado";
			return true;
		}
			
		
	}
	public String toString() {
		 return String.format("Numero de Serie: %s\ncor: %s\nPeso:%s\nEstado:%s\n",numserie,cor,peso,estado);
	 }
	
}
