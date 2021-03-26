package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(LinesService.dLines(50));
		System.out.println("정수의 4칙 연산");
		System.out.println(LinesService.sLines(50));
		System.out.println("정수값 2개를 키보드로 입력하고 Enter");
		System.out.println(LinesService.sLines(50));
		System.out.println("먼저 정수 1개를 입력하세요");
		System.out.println();
		System.out.print("정수1 : ");
		int num1 = scan.nextInt();
		System.out.println();
		
		System.out.println("2번째 정수를 입력하세요");
		System.out.println();
		System.out.print("정수2 : ");
		int num2 = scan.nextInt();
		System.out.println();
		
		System.out.println(LinesService.dLines(50));
		System.out.println("결과");
		System.out.println(LinesService.dLines(50));
		System.out.printf(" %2d + %2d = %3d\n",num1,num2,num1+num2);
		System.out.printf(" %2d - %2d = %3d\n",num1,num2,num1-num2);
		System.out.printf(" %2d x %2d = %3d\n",num1,num2,num1*num2);
		System.out.printf(" %2d / %2d = %3d\n",num1,num2,num1/num2);
		System.out.println(LinesService.dLines(50));
		
		
	}
}
