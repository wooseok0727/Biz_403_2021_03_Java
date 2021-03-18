package com.callor.var;

public class Variable_15 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;  // intNum 0, 2, 4, 6, 8, 10
		
		intSum += ( intNum += 2);
		intSum += ( intNum += 2);
		intSum += ( intNum += 2);
		intSum += ( intNum += 2);
		intSum += ( intNum += 2);
	
		System.out.println("짝수의 합 : " + intSum);
	
		
	}
}
