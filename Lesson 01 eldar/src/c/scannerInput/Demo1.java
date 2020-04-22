package c.scannerInput;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		// create a scanner object that get input from keyboard - System.in
		Scanner sc = new Scanner(System.in);

		// prompt user for input
		System.out.print("Enter your name: ");

		// get the input from the user and put it in a variable
		String name = sc.nextLine(); // the nextLine method is waiting for input

		// print the input value
		System.out.println("Hello " + name);

		// This is how you get a number as input
		int x = sc.nextInt();
		System.out.println(x);

		// when done with the scanner, we close it.
		sc.close();

	}

}
