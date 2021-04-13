package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.service.ScoreService;
import com.wooseok.standard.InputService;
import com.wooseok.standard.MenuService;
import com.wooseok.standard.impl.InputServiceImplV1;
import com.wooseok.standard.impl.MenuServiceImplV1;

/*
 *  1. 프로젝트를 생성하고, 자신의 JDK를 추가하고
 *     InputValue, MenuService 클래스 사용하여 작성
 *  2. 016 Project 의 SocreVO 클래스, ScoreService
 *     인터페이스를 참조하여 VO와 interface를 작성
 *  3. ScoreService interface 를 implements 하여 클래스 작성
 *  
 *  4. selectMenu() method 작성
 *     title : 대한 고등학교 성적처리 시스템 2021
 *     menu List
 *     		1. 학생정보 등록, 2. 성적등록,
 *     		3. 성적정보 열기, 4. 성적정보 저장
 *     		5. 성적정보 출력 
 */
public class ScoreServiceImplV1 implements ScoreService {

	protected MenuService menuService;
	
	@Override
	public void selectMenu() {
		// TODO 메뉴화면								 // List형 ArrayList 는 
		List<String> menuList = new ArrayList<String>(); // this.selectMenu() method에서만 사용하기 떄문에
		menuList.add("학생정보 등록");				     // method 안에서 String형 ArrayList 선언 및 생성
		menuList.add("성적등록");                        // 메뉴목록 추가
		menuList.add("성적정보 열기");
		menuList.add("성적정보 저장");
		menuList.add("성적정보 출력");
		String title = "대한 고등학교 성적처리 시스템 2021";
		// menuService는 인스턴스 할 때 menuList와의 
		// 매개변수를 통한 연산이 필요하기 때문에 selectMenu() method 안에서 인스턴스
		menuService = new MenuServiceImplV1(title,menuList);
		
		while(true) {
			Integer selectNum = menuService.selectMenu(); // menuService.slectMenu() 결과를
			if(selectNum == null) {						  // selectNum 변수에 대입하기
				System.out.println("종료되었습니다.");    // 대입된 값에 따라 값에 맞는 
				return;									  // return 또는 method 실행
			}
			if(selectNum == 1) {
				
			} else if (selectNum == 2) {
				this.inputScore();
			} else if (selectNum == 3) {
				this.readScore();
			} else if (selectNum == 4) {
				this.saveScore();
			} else if (selectNum == 5) {
				this.printScore();
			}
		} // end while()
	} // end selectMenu()

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

}
