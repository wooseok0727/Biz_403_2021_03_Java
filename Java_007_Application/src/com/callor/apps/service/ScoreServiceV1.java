package com.callor.apps.service;

import java.util.Random;

/* 10명 학생의 국어, 영어, 수학 점수를 배열에 저장하고
 * 학생들의 총점, 평균을 계산하여
 * 성적리스트를 출력합니다
 * ScoreServiceV1 에 method를 구현하고
 * App_08 클래스의 main() method에서 호출하여 구현합니다.
 *  
 */
public class ScoreServiceV1 {

	int[] intNum;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	int[] intSum;
	float[] floatAvg;
	
	public ScoreServiceV1() {
		
		intNum = new int[10];
		intKor = new int[intNum.length];
		intEng = new int[intNum.length];
		intMath = new int[intNum.length];
		
		intSum = new int[intNum.length];
		floatAvg = new float[intNum.length];
	}
	
	public void makeScore() {
		
		Random rnd = new Random();
		for(int i = 0; i < intNum.length; i++) {
			
			intNum[i] = i+1;
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;
		}
	}
	
	public void makeSum() {
		
		for(int i = 0; i < intNum.length; i++) {
			
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
			
			floatAvg[i] = (float)intSum[i] / 3; 
		}
	}
	
	public void printScore() {
		
		System.out.println("===============================================");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------");
		for(int i = 0; i < intNum.length; i++) {
			System.out.printf("%3d\t",intNum[i]);
			System.out.printf("%3d\t",intKor[i]);
			System.out.printf("%3d\t",intEng[i]);
			System.out.printf("%3d\t",intMath[i]);
			
			System.out.printf("%3d\t",intSum[i]);
			System.out.printf("%3.2f\n",floatAvg[i]);
		}
		System.out.println("================================================");
	}
	
}
