package com.callor.controller;

public class Score_01A {

	public static void main(String[] args) {
		
		int intKor = 80;
		int intEng = 77;
		int intMath = 65;
		
		int intSum = 0;
		int intAvg = 0;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		intAvg = (intSum / 3);
		
		System.out.println("====================");
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("--------------------");
		System.out.printf("총점 : %3d\t평균 : %2d\n",intSum,intAvg);
		System.out.println("====================");
	}
}
