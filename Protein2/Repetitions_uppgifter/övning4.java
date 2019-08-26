package Repetitions_uppgifter;

import java.util.Scanner;

public class övning4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("skriv in två heltal");
		
		int ett = sc.nextInt();
		int två = sc.nextInt();
		
		if (ett < två) {
			System.out.println(ett);
		
		}
		else {
			System.out.println(två);
		}
		
	}
}
