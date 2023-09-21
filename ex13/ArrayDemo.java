package ex13;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		int array[];
		array = new int[10];
		Scanner teclas  = new Scanner(System.in);
		for(int i = 0; i < 10 ;i++)
		{
			System.out.printf("insira o numero %d:",i+1);
			 array[i] = teclas.nextInt();
			
		}
		for(int x = 0; x < 10;x++)
		{
			System.out.printf("Numero %d:%d\n",x+1,array[x]);
		}
		teclas.close();
	}

}
