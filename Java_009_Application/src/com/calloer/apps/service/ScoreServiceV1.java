package com.calloer.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intTotal;
	float[] floatAvg;

	Scanner scan;

	public ScoreServiceV1() {

		scan = new Scanner(System.in);
		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];
	}

	public void inputScore() {
		for (int i = 0; i < intKor.length; i++) {
			int num = (i + 1);
			System.out.print(num + "번 국어 점수 >> ");
			intKor[i] = scan.nextInt();
			if (intKor[i] < 0 || intKor[i] > 100) {
				System.out.println("다시 입력해주세요");
				i--;
			}
		}
		for (int i = 0; i < intKor.length; i++) {
			int num = (i + 1);
			System.out.print(num + "번 영어 점수 >> ");
			intEng[i] = scan.nextInt();
			if (intEng[i] < 0 || intEng[i] > 100) {
				System.out.println("다시 입력해주세요");
				i--;
			}
		}
		for (int i = 0; i < intKor.length; i++) {
			int num = (i + 1);
			System.out.print(num + "번 영어 점수 >> ");
			intMath[i] = scan.nextInt();
			if (intMath[i] < 0 || intMath[i] > 100) {
				System.out.println("다시 입력해주세요");
				i--;
			}
		}
	}

	public void sumScore() {
		for (int i = 0; i < intKor.length; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];

			floatAvg[i] = (float) intTotal[i] / 3;
		}
	}

	public void printScore() {

		System.out.println("==============================================");
		System.out.println("성적표");
		System.out.println("----------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < intKor.length; i++) {
			int num = (i + 1);
			System.out.printf(" %d\t", num);
			System.out.printf(" %d\t", intKor[i]);
			System.out.printf(" %d\t", intEng[i]);
			System.out.printf(" %d\t", intMath[i]);
			System.out.printf("%3d\t", intTotal[i]);
			System.out.printf("%3.2f\n", floatAvg[i]);
		}
		System.out.println("==============================================");
	}
}
