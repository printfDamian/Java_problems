package ex7;

public class Personagens {
	private String nome;
	private char genero;
	private int hp;
	private int shield;
	
	public Personagens(String nome,char genero) {
		this.nome = nome;
		this.genero = genero;
		hp = 100;
	}
	public void apanharshield() {
		shield = 50;
	}
	public void Dano(int dano) {
		if(shield - dano < 0)
			{
				hp = hp - dano;
				shield = 0;
			}
		else 
			shield = shield - dano;
		
		if(hp <= 0)
		{
			hp = 0;
			System.out.println("Game Over");
		}
	}
	
	
	public String toString() {
		
		return String.format("Nome:%s \tGenero:%c \thp:%d \tShield:%d\n",nome,genero,hp,shield); 
	}	
	
}
