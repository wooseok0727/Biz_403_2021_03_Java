package com.callor.apps;

import java.util.Random;

public class App_09 {

	public static void main(String[] args) {
		
		String[] strNames = {"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
		
		int[] intNum = new int[strNames.length];
		
		int[] intKor = new int[strNames.length];
		int[] intEng = new int[strNames.length];
		int[] intMath = new int[strNames.length];
		
		int[] intTotal = new int[strNames.length];
		float[] floatAvg = new float[ strNames.length];
		
		Random rnd = new Random();
		for(int i = 0; i < strNames.length; i++) {
			
			intNum[i] = i + 1;
			
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;
		}
		
		for(int i = 0; i < strNames.length; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			
			floatAvg[i] = (float)intTotal[i] / 3;
		}
		
		System.out.println("빛나라 고교 성적처리");
		System.out.println("==========================================");
		System.out.println("학번 이름 국어 영어 수학 총점 평균");
		System.out.println("------------------------------------------");
		
		for(int i = 0; i < strNames.length; i++) {
			System.out.printf("%3d ",intNum[i]);
			System.out.printf("%s ",strNames[i]);
			
			System.out.printf("%3d ",intKor[i]);
			System.out.printf("%3d ",intEng[i]);
			System.out.printf("%3d ",intMath[i]);
			
			System.out.printf("%5d ",intTotal[i]);
			System.out.printf(" %3.2f \n",floatAvg[i]);
		}
	}
}
