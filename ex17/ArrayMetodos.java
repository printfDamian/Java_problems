package ex17;
import java.util.Arrays;
import java.util.Random;
public class ArrayMetodos {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int nums[] = new int[20];
		//Numeros aleatorios de 5 a 20
		for(int i = 0; i < nums.length;i++)
		{
			int aleat = gerador.nextInt(16)+5;
			nums[i] = aleat;
		}
		
		System.out.printf("Array original: %s\n",Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.printf("Array ordenada: %s\n",Arrays.toString(nums));
			int pos8 = Arrays.binarySearch(nums, 8);
			if(pos8 < 0)
				System.out.printf("Não existem 8's na array\n");
			else
				System.out.printf("8 está na posição %d\n",pos8);
			
			int pos18 = Arrays.binarySearch(nums, 18);
			
			if(pos18 < 0)
				System.out.printf("Não existem 18's na array\n");
			else
				System.out.printf("18 está na posição %d\n",pos18);
			Arrays.fill(nums,0);
			System.out.printf("Array Limpa: %s\n",Arrays.toString(nums));
			
	}

}
