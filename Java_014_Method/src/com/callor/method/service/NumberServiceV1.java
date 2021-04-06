package com.callor.method.service;

/*
 * 1. NumberServiceV1 클래스를 선언
 * 2. addNum() method는 두개의 정수를 매개변수로 받는다.
 * 3. 매개변수로 받은 2개의 정수의 합을 계산하고
 *    합의 결과가 짝수이면 계산 결과를 return 하고
 *    그렇지 않으면 null을 return 한다.
 */
public class NumberServiceV1 {

	public Integer addNum(int num1, int num2) {

		Integer intSum = num1 + num2;
		if (intSum % 2 == 0) {
			return intSum;
		} else {
			return null;
		}
	}
}