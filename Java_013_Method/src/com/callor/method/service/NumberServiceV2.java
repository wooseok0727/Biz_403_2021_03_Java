package com.callor.method.service;

import java.util.Scanner;

/* 
 * 1. NumberServiceV2 클래스에
 * 2. inputNum() method를 선언합니다.
 * 3. Scanner 클래스를 사용하여 0 ~ 100까지 중 정수를 입력 받습니다
 * 4. 입력을 취소 하고 싶으면 QUIT를 입력합니다
 * 5. QUIT를 입력했으면 null을
 * 	  정수를 입력했으면 입력한 값을 return 합니다
 */
public class NumberServiceV2 {

	/*
	 * 정수를 키보드에서 입력받아 
	 *  정수를 return 하거나 		   : int 
	 *  QUIT 를 입력하면 null을 return : AND null = > Integer 
	 * void 대신 Integer
	 */
	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);

		System.out.println("0 ~ 100 범위의 정수를 입력");
		System.out.println("QUIT 입력하면 종료");
		System.out.print(">> ");
		String strNum = scan.nextLine();
		if (strNum.equals("QUIT")) {
			return null;
		} else {
			
			Integer intNum = Integer.valueOf(strNum);
			return intNum;
		}
		
	} // end inputNum()

}
