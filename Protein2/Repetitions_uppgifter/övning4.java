package Repetitions_uppgifter;

import java.util.Scanner;

public class �vning4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("skriv in tv� heltal");
		
		int ett = sc.nextInt();
		int tv� = sc.nextInt();
		
		if (ett < tv�) {
			System.out.println(ett);
		
		}
		else {
			System.out.println(tv�);
		}
		
	}
}
