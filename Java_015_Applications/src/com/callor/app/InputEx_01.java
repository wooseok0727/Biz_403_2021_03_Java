package com.callor.app;

import com.wooseok.standard.InputService;
import com.wooseok.standard.impl.InputServiceImplV1;

public class InputEx_01 {

	public static void main(String[] args) {
		
		InputService isV1 = new InputServiceImplV1();
		
		isV1.inputValue("새우깡",0,1000);
		
		System.out.println(isV1.toString());
	}
}
