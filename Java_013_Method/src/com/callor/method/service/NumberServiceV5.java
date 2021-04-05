package com.callor.method.service;

import java.util.Scanner;

/*
 *  1. NumberServiceV5 클래스를 선언
 *  2. inputNum(String title) method를 선언
 *  3. title 변수에 담긴 문자열을 연결하여 다음과 같은
 *     Prompt를 보여줍니다
 *     ** 값을 입력하세요
 *     >>
 *  4. NumberServiceV4 클래스의 inputNum() method를 참조하여
 *  5. 입력 오류에 대한 예외처리
 *  6. 정수 0 ~ 100 범위의 유효성 검사를 수행하고 정수 return
 *  7. 입력 중 QUIT를 입력하면 null 을 return   
 */
public class NumberServiceV5 {

	public Integer inputNum(String title) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(title + " 값을 입력하세요");
			System.out.println("범위는 0 ~ 100 (QUIT : 종료)");
			System.out.print(">> ");
			String strPrice = scan.nextLine();
			Integer intPrice = 0;

			if (strPrice.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intPrice = Integer.valueOf(strPrice);
				} catch (NumberFormatException e) {
					System.out.println("값은 숫자만 입력하세요");
					continue;
				}
				if (intPrice < 0 || intPrice > 100) {
					System.out.println("범위를 벗어났습니다");
					continue;
				}
			}
			return intPrice;
		}

	}
}
