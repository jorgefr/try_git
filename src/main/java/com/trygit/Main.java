package com.trygit;




public class Main {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		//		new Apple();
		System.out.println(getNthFibonacci(3));
		System.out.println(getNthFibonacci(6));
		System.out.println(getNthFibonacci(7));
		System.out.println(getNthFibonacci(8));
		//		new RedApple().atest2();

	}

	public static long getNthFibonacci(final long i) {
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
