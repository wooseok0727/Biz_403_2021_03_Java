package com.callor.fine;

public class MainEx_07 {

	/*
	 * ===============================
	 * 5단 구구단
	 * -------------------------------
	 * 5 x 1 = 5
	 * 5 x 2 = 10
	 * 5 x 3 = 15
	 * 5 x 4 = 20
	 * 5 x 5 = 25
	 * 5 x 6 = 30
	 * 5 x 7 = 35
	 * 5 x 8 = 40
	 * 5 x 9 = 45
	 * ===============================
	 */
	
	public static void main(String[] args) {
		
		int dan = 5;
		int danLength = 9;
		
		System.out.println("=".repeat(20));
		System.out.println(dan + "단 구구단");
		System.out.println("-".repeat(20));
		for(int i = 0; i < danLength; i++ ) {
			int count = i+1;
			System.out.printf("%d x %d = %2d\n",dan, count, dan * count);
		}
		System.out.println("=".repeat(20));
	}
}
