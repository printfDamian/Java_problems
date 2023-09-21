package ex12;
import java.util.Random;
public class MaiTempMinMax {

	public static void main(String[] args) {
		Random gerador = new Random();
		double janMin,janMax,fevMin,fevMax,marMin,marMax,abrilMin,abrilMax;
		
		janMin = gerador.nextDouble()*14+2;  // entre 2 e 15
		janMax = gerador.nextDouble()*23+16; // entre 16 e 38
		
		fevMin = gerador.nextDouble()*14+2;
		fevMax = gerador.nextDouble()*23+16;
		
		marMin = gerador.nextDouble()*14+2;
		marMax = gerador.nextDouble()*23+16;
		
		abrilMin = gerador.nextDouble()*14+2;
		abrilMax = gerador.nextDouble()*23+16;
		double mediajan = (janMax + janMin)/2;
		double mediafev = (fevMax + fevMin)/2;
		double mediamar = (marMax + marMin)/2;
		double mediaabril = (abrilMax + abrilMin)/2;
		
		double mediaanual = (mediajan + mediafev + mediamar + mediaabril)/4;
		
		System.out.printf("Janeiro:\n\nMinima: %.2f ºC\t Máxima: %.2f ºC\n",janMin,janMax);
		System.out.printf("Fevereiro:\n\nMinima: %.2f ºC\t Máxima: %.2f ºC\n",fevMin,fevMax);
		System.out.printf("Março:\n\nMinima: %.2f ºC\t Máxima: %.2f ºC\n",marMin,marMax);
		System.out.printf("Abril:\n\nMinima: %.2f ºC\t Máxima: %.2f ºC\n",abrilMin,abrilMax);
		System.out.printf("A media anual é:%.2f ºC\n",mediaanual);
		if(janMax>fevMax && janMax > marMax && janMax > abrilMax)
			System.out.println("Janeiro foi mes mais quente");
		else if (fevMax > marMax && fevMax >abrilMax)
			System.out.println("Abril foi mes mais quente");
		else if(marMax > abrilMax)
			System.out.println("Abril foi mes mais quente");
		else 
			System.out.println("Abril foi mes mais quente");
		
		if(janMin<fevMin && janMin < marMin && janMin < abrilMin)
			System.out.println("Janeiro foi mes mais frio");
		else if (fevMax < marMin && fevMin < abrilMin)
			System.out.println("Abril foi mes mais frio");
		else if(marMin < abrilMin)
			System.out.println("Abril foi mes mas frio");
		else 
			System.out.println("Abril foi mes mais frio");
			
		
	}

}
