package Repetitions_uppgifter;

import java.util.Scanner;

public class övning3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("skriv in en radie på en cirkel");
		double radie = sc.nextDouble();
		
		System.out.println("cirkelns volym:");
		System.out.println((4*3.1415*Math.pow(radie, 3))/3);
	}
}
