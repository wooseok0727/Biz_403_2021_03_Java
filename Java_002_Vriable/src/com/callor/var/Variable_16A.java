package com.callor.var;

public class Variable_16A {

	public static void main(String[] args) {
		
		int intDan = 3;
		int intNum = 1;
		
		for(int i = 0; i < 8; i++) {
			intNum++;
			System.out.printf("%d x %d = %2d\n",intDan,intNum,intDan * intNum);
		}
	}
}
