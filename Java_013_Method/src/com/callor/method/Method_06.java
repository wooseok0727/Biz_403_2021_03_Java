package com.callor.method;

public class Method_06 {

	public static void main(String[] args) {
		
		/*
		 * 무조건 intNum는 0인 상태에서
		 * strNum값을 정수로 변환하고
		 * 변환된 값을 출력
		 */
		String strNum = "100";
		Integer intNum = 0;
		if(intNum >= 0 && intNum <= 100) {             // 14 ~ 21행까지 잘못된 코드
			try {									   // intNum 값을 만들지 않아서 유효성 검사가 되지않는다
				intNum = Integer.valueOf(strNum);	   // 코드 진행 순서를 잘 생각해야 한다.
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자 변환 오류");
			}
		}
		System.out.println(intNum);
		
		//1 내가 비교하고자 하는 값을 먼저 만들고
		try {
			intNum = Integer.valueOf(strNum);
			if(intNum < 0 || intNum  > 100) {
				System.out.println("범위초과");
				// return null
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
