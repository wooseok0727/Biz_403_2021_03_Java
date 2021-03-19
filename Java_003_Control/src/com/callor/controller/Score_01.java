package com.callor.controller;

public class Score_01 {

	public static void main(String[] args) {
		
		int intKor = 80;
		int intEng = 77;
		int intMath = 65;
		
		int intSum =0;
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		int intAvg = 0;
		intAvg = intSum / 3;
		
		System.out.println("==============================");
		System.out.printf("국어 : %d\n", intKor);
		System.out.printf("영어 : %d\n", intEng);
		System.out.printf("수학 : %d\n", intMath);
		System.out.println("------------------------------");
		System.out.printf("총점 : %d\t평균 : %d\n",intSum,intAvg);
		System.out.println("==============================");
		
		/*
		 * printf() 사용하여 출력할때
		 * %d : 정수(십진수)
		 * 		%3d : 자릿수를 3개로 맞추고 값을 오른쪽정렬
		 * %f : 실수(float)
		 * 		%3.2f : 소수점이하 2째자리까지 표시
		 * %s : 문자열
		 * 
		 * \n : Enter를 누른것처럼 줄바꿈을 실행
		 * \t : Tab을 누른것처럼 사이띄기를 일정하게 맞추어라
		 * 
		 */
	}
}
