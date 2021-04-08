package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.wooseok.standard.InputService;
import com.wooseok.standard.impl.InputServiceImplV1;

/*
 *  1. 다음 interface 를 impl 하여 ScoreServiceImplV1을
 *     생성하고 각 method를 구현
 *     public interface ScoreService {
 *     		public void selectMenu();
 *     		public void intputMenu();
 *     		public String inputName();
 *     		public void printScore();
 *     }
 *   2. List<ScoreVO> scoreList 객체를 생성하고
 *   3. 학생 5명의 학번, 이름, 성적을 입력받아 scoreList에 추가  
 */
public class ScoreServiceImplV1 implements ScoreService {
	
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected InputService inService;
	protected String[] subjectName;
	protected Integer[] subjectScore;
	protected String studentNumber;
	protected String studentName;
	
	public ScoreServiceImplV1() {
	
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceImplV1();
		subjectName = new String[]{"국어","영어","수학"};
		subjectScore = new Integer[subjectName.length];
		studentNumber = null;
		studentName = null;
	}

	@Override
	public void selectMenu() {
		// TODO 선택메뉴화면
		while(true) {
			System.out.println("=".repeat(55));
			System.out.println("성적 처리 시스템");
			System.out.println("=".repeat(55));
			System.out.println("1. 학생 성적 입력");
			System.out.println("2. 성적 리스트 출력");
			System.out.println("QUIT. 업무종료");
			System.out.println("=".repeat(55));
			System.out.print(">> ");
			String select = scan.nextLine();
			if(select.trim().equals("1")) {
				this.inputStudentNumber();
				this.inputName();
				this.inputScore();
			} else if (select.trim().equals("2")) {
				this.printScore();
			} else if (select.trim().equals("QUIT")) {
				System.out.println("업무종료!");
				return;
			} else {
				System.out.println("1~2 또는 QUIT만 선택가능");
				continue;
			}
		}
	}

	public String inputStudentNumber() {
		// TODO 학번 입력받기
		System.out.println("학번을 입력하세요");
		System.out.print(">> ");
		studentNumber = scan.nextLine();		
		return studentNumber;
	}
	
	@Override
	public String inputName() {
		// TODO 학생이름 입력받기
		System.out.println("이름을 입력하세요");
		System.out.print(">> ");
		studentName = scan.nextLine();
		return studentName;
	}

	@Override
	public void inputScore() {
		// TODO 과목점수 입력받기
		for(int i = 0; i < subjectName.length; i++) {
			subjectScore[i] = inService.inputValue(subjectName[i], 0, 100);
			if(subjectScore[i] == null) {
				return;
			}
		}
		this.addScore();
	}
		
	public void addScore() {
		// TODO 학생의 점수 추가하기
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(studentNumber);
		scoreVO.setName(studentName);
		scoreVO.setKor(subjectScore[0]);
		scoreVO.setEng(subjectScore[1]);
		scoreVO.setMath(subjectScore[2]);
		scoreList.add(scoreVO);	
	}
	
	@Override
	public void printScore() {
		// TODO 성적 리스트 출력하기
		System.out.println("=".repeat(55));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(55));
		for(int i = 0; i < scoreList.size(); i++) {
			System.out.println(scoreList.get(i).toString());
		}
	}
}
