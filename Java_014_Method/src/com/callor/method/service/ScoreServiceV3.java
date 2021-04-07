package com.callor.method.service;

/*
 * 1. inputScore() method를 선언하고
 * 2. InputServiceV2 클래스를 사용하여
 * 3. 국어, 영어, 수학 점수를 입력 받고
 * 4. 각각 intKor, intEng, intMath 변수에 저장
 * 5. 각 점수는  0 ~ 100점 범위 내에서 입력
 * 6. 입력 받은 3 과목의 총점과 평균을 계산하여 출력
 */
public class ScoreServiceV3 {
	
	public void inputScore() {
		
		InputServiceV2 inService = new InputServiceV2();
		
		String[] strSub = {"국어","영어","수학"};
		Integer[] intScore = new Integer[strSub.length];
		
		for(int i = 0; i < strSub.length; i++) {
			intScore[i] = inService.inputValue(strSub[i], 0, 100);
			if(intScore[i] == null) {
				return;
			}
		}
		int intKor = intScore[0];
		int intEng = intScore[1];
		int intMath = intScore[2];
		
		int sum = intKor + intEng + intMath;
		float avg = (float)sum / strSub.length ;
	
		System.out.println("=".repeat(40));
		System.out.printf("총점 : %d\t",sum);
		System.out.printf("평균 : %3.2f\n",avg);
		System.out.println("=".repeat(40));
	}
}
