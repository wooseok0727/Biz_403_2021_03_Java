package com.callor.reload;

import com.callor.reload.service.InputServiceV1;

public class NumberEx_01 {

	public static void main(String[] args) {

		InputServiceV1 isV1 = new InputServiceV1();
		while (true) {
			if (isV1.inputNum() == null) {
				break;
			}
		}
		isV1.printNum();
	}
}
