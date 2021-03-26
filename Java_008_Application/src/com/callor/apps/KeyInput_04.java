package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {

	public static void main(String[] args) {

		int[] intNum = new int[5];

		Scanner scan = new Scanner(System.in);

		int lineLength = 40;
		System.out.println(LinesService.dLines(lineLength));
		System.out.println("정수 5개의 합");
		System.out.println(LinesService.dLines(lineLength));

		for (int i = 0; i < intNum.length; i++) {
			System.out.println(i + 1 + "번째 정수를 입력하고 Enter를 눌러주세요");
			System.out.print(">>> ");
			intNum[i] = scan.nextInt();
			System.out.println();
		}
		System.out.println(LinesService.dLines(lineLength));
		System.out.println("결과");
		System.out.println(LinesService.sLines(lineLength));

		int intSum = 0;
		for (int i = 0; i < intNum.length; i++) {
			System.out.print(intNum[i]);
			intSum += intNum[i];
			if (i + 1 < intNum.length) {
				System.out.print(" + ");
			} else {
				System.out.print(" = ");
			}
		}
		System.out.println(intSum);
		System.out.println(LinesService.dLines(lineLength));

	}
}
