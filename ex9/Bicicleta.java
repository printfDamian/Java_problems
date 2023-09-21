package ex9;

public class Bicicleta {
	private int referencia;
	private int  km;
	private String local;
	
	public Bicicleta(int referencia,int km,String local) {
		this.referencia = referencia;
		local = "Loures";
		km = 0;
	}
	public int getReferencia() {
		return referencia;
	}
	public int getkm() {
		return km;
	}
	public String getLocal() {
		return local;
	}
	public void adkm(int k) {
		km = km + k;
	}
	public void FazerViagem(String destino, int k) {
		local = destino;
		km = k;
	}
	public void rr() {
		km = 0;
		local = "Loures";
	}
public String toString() {
		
		return String.format("Referencia:%d \tKilometros:%d \tLocal: %s\n",referencia,km,local); 
	}	
	
}
