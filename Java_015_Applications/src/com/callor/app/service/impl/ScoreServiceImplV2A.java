package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

/*
 *  1. ScoreServiceImplV1A 를 상속받고
 *  2. inputScore() method를 재 정의
 *  3. 학생의 학번을 입력 받을 때
 *     이미 입력된(추가된) 학생일 경우
 *  4. 이미 입력된 학생임을 메시지로 보여주고 다시 입력 받는다
 *  5. 학생이름, 성적 등은 V1과 같다   
 */
public class ScoreServiceImplV2A extends ScoreServiceImplV1A {

	@Override
	public String inputNum() {
		// TODO 학번 입력받는 method
		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			if (intNum == null) {
				return null;
			}
			String strNum = String.format("2021%03d", intNum); // 2021001
			
			boolean noYes = false;
			for (int i = 0; i < scoreList.size(); i++) {
				ScoreVO vo = scoreList.get(i);
				if (strNum.equals(vo.getNum())) {
					System.out.println("이미 입력된 학생입니다");
					noYes = true;
					break;
				}
			} // end for()
			if (noYes) {
				continue;
			}
			return strNum;
		} // end while()
	} // end inputNum()
}
