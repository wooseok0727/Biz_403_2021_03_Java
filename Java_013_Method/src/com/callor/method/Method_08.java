package com.callor.method;

import com.callor.method.service.NumberServiceV6;

/*
 *  이 코드는
 *  Method_08.main() 에서
 *  	NumberServiceV6.inputNum()을 호출하고
 *  		InputService.inpValue(String title)을 호출하고
 *  			QUIT : return null;
 *  			아니면 : return 정수값을 
 *  		inputNum() retNum에 되돌려 받기
 *  			null : return null
 *  			아니면 : 0 ~ 100 까지 인지 검사
 *  				아니면 다시 InputService.inpValue(String title)
 *  					아니면 return retNum
 *  retNum에 되돌려 받아
 *  	화면에 출력
 */
public class Method_08 {

	public static void main(String[] args) {
		
		NumberServiceV6 nsV6 = new NumberServiceV6();
		Integer retNum = nsV6.inputNum();
		System.out.println("입력한 값 : " + retNum);
	
	}
}
