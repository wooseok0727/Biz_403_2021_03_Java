package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* 1 .PrimeServiceV4 class의 클래스 영역에
 * 	  Random rnd 객체 선언.
 * 	  List<Integer> intList 객체 선언
 * 2. 클래스 생성자에서 rnd 객체와 intList 객체 생성(초기화)
 * 3. primeNum() method를 선언하고,
 * 	  50 ~ 100까지 중 임의의 난 수 50개를 생성하고
 * 	  난 수 중 소수인 정수들만 intList에 추가
 * 4. printPrimeNum() method를 선언하고
 *    intList에 담긴 소수들 리스트를 출력
 */
public class PrimeServiceV4 {
	
	protected Random rnd;
	protected List<Integer> intList;
	
	public PrimeServiceV4() {
		
		rnd = new Random();
		intList = new ArrayList<Integer>();
	}
	
	public void primeNum() {
		
		int[] rndNum = new int[50];
		
		for(int i = 0; i < rndNum.length; i++) {
			rndNum[i] = rnd.nextInt(51) + 50;
		}
		
		for(int i = 0; i < rndNum.length; i++) {
			int j = 0;
			for( j = 2; j < rndNum[i]; j++) {
				if(rndNum[i] % j == 0) {
					break;
				}
			}
			if(j >= rndNum[i]) {
				intList.add(rndNum[i]);
			}
		}
	} // end primeNum
	public void printPrimeNum() {
		
		System.out.println("=".repeat(30));
		System.out.println("소수 리스트");
		System.out.println("-".repeat(30));
		int nCount = 0;
		for(int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + "   ");
			nCount++;
			if(nCount % 5 == 0 ) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("=".repeat(30));
		System.out.println(intList);
	}
}
