package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		String str = scan.nextLine();
		System.out.println("입력한 문자열 : " + str);
		// 문자열을 비교할때 == (동등연산자)를 쓰면 안된다
		if(str.equals("END")) {  
			System.out.println("안녕!!!");
		} else {
			System.out.println("반가워!!!");
		}
	}
}
