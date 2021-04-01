package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.service.model.NumberVO;

/*
 * 1. InputServiceV4 class의 클래스 영역에
 *    Scanner scan;
 *    List<NumberVO> numList 객체 선언
 * 2. 클래스 생성자에서
 * 	  scan, numList 객체 생성(초기화)
 * 3. inputNum() method 에서
 * 	  키보드를 통해 2개의 정수를 입력 받아 numList 에 추가
 * 4. printNum() method에서 numList에 저장된 리스트 출력 
 */
public class InputServiceV4 {

	protected Scanner scan;
	protected List<NumberVO> numList;

	public InputServiceV4() {

		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {

		while (true) {
			Integer intnum1 = 0;
			Integer intnum2 = 0;
			System.out.println("정수 2개를 입력해주세요");
			System.out.print("정수1 >> ");
			String strNum1 = scan.nextLine();
			try {
				intnum1 = Integer.valueOf(strNum1);
			} catch (Exception e) {
				System.out.println("잘못 입력했습니다");
				continue;
			}
			System.out.print("정수2 >> ");
			String strNum2 = scan.nextLine();
			try {
				intnum2 = Integer.valueOf(strNum2);
			} catch (Exception e) {
				System.out.println("잘못 입력했습니다");
				continue;
			}
			NumberVO nVO = new NumberVO();
			nVO.setNum1(intnum1);
			nVO.setNum2(intnum2);

			numList.add(nVO);
			this.printNum(nVO);
			break;
		}
	}
	public void printNum(NumberVO nVO) {
		
		System.out.println("=".repeat(30));
		System.out.println(nVO.getNum1());
		System.out.println(nVO.getNum2());
		System.out.println("=".repeat(30));

	}

}
