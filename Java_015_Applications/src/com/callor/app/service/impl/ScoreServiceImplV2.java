package com.callor.app.service.impl;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {
	
	@Override
	public void selectMenu() {
		// TODO 선택메뉴화면
		while(true) {
			System.out.println("=".repeat(55));
			System.out.println("성적 처리 시스템");
			System.out.println("=".repeat(55));
			System.out.println("1. 학생 성적 입력");
			System.out.println("2. 성적 리스트 출력");
			System.out.println("3. 학생 성적 검색");
			System.out.println("4. 학생 성적 수정");
			System.out.println("QUIT. 업무종료");
			System.out.println("=".repeat(55));
			System.out.print(">> ");
			String select = scan.nextLine();
			if(select.trim().equals("1")) {
				this.inputService();
			} else if (select.trim().equals("2")) {
				this.printScore();
			} else if (select.trim().equals("3")) {
				this.showInformation();
			} else if (select.trim().equals("4")) {
				this.editStudentInformation();
			} else if (select.trim().equals("QUIT")) {
				System.out.println("업무종료!");
				return;
			} else {
				System.out.println("1~3 또는 QUIT만 선택가능");
				continue;
			}
		}
	}

	public void showInformation() {
		
		while(true) {
			System.out.println("학생 이름을 입력하세요(QUIT:입력종료)");
			System.out.print(">> ");
			String inputName = scan.nextLine();
			if(inputName.trim().equals("QUIT")) {
				return;
			} else if (inputName.equals("")) {
				System.out.println("이름을 입력해야 합니다");
				continue;
			}
			
			String loadName = null;
			for(int i = 0; i < scoreList.size(); i++) {
				loadName = scoreList.get(i).getName();
				if(loadName.trim().equals(inputName)) {
					System.out.println("=".repeat(55));
					System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
					System.out.println("-".repeat(55));
					System.out.println(scoreList.get(i).toString());
					break;
				} else {
					loadName = null;
				}
			} // end for()
			if(loadName == null) {
				System.out.println("정보를 찾을 수 없습니다");
				return;
			}
			return;
		} // end while ()
	}
	
	public void editStudentInformation() {
		
		System.out.println("수정할 학생 이름을 입력하세요");
		System.out.print(">> ");
		String inputName = scan.nextLine();
		String loadName = null;
		Integer newScore = null;
		for(int i = 0; i < scoreList.size(); i++) {
			loadName = scoreList.get(i).getName();
			if(loadName.trim().equals(inputName)) {
				while(true) {
					System.out.println(loadName + " 학생의 수정할 과목을 입력하세요(QUIT:입력종료");
					System.out.print(">> ");
					String subject = scan.nextLine();
					if(subject.equals("QUIT")) {
						return;
					}
					System.out.println("수정할 점수를 입력하세요");
					System.out.print(">> ");
					if(subject.equals("국어")) {
						newScore = scan.nextInt();
						scan.nextLine();
						scoreList.get(i).setKor(newScore);
					} else if(subject.equals("수학")) {
						newScore = scan.nextInt();
						scan.nextLine();
						scoreList.get(i).setMath(newScore);
					} else if(subject.equals("영어")) {
						newScore = scan.nextInt();
						scan.nextLine();
						scoreList.get(i).setMath(newScore);
					}
				} // end while()
			}
		} // end for()
	} // end editStudentInformation()
}
