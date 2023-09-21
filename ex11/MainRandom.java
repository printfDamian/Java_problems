package ex11;
import java.util.Random;
public class MainRandom {

	public static void main(String[] args) {
		Random gerador = new Random();
		int n1,n2,n3,n4,n5,e1,e2;
		n1 = gerador.nextInt(50)+1;
		n2 = gerador.nextInt(50)+1;
		n3 = gerador.nextInt(50)+1;
		n4 = gerador.nextInt(50)+1;
		n5 = gerador.nextInt(50)+1;
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n ",n1,n2,n3,n4,n5);
		e1 = gerador.nextInt(12+1);
		e2 = gerador.nextInt(12+1);
		System.out.printf("Estrelas: \n %d \t%d \n",e1,e2);
		
	}

}
