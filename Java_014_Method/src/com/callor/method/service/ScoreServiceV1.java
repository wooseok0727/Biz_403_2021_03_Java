package com.callor.method.service;

/*
 *  1. InputScore() method를 선언
 *  2. InputServiceV1 의 InputValue() method에
 *  	"국어", 0, 100 값을 전달한 후
 *  3. return 된 값을 변수에 저장
 *  4. 변수에 저장 된 값이 null 이면 "종료"를 출력하고
 *  5. 변수에 저장 된 값이 정수이면 "점수 : ??" 형식으로 출력
 */
public class ScoreServiceV1 {
	
	public void inputScore() {
		
		InputServiceV1 inService = new InputServiceV1();
		
		Integer retNum = inService.inputValue("국어", 0, 100);
		if(retNum == null) {
			System.out.println("종료");
		} else {
			System.out.println("점수 : " + retNum);
		}
	}
}
