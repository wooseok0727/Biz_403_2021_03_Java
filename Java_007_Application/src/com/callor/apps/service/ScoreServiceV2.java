package com.callor.apps.service;

import java.util.Random;

/* 10명 학생의 국어, 영어, 수학 점수를 배열에 저장하고
 * 학생들의 총점, 평균을 계산하여
 * 성적리스트를 출력합니다
 * ScoreServiceV1 에 method를 구현하고
 * App_08 클래스의 main() method에서 호출하여 구현합니다.
 *  
 */
public class ScoreServiceV2 extends ScoreServiceV1 {

	// for(int i = 0)
	// int members = 5
	// method의 괄호() 안에 선언된 변수
	// 매개변수, parameter 라고 한다.
	public ScoreServiceV2(int members) { 

		intNum = new int[members];
		intKor = new int[intNum.length];
		intEng = new int[intNum.length];
		intMath = new int[intNum.length];

		intSum = new int[intNum.length];
		floatAvg = new float[intNum.length];
	}
}
