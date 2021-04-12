package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.wooseok.standard.InputService;
import com.wooseok.standard.MenuService;
import com.wooseok.standard.impl.InputServiceImplV1;
import com.wooseok.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV2 implements ScoreService {

	protected MenuService menuService;
	protected InputService inputService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	public ScoreServiceImplV2() {
		
		inputService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	@Override
	public void selectMenu() {
		// TODO 나만의 JDK MenuServie 를 활용한 메뉴화면
		
		/*
		 * 보통 멤버변수(클래스 영역에 선언된 변수들) 객체는
		 * 이 클래스의 생성자에서 만드는 것이 좋다
		 * 
		 * 하지만 
		 * 객체를 생성할 때 전달해야 할 매개변수(파라메터)에 대하여
		 * 수행해야할 연산코드가 있을 경우는
		 * 객체를 사용하기 전에 객체를 생성하는 코드를
		 * 작성하여도 된다.
		 */
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적 입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");
		
		menuService = new MenuServiceImplV1("빛고을 고교 성적처리", scoreMenu);
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if(menu == null) {
				System.out.println("업무 종료");
				break;
			}
			if(menu == 1) {
				this.inputScore();
			} else if(menu == 2) {
				this.printScore();
			} else if(menu == 3) {
				this.saveScore();
			}
		} // end while()
	}
	
	public String inputNum() {
		
		while(true) {
			Integer intNum = inputService.inputValue("학번",1);
			if(intNum == null) {
				return null;
			}
			String strNum = String.format("2021%03d",intNum);
			boolean noYes = false;
			for(int i = 0; i < scoreList.size(); i++) {
				ScoreVO vo = scoreList.get(i);
				if(vo.getNum().equals(strNum)) {
					noYes = true;
					break;
				}
			}
			if(noYes) {
				System.out.println("이미 입력된 학생입니다");
				continue;
			}
			return strNum;
		}
	}
	
	public String inputName(String strNum) {
		
		while(true) {
			System.out.println(strNum + " 학생의 이름을 입력(QUIT:입력종료)");
			System.out.print(">> ");
			String strName = scan.nextLine();
			if(strName.trim().equals("QUTI")) {
				return null;
			} else if(strName.equals("")) {
				System.out.println("학생 이름은 반드시 입력해야합니다.");
				continue;
			}	
			return strName;
		} // end while()
	}
	@Override
	public void inputScore() {
		// TODO 학번입력, 이름입력, 과목별 성적입력 
		// ScoreVO 객체에 담고, list 에 추가
		// = ScoreVO 클래스를 사용하여 생성한 scoreVO 객체에 담고
		// = scoreVO 에 담고
		String strNum = this.inputNum();
		if(strNum == null) {
			return;
		}
		String strName = this.inputName(strNum);
		if(strName == null) {
			return;
		}
		String[] subject = {"국어","영어","수학"};
		Integer[] score = new Integer[subject.length];
		for(int i = 0; i < subject.length; i++) {
			score[i] = inputService.inputValue(subject[i], 0, 100);
			if(score[i] == null) {
				return;
			}
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(score[0]);
		scoreVO.setEng(score[1]);
		scoreVO.setMath(score[2]);
		
		scoreList.add(scoreVO);
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void saveScore() {
		
		while(true){
			System.out.println("성적리스트 저장");
			System.out.println("저장할 파일이름을 입력하세요");
			System.out.print(">> ");
			String strFileName = scan.nextLine();
			if(strFileName.equals("")) {
				System.out.println("파일이름을 입력해야 합니다");
				continue;
			}
			
			FileWriter fileWriter = null;
			PrintWriter out = null;
		
			strFileName = "src/com/callor/app/" + strFileName + ".txt";
		
			try {
				fileWriter = new FileWriter(strFileName);
				out = new PrintWriter(fileWriter);
			
				int nSize = scoreList.size();
				/*
				 * 파일에 저장할때
				 * 각 데이터를 컴마(,)로 구분하여 입력하고
				 * 파일이름을 *.csv로 저장하면
				 * excel에서 파일을 읽을 수 있다
				 * 
				 * csv : comma-separated-variables
				 */
				for(int i = 0; i < nSize; i++) {
					ScoreVO vo = scoreList.get(i);
					out.print(vo.getNum()+  ",");
					out.print(vo.getName()+  ",");
					out.print(vo.getKor()+  ",");
					out.print(vo.getEng()+  ",");
					out.println(vo.getMath());				
				}
				out.flush();
				out.close();
				System.out.println("저장완료");
			
			} catch (IOException e) {
				System.out.println("파일을 생성 할 수 없습니다");
				System.out.println("파일 이름을 다시 입력해 주세요");
				continue;
			}
			return;
		} // end while()	
	}
	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
