package com.callor.app.service;

import java.util.Scanner;

/*
 *  1. inputValue(String title),
 *     inputValue(String title, int start),
 *     inputValue(String title, int start, int end)
 *     method를 선언
 *  2. title + "값을 입력하세요" prompt를 보여주고
 *  3. 정수 또는 QUIT 를 키보드를 통해 입력 받는다.
 *  4. 입력 값이 QUIT이면 null을 return 하고
 *  5. 정수이면 입력한 정수 값을 return 한다.
 *  6. Exception이 발생할 경우 적절한 예외 처리를 수행한다.   
 */
public class InputServiceV1 {

	protected Scanner scan;

	public InputServiceV1() {

		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {

		while (true) {
			System.out.println(title + "값을 입력하세요(QUIT:입력종료)");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			if (strInput.trim().equals("QUIT")) {
				System.out.println("종료");
				return null;
			}
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strInput.trim());
			} catch (NumberFormatException e) {
				System.out.println("정수 또는 QUIT만 입력하세요");
				continue;
			}
			return intNum;
		} // end while()
	} // end inputValue(String title)

	public Integer inputValue(String title, int start) {

		title = String.format("%s (%d ~ )범위 ", title, start);
		while (true) {
			System.out.println(title + "값을 입력하세요(QUIT:입력종료)");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			if (strInput.trim().equals("QUIT")) {
				System.out.println("종료");
				return null;
			}
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strInput.trim());
			} catch (NumberFormatException e) {
				System.out.println("정수 또는 QUIT만 입력하세요");
				continue;
			}
			return intNum;
		} // end while()
	} // end inputValue(String title, int start)

	public Integer inputValue(String title, int start, int end) {

		title = String.format("%s (%d ~ %d)범위 ", title, start, end);
		while (true) {
			System.out.println(title + "값을 입력하세요(QUIT:입력종료)");
			System.out.print(">> ");
			String strInput = scan.nextLine();  	// 정수 또는 QUIT 입력받기 
			if (strInput.trim().equals("QUIT")) {  
				System.out.println("종료");
				return null;
			}
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strInput.trim());
			} catch (NumberFormatException e) {
				System.out.println("정수 또는 QUIT만 입력하세요");
				continue;
			}
			return intNum;
		} // end while()
	} // end inputValue(String title, int start, int end)
}
