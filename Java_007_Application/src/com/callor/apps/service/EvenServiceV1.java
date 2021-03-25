package com.callor.apps.service;

import java.util.Random;

/*
 * 정수형 배열 100개를 선언
 * 1 ~ 100까지의 난수를 만들어 정수형 배열에 저장
 * 배열에 저장된 수들 중에서 짝수들 리스트를 출력
 * 짝수들의 합을 구하여 출력
 * EvenService1 클래스에 method를 선언하여 코드 작성
 * App_05의 main() 메서드에 객체생성, method호출하여 실행
 */
public class EvenServiceV1 {
	
	int[] intNums;
	int intTotal;
	
	public EvenServiceV1() {
		
		intNums = new int[100];
		intTotal = 0;
	}
	public void makeNums() {
		
		Random rnd = new Random();
		
		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
		}
	}
	public void pirntEven() {
		
		System.out.println("=============================");
		System.out.println("짝수 리스트");
		System.out.println("-----------------------------");
		for(int num : intNums) {
			if( num % 2 == 0) {
				System.out.printf("짝수 : %3d\n",num);
				intTotal += num;
			}
		}
		System.out.println("=============================");
		System.out.println("짝수들의 합 = " + intTotal);
	}

}
