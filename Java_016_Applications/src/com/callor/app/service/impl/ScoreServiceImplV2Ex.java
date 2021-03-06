package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.Values;
import com.wooseok.standard.InputService;
import com.wooseok.standard.impl.InputServiceImplV1;

/*
 * selectMenu는 그대로 활용
 * inputScore() 만 다시 작성
 */
public class ScoreServiceImplV2Ex extends ScoreServiceImplV2 {

	protected String[] subjectList;
	protected Integer[] subScoreList;
	
	// 과목명, 과목점수가 담긴 배열에 어떤 대한 위치를
	// 숫자로 사용하지 않고 명명된 이름으로 사용하기 위하여
	// 배열의 index 값을 상수로 선언해 둔다.
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	public ScoreServiceImplV2Ex() {
		
		subjectList = new String[] {"국어","영어","수학"};
		subScoreList = new Integer[subjectList.length];
	}
	@Override
	public void inputScore() {
		
		Integer intNum = inputService.inputValue("학번", 1);
		if(intNum == null) {
			return;
		}
		// 1 을 입력했으면 001로 만들어라
		String strNum = String.format("2021%03d", intNum);
		
		String strName = null;
		while(true) {
			System.out.println(strNum + " 학생의 이름 입력(QUIT:입력중단)");
			strName = scan.nextLine();
			if(strName.trim().equals("QUIT")) {
				return;
			} else if(strName.equals("")) {
				System.out.println("학생이름은 반드시 입력하세요");
				continue;
			}
			break;
		} // end while()
		
		// 각 과목의 점수를 별도로 입력받아 변수에 저장하기를
		// 하려고 하니 귀찮다
		// 창조적 게으름을 피워보기
		
		// 입력받을 과목명을 배열 변수로 선언하고
		// String[] subject = {"국어","영어","수학"};
		// subject 배열을 멤버영역으로 이동 subjectList로
		// 점수를 입력하는 곳에서 사용하기 위하여 
		//		과목명을 담을 배열을 선언했는데
		//		생각해보니 다른 method에서도 사용할 수 있을 것 같다
		// 		그래서 클래스 영역으로 이동하였다
		
		// 과목수 만큼 점수를 저장할 배열을 선언
		// Integer[] intScore = new Integer[subject.length];
		// intScore 배열을 멤버영역으로 이동 subScoreList로
		// subject와 같은 이유
		
		for(int i = 0; i < subjectList.length; i++) {
			subScoreList[i] = inputService.inputValue(subjectList[i], 0, 100);
			if(subScoreList[i] == null ) {
				return;
			}
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(subScoreList[ 국어 ]);
		scoreVO.setEng(subScoreList[ 영어 ]);
		scoreVO.setMath(subScoreList[ 수학 ] );
		
		scoreVO.setKor(subScoreList[ Values.국어 ]);
		scoreVO.setEng(subScoreList[ Values.영어 ]);
		scoreVO.setMath(subScoreList[ Values.수학 ] );
		
		// 디버깅 코드, VO에 담긴 데이터 확인하기
		System.out.println("=".repeat(50));
		System.out.println(scoreVO.toString());
		System.out.println("=".repeat(50));
		
		scoreList.add(scoreVO);
		
	} 
	
	@Override
	public void printScore() {
		
		System.out.println("빛나라 고교 성적리스트 2021");
		System.out.println("=".repeat(80));
		System.out.print("학번\t이름\t");
		for(int index = 0; index < subjectList.length; index++) {
			System.out.print(subjectList[index]+ "\t");
		}
		System.out.print("총점\t평균\n");
		System.out.println("-".repeat(80));
		
		int nSize = scoreList.size();
		for(int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		System.out.println("=".repeat(80));
	}
}
