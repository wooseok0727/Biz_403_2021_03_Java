package com.callor.method.service;

import java.util.Scanner;

/* 
 * 1. NumberServiceV3 클래스에
 * 2. inputNum() method를 선언합니다.
 * 3. Scanner 클래스를 사용하여 0 ~ 100까지 중 정수를 입력 받습니다
 * 4. 입력을 취소 하고 싶으면 QUIT를 입력합니다
 * 5. QUIT를 입력했으면 null을
 * 	  정수를 입력했으면 입력한 값을 return 합니다
 * 
 * 6. 입력 오류에 대한 예외처리를 추가합니다.
 * 7. 정수 값의 유효성 검사를 수행합니다.
 */
public class NumberServiceV3 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("0 ~ 100 범위의 정수를 입력");
			System.out.println("QUIT 입력하면 종료");
			System.out.print(">> ");
			String strNum = scan.nextLine();      // 정수 입력받기
			if (strNum.trim().equals("QUIT")) {   // QUIT 유효성 검사
				return null;
			}

			Integer intNum = 0;
			try {								   // 예외처리 try catch
				intNum = Integer.valueOf(strNum);  // 입력된 값이 정수면 Integer형으로 변환하기
			} catch (NumberFormatException e) {    // 입력된 값이 정수가 아니면 안내메세지 출력 후 돌아가라
				System.out.println("0 ~ 100 범위 정수만 입력!");
				continue;
			}									  // 입력된 값이 정수이다
			if (intNum < 0 || intNum > 100) {     // 그러면 정수값 범위 유효성 검사 시작 
				System.out.println("0 ~ 100 범위 정수만 입력!"); // 0~100 아니면 안내메세지 출력 후 돌아가라
				continue;
			}
			return intNum;  // 전부 통과했으니 그 정수를 호출한곳으로 반환한다
		}
	} // end inputNum()

}
