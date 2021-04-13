package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.wooseok.standard.InputService;
import com.wooseok.standard.impl.InputServiceImplV1;

/*
 * 1. ScoreServiceImplV1을 상속받고
 * 2. inputScore() method를 작성
 * 3. 학번, 학생이름, 3과목 성적을 입력 받아
 * 	  List<ScoreVO> scoreList 객체에 추가
 */
public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	protected List<ScoreVO> scoreList;
	protected InputService inputService;
	protected Scanner scan;
	protected String[] subName;
	protected Integer[] subScore;
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	public ScoreServiceImplV2() {
		
		scoreList = new ArrayList<ScoreVO>();
		inputService = new InputServiceImplV1();
		scan = new Scanner(System.in);
		subName = new String[] {"국어","영어","수학"};
		subScore = new Integer[subName.length];
	}
	@Override
	public void inputScore() {
		
		// TODO 학번 이름받기 및 중복확인
		Integer intNum = null;
		String strNum = null;
		
		while(true) {
			intNum = inputService.inputValue("학번", 1);
			if(intNum == null) {
				return;
			}
			strNum = String.format("2021%03d", intNum);
			
			boolean noYes = false;
			for(int i = 0; i < scoreList.size(); i++) {
				ScoreVO vo = scoreList.get(i);
				if(vo.getNum().equals(strNum)) {
					noYes = true;
					break;
				}
			}
			if(noYes) {
				System.out.println("이미 등록된 학번입니다");
				continue;
			}
			break;
		}
		
		// TODO 학생이름 입력받기
		String strName = null;
		while(true) {
			System.out.println(strNum + " 의 이름을 입력하세요(QUIT:입력종료");
			System.out.print(">> ");
			strName = scan.nextLine();
			if(strName.trim().equals("QUIT")) {
				return;
			} else if(strName.equals("")) {
				System.out.println("이름을 입력해야 합니다");
				continue;
			}
			break;
		}
		
		// TODO 과목성적 입력 받기
		for(int i = 0; i < subName.length; i++) {
			subScore[i] = inputService.inputValue(subName[i], 0, 100);
			if(subScore[i] == null) {
				return;
			}
		} 
		
		// TODO 과목성적 VO에 추가 후 scoreList 객체에 추가
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(subScore[국어]);
		scoreVO.setEng(subScore[영어]);
		scoreVO.setMath(subScore[수학]);
		scoreList.add(scoreVO);
	} // end inputScore()
}
