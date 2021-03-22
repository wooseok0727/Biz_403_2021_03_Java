package com.callor.controller;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intKor1 = 0;
		int intKor2 = 0;
		int intKor3 = 0;
		int intKor4 = 0;
		int intKor5 = 0;
		int intKor6 = 0;
		int intKor7 = 0;
		int intKor8 = 0;
		int intKor9 = 0;
		int intKor10 = 0;
		
		intKor1 = rnd.nextInt(100) + 1;
		intKor2 = rnd.nextInt(100) + 1;
		intKor3 = rnd.nextInt(100) + 1;
		intKor4 = rnd.nextInt(100) + 1;
		intKor5 = rnd.nextInt(100) + 1;
		intKor6 = rnd.nextInt(100) + 1;
		intKor7 = rnd.nextInt(100) + 1;
		intKor8 = rnd.nextInt(100) + 1;
		intKor9 = rnd.nextInt(100) + 1;
		intKor10 = rnd.nextInt(100) + 1;
		
		int intSum = 0;
		intSum = intKor1;
		intSum += intKor2;
		intSum += intKor3;
		intSum += intKor4;
		intSum += intKor5;
		intSum += intKor6;
		intSum += intKor7;
		intSum += intKor8;
		intSum += intKor9;
		intSum += intKor10;
		
		float floatAvg = 0.0f;
		floatAvg = (float)intSum / 10;
		
		System.out.println("===============================");
		System.out.printf("학생1  : %3d\n",intKor1);
		System.out.printf("학생2  : %3d\n",intKor2);
		System.out.printf("학생3  : %3d\n",intKor3);
		System.out.printf("학생4  : %3d\n",intKor4);
		System.out.printf("학생5  : %3d\n",intKor5);
		System.out.printf("학생6  : %3d\n",intKor6);
		System.out.printf("학생7  : %3d\n",intKor7);
		System.out.printf("학생8  : %3d\n",intKor8);
		System.out.printf("학생9  : %3d\n",intKor9);
		System.out.printf("학생10 : %3d\n",intKor10);
		System.out.println("-------------------------------");
		System.out.printf("총점 : %3d\t평균 : %3.2f\n",intSum,floatAvg);
		System.out.println("===============================");
		
	}
}
