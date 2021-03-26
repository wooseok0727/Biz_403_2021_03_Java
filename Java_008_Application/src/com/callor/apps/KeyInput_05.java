package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {

	public static void main(String[] args) {

		int num = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println(LinesService.dLines(35));
		System.out.println("정수 1개를 입력 후 Enter");
		System.out.println(LinesService.sLines(35));
		System.out.print(">>> ");
		num = scan.nextInt();
		System.out.println(LinesService.dLines(35));

		if (num % 2 == 0) {
			System.out.printf("입력한 정수 %d(은)는 짝수입니다\n", num);
		} else {
			System.out.printf("입력한 정수 %d(은)는 짝수가 아닙니다\n", num);
		}
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.printf("입력한 정수 %d(은)는 소수입니다\n", num);
		} else {
			System.out.printf("입력한 정수 %d(은)는 소수가 아닙니다\n", num);
		}
		System.out.println(LinesService.dLines(35));
	}
}
