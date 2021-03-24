package com.callor.apps;

/*
 * 정수형 배열을 20개 선언
 * 짝수들의 리스트 출력
 * 짝수들의 합을 계산하여 출력
 */

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		int[] intNums = new int[20];

		Random rnd = new Random();

		for (int i = 0; i < 20; i++) {
			int num = rnd.nextInt(100) + 1;
			intNums[i] = num;
		}
		for (int i = 0; i < 20; i++) {
			if (intNums[i] % 2 == 0) {
				System.out.println("짝수 : " + intNums[i]);
			}
		}
		int intSum = 0;

		for (int i = 0; i < 20; i++) {
			if (intNums[i] % 2 == 0) {
				intSum += intNums[i];
			}
		}
		System.out.println("짝수의 합 : " + intSum);
	}
}
