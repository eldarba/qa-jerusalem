package b.primitives;

public class Demo1 {

	/*
	 * bit - BInary digiT - the digits 0 and 1
	 * 
	 * סיבית - ספרה בינארית
	 * 
	 * byte - a group of 8 bits: 00000010
	 * 
	 */

	public static void main(String[] args) {
		// primitives are the most simple types in java:

		// integers - שלמים
		byte n1 = 127; // 8 bit -128 to 127
		short n2 = 32767; // 16 bit
		int n3 = 2147483647; // 32 bit - most used
		long n4 = 9223372036854775807L; // 64 bit

		// decimal - עשרוניים
		float n5 = 5.8F; // 32 bit
		double n6 = 5.3; // 64 bit - most used

		System.out.println(n1);
		System.out.println(n5);
		System.out.println(n6);

		System.out.println("==============");
		// logical
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10 > 5;
		boolean b4 = 10 < 5;

		System.out.println(b3);
		System.out.println(b4);

		System.out.println("==============");
		// character - 16 bit unicode

		char c1 = 'A';
		char c2 = 65;
		char c3 = '0';
		char c4 = 48;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}

}
