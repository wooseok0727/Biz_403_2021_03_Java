package com.callor.reload;

import com.callor.reload.service.InputServiceV2;

public class NumberEx_02 {

	public static void main(String[] args) {
		
		InputServiceV2 isV2 = new InputServiceV2();
		while(true) {
			if(isV2.inputNum() == null) {
				break;
			}
		}
		isV2.printNum();		
	}
}
