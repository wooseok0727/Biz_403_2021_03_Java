package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1A {

	
	public Integer inputNum() {
		
		Random rnd = new Random();
		Integer intNum = rnd.nextInt(100) + 1;
		
		if(intNum % 3 == 0) {	
			return intNum;
		}
		return null;
	}
}
