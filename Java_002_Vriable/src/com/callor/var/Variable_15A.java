package com.callor.var;

public class Variable_15A {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				intNum += 2;
				intSum += intNum;
			}
		}
		System.out.println("짝수의 합 : " + intSum);
	}
}
