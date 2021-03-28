package com.callor.controller;

import java.util.Random;

public class Controller_11A {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[5];

		for (int i = 0; i < 5; i++) {
			intNums[i] = rnd.nextInt(100) + 1;

		}
		for (int i = 0; i < 5; i++) {
			if (intNums[i] % 3 == 0) {
				System.out.println(intNums[i] + "는(은) 3의 배수");
			} else {
				System.out.println(intNums[i] + "는(은) 3의 배수아님");
			}
		}
	}
}
