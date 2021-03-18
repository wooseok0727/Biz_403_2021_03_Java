package com.callor.var;

public class Variable_16 {

	public static void main(String[] args) {
		
		/*
		 * intDan, intNum 변수를 선언하고
		 * 3단 구구단을 출력하라 
		 *
		 */
		
		
		int intDan; // 3단을 표시하기 위한 변수
		int intNum; // 2~9까지의 숫자를 만들고 실제 구구단을 계산하고 출력하기 위한 변수
		
		// 단 * 숫자 = 결과
		intDan = 3;
		intNum = 2;
		
		System.out.printf("%d x %d = %3d\n",intDan ,intNum ,intDan * intNum++);
		System.out.printf("%d x %d = %3d\n",intDan ,intNum ,intDan * intNum++);
		System.out.printf("%d x %d = %3d\n",intDan ,intNum ,intDan * intNum++);
		System.out.printf("%d x %d = %3d\n",intDan ,intNum ,intDan * intNum++);
		System.out.printf("%d x %d = %3d\n",intDan ,intNum ,intDan * intNum++);
		System.out.printf("%d x %d = %3d\n",intDan ,intNum ,intDan * intNum++);
		System.out.printf("%d x %d = %3d\n",intDan ,intNum ,intDan * intNum++);
		System.out.printf("%d x %d = %3d\n",intDan ,intNum ,intDan * intNum);
		
		System.out.println("=============================================");
		
		intDan = 3;
		intNum = 1;
		
		System.out.printf("%d x %d = %3d\n",intDan ,++intNum ,intDan * intNum);
		System.out.printf("%d x %d = %3d\n",intDan ,++intNum ,intDan * intNum);
		System.out.printf("%d x %d = %3d\n",intDan ,++intNum ,intDan * intNum);
		System.out.printf("%d x %d = %3d\n",intDan ,++intNum ,intDan * intNum);
		System.out.printf("%d x %d = %3d\n",intDan ,++intNum ,intDan * intNum);
		System.out.printf("%d x %d = %3d\n",intDan ,++intNum ,intDan * intNum);
		System.out.printf("%d x %d = %3d\n",intDan ,++intNum ,intDan * intNum);
		System.out.printf("%d x %d = %3d\n",intDan ,++intNum ,intDan * intNum);
	
	}
}
