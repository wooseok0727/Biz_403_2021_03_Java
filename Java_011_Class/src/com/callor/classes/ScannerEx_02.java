package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 숫자를 입력받는 nextInt()와
		// 문자열을 입력받는 nextLine() 을 혼합하여
		// 코드를 작성하면 여러가지 문제가 
		// 발생하기도 한다
		System.out.print("국어 >> ");
		int intKor = scan.nextInt();
		// scan.nextLine();  nextLine() 을 한번 더 써써 개행문자 제거하면 해결
		System.out.print("이름 >> ");
		String strName = scan.nextLine();
		
		
		System.out.printf("%s 의 국어 성적 : %d\n", strName ,intKor);
		
		
	}
}
