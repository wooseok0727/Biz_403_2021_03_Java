package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		int numsLength = 20;
		int[] intNums = new int[numsLength];

		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
		}
	}
}
