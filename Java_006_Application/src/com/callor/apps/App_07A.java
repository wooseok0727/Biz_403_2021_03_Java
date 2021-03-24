package com.callor.apps;

import java.util.Random;

public class App_07A {

	public static void main(String[] args) {

		int numsLength = 5;
		int[] intNums = new int[numsLength];

		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}

		for (int num : intNums) {
			System.out.print(num + "   ");
		}
		System.out.println();
		System.out.println("======================");
		System.out.println("오름차순 정렬(작=>큰");
		System.out.println("======================");

		int temp = 0;
		for (int i = 0; i < intNums.length; i++) {
			for (int j = i; j < intNums.length; j++) {
				if (intNums[i] > intNums[j]) {
					temp = intNums[i];
					intNums[i] = intNums[j];
					intNums[j] = temp;
				}
			}
		}
		for (int num : intNums) {
			System.out.print(num + "   ");
		}

	}
}
