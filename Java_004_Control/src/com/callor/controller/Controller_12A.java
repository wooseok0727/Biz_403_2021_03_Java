package com.callor.controller;

import java.util.Random;

public class Controller_12A {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intNums = new int[10];
		int intSum = 0;
		
		for(int i = 0; i < 10; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		for(int i = 0; i < 10; i++) {
			if(intNums[i] % 3 == 0) {
				intSum += intNums[i];
				System.out.println(intNums[i] + "는(은) 3의 배수");		
			}
		}
		System.out.println("===================");
		System.out.println("합계 : " + intSum);
		
	}
}
