package com.callor.apps;

import java.util.Random;

/*
 *  1. 정수형 배열 20개를 선언합니다
 *  2. Random 클래스를 사용하여
 *     1 ~ 100까지 난수를 생성하여 배열에 저장합니다.
 *  3. 배열에 저장된 정수 중 짝수들이 몇 번 요소에 저장되어 있는지 리스트를 출력합니다.   
 */
public class App_03 {

	public static void main(String[] args) {

		int numsLength = 20;
		int[] intNums = new int[numsLength];

		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}

		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
