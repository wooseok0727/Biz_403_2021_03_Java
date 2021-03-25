package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		int numsLength = 20;
		int[] intNums = new int[numsLength];

		Random rnd = new Random();

		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
		}
		for(int arr = 0; arr < intNums.length; arr++) {
			
			int numP = intNums[arr];
			boolean Prime = true;
			for(int num = 2; num < numP; num++) {
				if(numP % num == 0) {
					Prime = false;
					break;
				}
			}
			if(Prime) {
				System.out.println(numP + "는 소수다");
			} else {
				System.out.println(numP + "는 소수가 아님");
			}
		}
	}
}
