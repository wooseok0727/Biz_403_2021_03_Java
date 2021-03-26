package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	String[] strName; 
	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intTotal;
	float[] floatAvg;
	
	int[] intRank;
	
	Scanner scan;

	public ScoreServiceV1() {

		scan = new Scanner(System.in); 
		strName = new String[]{"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];
		
		intRank = new int[intKor.length];
		
	}
	public void inputScore() {

		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d번 ",i+1);
			System.out.printf("%s 국어 점수 >> ",strName[i]);
			intKor[i] = scan.nextInt();
			System.out.print("\t   영어 점수 >> ");
			intEng[i] = scan.nextInt();
			System.out.print("\t   수학 점수 >> ");
			intMath[i] = scan.nextInt();
		}
	}
	public void sumScore() {

		for (int i = 0; i < intKor.length; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];

			floatAvg[i] = (float) intTotal[i] / 3;
			
			intRank[i] = 1;
		}
	}
	public void RankScore( ) {
		
		for (int i = 0; i < intKor.length; i++) {
			for(int j = 0; j < intKor.length; j++) {
				if(intTotal[i] < intTotal[j]) {
					intRank[i]++;
				}
			}
		}
	}

	public void printScore() {

		System.out.println(LinesService.dLines(60));
		System.out.println("성적표");
		System.out.println(LinesService.sLines(60));
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println(LinesService.sLines(60));
		for (int i = 0; i < intKor.length; i++) {
			System.out.print(i+1 + "\t");
			System.out.print(strName[i] + " \t ");
			System.out.print(intKor[i] + " \t ");
			System.out.print(intEng[i] + " \t ");
			System.out.print(intMath[i] + " \t ");
			System.out.print(intTotal[i] + " \t");
			System.out.printf("%3.2f\t  ",floatAvg[i]);
			System.out.println(intRank[i]);
		}
		System.out.println(LinesService.dLines(60));
	}
}
