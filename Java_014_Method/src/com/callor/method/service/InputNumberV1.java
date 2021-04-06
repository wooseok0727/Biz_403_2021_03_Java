package com.callor.method.service;

import java.util.Scanner;

/*
 *  1. inputValue(String title) method를 선언
 *  2. title + " 값을 입력하세요" prompt 를 보여주고
 *  3. 정수 또는 QUIT 를 키보드를 통해 입력 받는다
 *  4. 입력 값이 QUIT이면 null을 return 하고
 *  5. 정수이면 정수 값을 return 한다.
 */
public class InputNumberV1 {

	protected Scanner scan;

	public InputNumberV1() {

		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {

		while (true) {
			System.out.println(title + " 값을 입력하세요(QUIT 입력시 종료)");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			if (strInput.trim().equals("QUIT")) {
				return null;
			}
			Integer intInput = null;
			try {
				intInput = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				System.out.println("정수 또는  QUIT만 입력");
				continue;
			}
			return intInput;
		} // end while()
	} // end inputValue(String title)
}
