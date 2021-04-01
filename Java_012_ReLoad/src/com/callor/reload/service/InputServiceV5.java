package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.service.model.NumberVO;

/*
 * 1. InputServiceV5 class의 클래스 영역에
 *    Scanner scan;
 *    List<NumberVO> numList 객체 선언
 * 2. 클래스 생성자에서 scan, numList 객체 생성(초기화)
 * 
 * 3. inputNum() 선언 키보드를 통해 2개의 정수를 입력 받아 numList 에 추가
 *    이때, 두번쨰 입력한 정수는 처음 값보다 작아야 합니다.
 * 4. printNum() method 에서
 *    numList의 요소에 저장된 두 정수의 뺄셈을 계산하여 출력   
 */
public class InputServiceV5 {

	protected Scanner scan;
	protected List<NumberVO> numList;

	public InputServiceV5() {

		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {

		Integer intNum1 = 0;
		Integer intNum2 = 0;
		while (true) {
			System.out.println("정수 2개 뺄셈하기");
			System.out.println("2번째 정수는 1번째보다 작게");
			System.out.print("정수1 >> ");
			String strNum1 = scan.nextLine();
			try {
				intNum1 = Integer.valueOf(strNum1);
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
				continue;
			}
			
			System.out.print("정수2 >> ");
			String strNum2 = scan.nextLine();
			try {
				intNum2 = Integer.valueOf(strNum2);
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
				continue;
			}
			if (intNum2 > intNum1) {
				System.out.println("첫번째 입력값보다 작은수 입력");
				continue;
			}
			break;
		}
		NumberVO nVO = new NumberVO();
		nVO.setNum1(intNum1);
		nVO.setNum2(intNum2);
		numList.add(nVO);
	}
	
	public void printNum( ) {
		
		System.out.println("=".repeat(30));
		for(int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
			int num1 = vo.getNum1();
			int num2 = vo.getNum2();
			System.out.printf("%d - %d = %d\n",num1 ,num2, (num1 - num2) );
		}
		// System.out.println(numList.get(0).getNum1()); 이렇게도 볼수있네
		// System.out.println(numList.get(0).getNum2());
		System.out.println("=".repeat(30));
	}
}
