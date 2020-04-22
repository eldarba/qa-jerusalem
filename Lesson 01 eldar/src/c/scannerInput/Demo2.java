package c.scannerInput;

import java.util.Scanner;

public class Demo2 {

	/*
	 * get 2 numbers as input and print the sum
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// get the 1st number
		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		// get the 2nd number
		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		sc.close();

		// calculate sum
		int sum = a + b;

		// print the sum
		System.out.println(sum);
		// you can concatenate your answer
		System.out.println("sum: " + sum);
		System.out.println(a + " + " + b + " = " + sum);

	}

}
