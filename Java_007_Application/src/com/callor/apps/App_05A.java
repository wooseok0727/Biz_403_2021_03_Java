package com.callor.apps;

import com.callor.apps.service.EvenServiceV1A;

public class App_05A {

	public static void main(String[] args) {
		
		EvenServiceV1A esV1 = new EvenServiceV1A();
		esV1.makeNums();
		esV1.printEven();
		esV1.sumEven();
	}
}
