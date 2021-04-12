package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

/*
 *  1. ScoreService 인터페이스를 implements 하여
 *     ScoreServiceV2 클래스를 만들고
 *  2. selectMenu() method의 코드를 구현.
 *     ========================================
 *     빛고을 고교 성적처리 2021
 *     ========================================
 *     1. 성적입력
 *     2. 성적리스트 출력
 *     3. 성적 저장
 *     QUIT.종료
 *     ----------------------------------------
 *     업무선택 >>
 */
public class ScoreServiceImplV2A implements ScoreService {
	
	Scanner scan;
	
	public ScoreServiceImplV2A() {
		
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {
		// TODO 메뉴선택창
		while(true) {
			System.out.println("=".repeat(50));
			System.out.println("\t빛고을 고교 성적처리 2021");
			System.out.println("=".repeat(50));
			System.out.println("1. 성적입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("3. 성적 저장");
			System.out.println("QUIT.종료");
			System.out.println("-".repeat(50));
			System.out.print("업무선택 >> ");
			String strSelect = scan.nextLine();
			if(strSelect.trim().equals("QUIT")) {
				return;
			}
			Integer intSelect = null;
			try {
				intSelect = Integer.valueOf(strSelect.trim());
			} catch (NumberFormatException e) {
				System.out.println("1~3 또는 QUIT만 입력하세요");
				continue;
			}
			if(intSelect == 1) {
				this.inputScore();
			} else if(intSelect == 2) {
				this.printScore();
			} else if(intSelect == 3) {
				this.saveScore();
			} else {
				System.out.println("1~3 또는 QUIT만 입력하세요");
				continue;
			}
			
			 // switch(intSelect) {
			 // case 1 : inputScore();
			 //  		break;
			 // case 2 : printScore();
			 //  		break;
			 // case 3 : saveScore();
			 //  		break;
			 // default : System.out.println("1~3 또는 QUIT만 입력하세요");		
			 // 			continue;
			 // }
			
		} // end while()
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

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
