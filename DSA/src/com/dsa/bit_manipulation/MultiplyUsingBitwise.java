package com.dsa.bit_manipulation;

public class MultiplyUsingBitwise {
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	// IMPORTANT
	public static int multiply(int a, int b) {
		int result = 0;
		boolean isNegative = (b < 0);
		b = Math.abs(b);
		while (b > 0) {
			System.out.println("a ->" + a + " | b -> " + b);
			if ((b & 1) != 0) {
				result += a;
			}
			a <<= 1;
			b >>= 1;
		}
		return isNegative ? -result : result;
	}

	public static void main(String[] args) {
//        System.out.println(multiply(5, 3)); // Output: 15
//        System.out.println(multiply(-5, 3)); // Output: -15
		System.out.println(multiply(15, 7));
	}
}
