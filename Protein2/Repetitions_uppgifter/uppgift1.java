package Repetitions_uppgifter;

public class uppgift1 {
	public static void main(String[] args) {
		int[] siffror = {1, 8, 19, 72, 4};
		
		
		int summa = 0;
		for (int j = 0; j < siffror.length; j++) {
			summa += siffror[j];
		}
		System.out.println(summa);
	}
	
}
