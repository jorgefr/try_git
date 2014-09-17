package com.trygit;




public class Main {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		printFibonaccis();
	}

	public static void printFibonaccis() {
		System.out.println(getNthFibonacciRecursively(3));
		System.out.println(getNthFibonacciRecursively(6));
		System.out.println(getNthFibonacciRecursively(7));
		System.out.println(getNthFibonacciRecursively(8));
	}

	public static long getNthFibonacciRecursively(final long i) {
		long fib2 = 0;
		long fib1 = 1;
		if (i == 1) {
			return fib1;
		}
		if (i == 2) {
			return fib2;
		}
		long fibk = 0;
		for (int k = 2; k <= i; k++) {
			fibk = fib1 + fib2;
			fib2 = fib1;
			fib1 = fibk;
		}
		return fibk;
	}
}
