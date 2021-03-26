package com.callor.apps.service;

import java.util.Random;

public class TimeServiceV1 {

	int[] intNums;

	public TimeServiceV1() {

		intNums = new int[8];
	}
	public void makeTime() {

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = i + 2;
		}
	}
	public void printTime() {
		
		for (int i = 0; i < intNums.length; i++) {
			System.out.println("===========================");
			System.out.printf("%d 단\n", intNums[i]);
			System.out.println("===========================");

			int nCount = 1;
			for (int j = 0; j < intNums.length; j++) {
				int num = intNums[i];
				nCount++;
				System.out.printf("%d x %d = %2d\n", num, nCount, num * nCount);
			}
			System.out.println("===========================");
		}
	}

}
