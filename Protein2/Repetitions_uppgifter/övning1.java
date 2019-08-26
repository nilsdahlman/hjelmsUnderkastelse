package Repetitions_uppgifter;

public class övning1 {
	public static void main(String[] args) {
		int[] siffror = new int[30];
		
		for (int i = 0; i < siffror.length; i++) {
			siffror[i] = i+1;
		}
		
		int summa = 0;
		
		for (int i = 0; i < siffror.length; i++) {
			summa += siffror[i];
		}
		
		System.out.println(summa);
		
	}
}
