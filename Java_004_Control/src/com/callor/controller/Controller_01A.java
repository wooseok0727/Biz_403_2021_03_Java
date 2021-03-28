package com.callor.controller;

public class Controller_01A {

	public static void main(String[] args) {

		int intNum1 = 0;
		int intNum2 = 0;
		int intNum3 = 0;

		for (int i = 0; i < 100; i++) {
			int num = (i + 1);
			if (num % 3 == 0) {
				intNum1 += num;
				if (num % 5 == 0) {
					intNum3 += num;
				}
			}
			if (num % 4 == 0) {
				intNum2 += num;
			}

		}

		System.out.println("==========================");
		System.out.println("3의 배수의 합 : " + intNum1);
		System.out.println("4의 배수의 합 : " + intNum2);
		System.out.println("3의 배수이면서 5의 배수인 합 : " + intNum3);
		System.out.println("==========================");

	}
}
