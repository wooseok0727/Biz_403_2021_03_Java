package com.callor.controller;

import java.util.Random;

public class Controller_14 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		int intSum = 0;
		float floatAvg = 0.0f;
		
		intKor = rnd.nextInt(100) + 1;
		intEng = rnd.nextInt(100) + 1;
		intMath = rnd.nextInt(100) + 1;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		floatAvg = (float)intSum / 3;
		
		System.out.println("===============================");
		System.out.printf("국어 : %3d\n",intKor);
		System.out.printf("영어 : %3d\n",intEng);
		System.out.printf("수학 : %3d\n",intMath);
		System.out.println("-------------------------------");
		System.out.printf("총점 : %3d\t평균 : %3.2f\n",intSum,floatAvg);
		System.out.println("===============================");
		
	}
}
