package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 1. InpuetServiceV1 class의 클래스 영역에
 * 	  List<Integer> intList 리스트 객체선언,
 * 	  키보드 입력 받기 위한 Scanner scan 객체 선언
 * 2. 클래스 생성자에서 intList, scan 객체 생성(초기화)
 * 3. inputNum() method를 선언하고,
 * 	  키보드로 정수를 입력 받아, intList 객체에
 * 	  추가(add) 하는 코드 작성
 * 4. Prompt 등을 적절히 추가하여 작성
 * 5. printNum() method를 선언하고, 입력된 리스트를 
 * 	  출력하는 코드 작성
 */
public class InputServiceV1 {
	// TODO 객체 선언
	protected List<Integer> intList;
	protected Scanner scan;

	public InputServiceV1() {
		// TODO 객체 생성(초기화)
		intList = new ArrayList<Integer>();
		scan = new Scanner(System.in);
	}

	public Integer inputNum() {
		// TODO 키보드로 입력된 정수를 intList 객체에 저장하기
		Integer num1 = 0;
		while (true) {
			System.out.println("정수 1개를 입력하세요(QUIT : -1)");
			System.out.print(">> ");
			String strNum1 = scan.nextLine();
			if (strNum1.equals("-1")) {
				return null;
			}
			try {
				num1 = Integer.valueOf(strNum1);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자만 입력주세요");
				System.out.println("=================");
				continue;
			}
			break;
		}
		intList.add(num1);
		return 0;
	}

	public void printNum() {
		// TODO 입력된 정수 리스트 출력하기
		System.out.println("=".repeat(30));
		System.out.println("입력된 정수 리스트");
		System.out.println("-".repeat(30));
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		System.out.println("=".repeat(30));
		System.out.println(intList);

	}

}
