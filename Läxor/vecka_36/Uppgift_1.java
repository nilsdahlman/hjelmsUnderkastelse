package vecka_36;


public class Uppgift_1 {

	public static void main(String[] args) {
		
		int someArray[] = {1, 9, 3, 30, 41, 6, 26, 8, 92, 10};
		int summa = 0;

		for (int i : someArray)
		    summa += i;
		
		System.out.println(summa);
	}
}
