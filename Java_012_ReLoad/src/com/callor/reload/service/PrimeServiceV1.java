package com.callor.reload.service;

import java.util.Random;

/*
 * 1. PrimeServiceV1 class의 클래스 영역에
 * 	  Random rnd 객체를 선언
 * 2. 클래스 생성자에게 rnd 객체 생성(초기화)
 * 3. primeNum() method를 선언하고,
 * 	  50 ~  100까지 중 임의의 난 수를 생성하고
 * 	  난 수가 소수인가를 판별하여 출력하는 코드 작성
 */
public class PrimeServiceV1 {

	protected Random rnd;

	public PrimeServiceV1() {

		rnd = new Random();
	}

	public void primeNum() {

		int intPrime = 0;
		intPrime = rnd.nextInt(51) + 50;  // intPrime 변수에 50 ~ 100까지의 난수 생성

		int i = 0;
		for (i = 2; i < intPrime; i++) {  // 생성된 난수를 2 ~ (난수-1)까지 나머지연산을 통해 소수판별
			if (intPrime % i == 0) { 	  // 나머지가 0이면 for()문을 끝가지 반복하지말고 멈춰라
				break;
			}
		}
		// i 값이 intPrime 값보다 작으면 나머지가 0으로 나온 상황이 있기 떄문에 소수가 아님
		if (i < intPrime) {  
			System.out.printf("%d는(은) 소수가 아니다\n", intPrime);
		} else {
			System.out.printf("%d는(은) 소수다\n", intPrime);
		}
	}

}
