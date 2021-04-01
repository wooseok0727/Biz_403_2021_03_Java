package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 1. InputServiceV2 class의 클래스 영역에
 * 	  Scanner scan;
 * 	  List<Integer> intList 객체 선언
 * 2. 클래스 생성자에서
 * 	  scan, intList 객체 생성(초기화)
 * 3. inputNum() method 에서
 *    키보드를 통해 정수를 입력 받아 intList 에 추가
 * 4. 단, 입력받은 정수는 50 ~ 150 범위의 정수 이어야 합니다
 * 5. 유효성 검사를 수행합니다
 */
public class InputServiceV2 {

	protected Scanner scan;
	protected List<Integer> intList;

	public InputServiceV2() {

		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	}

	public Integer inputNum() {

		Integer num = 0;
		while (true) {
			System.out.println("50~ 150 범위의 정수 1개를 입력하세요(QUIT : -1)");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			if(strNum.equals("-1")) {
				return null;
			}
			try {
				num = Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println("50 ~ 150 범위내의 정수를 입력하세요");
				System.out.println("=".repeat(30));
				continue;
			}
			if ( num > 50 && num < 150) {
				intList.add(num);
				return 0;
			} else {
				System.out.println("50 ~ 150 범위내의 정수를 입력하세요");
				System.out.println("=".repeat(30));
			}
		} // end while()
	} // end inputNum
	
	public void printNum() {
		
		int nSize = intList.size();
		System.out.println("=".repeat(40));
		System.out.println("입력한 정수 개수 : " + nSize);
		System.out.println("-".repeat(40));
		for(int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + "   ");
			if( (i+1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("=".repeat(40));
	}
}
