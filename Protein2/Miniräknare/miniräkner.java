package Miniräknare;

import java.util.Scanner;

public class miniräkner {
	public static void main(String[] args) {

		System.out.println("Enter first and second number:");
		Scanner inp = new Scanner(System.in);
		double num1 = inp.nextDouble();
		String tecken = inp.next();
		double num2 = inp.nextDouble();

		if (tecken.equals("+")) {
			System.out.println(num1 + num2);
		}
		if (tecken.equals("-")) {
			System.out.println(num1 - num2);
		}
		if (tecken.equals("*")) {
			System.out.println(num1 * num2);
		}
		if (tecken.equals("/")) {
			System.out.println((double) num1 / num2);
		}

	}

}
