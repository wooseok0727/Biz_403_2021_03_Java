package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;
import com.wooseok.standard.InputService;
import com.wooseok.standard.impl.InputServiceImplV1;

/* 
 *  1. insertScore() method에서
 *     학번, 이름, 국어, 영어, 수학 점수를 입력 받아
 *     List<ScoreVO> scoreList에 추가
 *  2. 학번은 00001 형식으로 5자리로 변환하여 추가
 *  3. 한번 입력된 학번의 점수는 다시 입력할 수 없음
 *  4. printScore() 등 코드는 임의로 작성
 *  5. 학번을 입력 받은 후 scoreList에 저장된 데이터가
 *     아닌 것이 확인 되면 studentList에 저장된 학생정보인지
 *     확인한 후 성적 입력
 *  6. printScore() 에서 학생의 성적 리스트를 출력
 *  7. 다음과 같은 리스트를 출력
 *     ============================================
 *     학번 이름 학과 학년 국어 영어 수학 총점 평균 
 *     --------------------------------------------
 *     
 *     ============================================
 *     
 */       

public class ScoreServiceImplV1 implements ScoreService {

	protected StudentService stService;
	protected InputService inService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	
	public ScoreServiceImplV1() {
		
		stService = new StudentServiceImplV1();
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	@Override
	public void insertScore() {
		
		String strNum = null;
		while(true) {
			Integer intNum = inService.inputValue("학번", 1);
			if(intNum == null) return;
			
			strNum = String.format("%05d", intNum);
			
			boolean noYes = false;
			for(ScoreVO vo : scoreList) {
				if(vo.getNum().equals(strNum)) {
					noYes = true;
					break;
				}
			}
			if(noYes) {
				System.out.println("이미 등록된 학번입니다");
				continue;
			}
			
			StudentVO stVO = stService.getStudent(strNum);
			if(stVO == null) {
				System.out.println("학적부에 없는 학생입니다!!");
				System.out.println("학번을 다시 입력해 주세요!");
				continue;
			}
			
			System.out.println("=".repeat(30));
			System.out.printf("학번:%s\n", stVO.getNum());
			System.out.printf("이름:%s\n", stVO.getName());
			System.out.printf("학년:%s\n", stVO.getGrade());
			System.out.printf("학과:%s\n", stVO.getDept());
			System.out.printf("주소:%s\n", stVO.getAddress());
			System.out.println("=".repeat(30));
			System.out.println("학생정보가 맞습니까 ?");
			System.out.println("맞으면 : Enter, 틀리면 : NO");
			System.out.print(">> ");
			String yesNo = scan.nextLine();
			if(yesNo.equals("NO")) {
				continue;
			}
			break;
		} // end while()
		
		String[] subject = {"국어","영어","수학"};
		Integer[] score = new Integer[subject.length];
		for(int i = 0; i < subject.length; i++) {
			score[i] = inService.inputValue(subject[i], 0, 100);
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setKor(score[국어]);
		scoreVO.setEng(score[영어]);
		scoreVO.setMath(score[수학]);
		scoreList.add(scoreVO);
		
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\n",vo.getAvg());
		}
		System.out.println("=".repeat(50));
	}

	@Override
	public void printScore() {
		// TODO 
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		int nSize = scoreList.size();
		for(int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			StudentVO stVO = stService.getStudent(vo.getNum());
			System.out.print(stVO.getNum() + "\t");
			System.out.print(stVO.getName() + "\t");
			System.out.print(stVO.getDept() + "\t");
			System.out.print(stVO.getGrade() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		System.out.println("=".repeat(80));	
	}
}
