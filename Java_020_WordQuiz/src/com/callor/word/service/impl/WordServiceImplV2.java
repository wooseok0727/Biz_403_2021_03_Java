package com.callor.word.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import com.callor.word.domain.ScoreVO;
import com.callor.word.domain.WordVO;

/*
 * 점수 처리
 * 단어를 맞추면 점수를 (+)
 * 단어를 틀리면 재도전, (-)
 * 힌트를 요구하면 점수를 (-)
 * 건너뛰기 (-)
 */
public class WordServiceImplV2 extends WordServiceImplV1 {
	
	protected ScoreVO score;
	protected String basePath;
	
	protected final int 맞은개수 = 0;
	protected final int 틀린개수 = 1;
	protected final int 포인트 = 2;
	
	public WordServiceImplV2() {
		
		score = new ScoreVO(3);
		basePath = "src/com/callor/word/";
		
		this.loadScore();
	}
	/*
	 * getShuffleWord() method를 호출하여
	 * shuffle된 영단어를 받고
	 * 
	 * 반복하여
	 * shuffle된 영단어를 inputWord()에게 전달하여
	 * 게임을 진행한다. 
	 */
	public void startGame() {
		
		while(true) {
			
			score.set힌트보기(0);
			score.set재도전(3);
			// 게임용 단어 만들기
			int nWordCount = wordList.size();
			int nWordIndex = rnd.nextInt(nWordCount);
			WordVO wordVO = wordList.get(nWordIndex);
			
			// getShuffleWord()를 사용하지 않고
			// 직접 suffleWord()를 호출하도록 변경
			String[] viewWord = this.shuffleWord(wordVO.getEnglish());
			
			while(true) {
				String strInput = this.inputWord(viewWord);
				if(strInput.equals("Quit")) {
					this.viewScore();
					this.saveScore();
					System.out.println("게임종료");
					/*
					 * return문은 반복문의 
					 * 겹침 개수에 관계없이
					 * 무조건 현재 method 자체가 끝나버린다 
					 */
					return;
				} else if(strInput.equals("1")) {
					/*
					 * 반복문{ 반복문{} } 처럼 
					 * 반복문이 겹쳐있을때
					 * 안쪽의 반복문에서 break를 실행하면
					 * 한계단씩 반복문이 해제된다.
					 */
					this.viewScore();
					break;
				} else if(strInput.equals("2")) {
					if(score.get포인트() <= 0) {
						System.out.println("0점이하는 힌트를 볼 수 없습니다");
						continue;
					}
					this.hint(wordVO);
//					System.out.println("+".repeat(50));
//					System.out.println("힌트 : " + wordVO.getKorea());
//					System.out.println("+".repeat(50));
				} else {
					// 점수 계산
					this.yesNo(wordVO, strInput);
					if(score.get재도전() <= 0) {
						System.out.println("재도전 기회가 없음");
						break;
					}
					
//					String strEng = wordVO.getEnglish();
//					if(strEng.equalsIgnoreCase(strInput)) {
//						System.out.println("맞았습니다");
//					} 
				}
			} // end  안 while()
		} // end 밖 while() 
	}
	protected void hint(WordVO wordVO) {
		// TODO 힌트보여주기
		System.out.println("+".repeat(50));
		System.out.println("힌트 : " + wordVO.getKorea());
		System.out.println("+".repeat(50));
		
		score.set힌트보기(score.get힌트보기() + 1);
		this.viewScore();
	}
	
	protected void yesNo(WordVO wordVO, String input) {
		// TODO 단어 채점  // 맞으면 다음단어로 넘어가기 위한 조치 필요 룰규칙 재정리 필요
		String strEng = wordVO.getEnglish();
		if(strEng.equalsIgnoreCase(input)) {
			score.set맞은개수(score.get맞은개수() + 1);
			score.set포인트(score.get포인트() + 1);
			System.out.println("맞았습니다");
		} else {
			score.set틀린개수(score.get틀린개수() + 1);
			score.set포인트(score.get포인트() - 1);
			score.set재도전(score.get재도전() - 1);
		}
		this.viewScore();
	}
	
	protected void viewScore() {
		
		System.out.println("=".repeat(50));
		System.out.println("현재 SCORE");
		System.out.println("-".repeat(50));
		System.out.printf("맞은 개수 : %d\n",score.get맞은개수());
		System.out.printf("틀린 개수 : %d\n",score.get틀린개수());
		System.out.printf("포인트 : %d\n",score.get포인트());
		System.out.printf("힌트확인 : %d\n",score.get힌트보기());
		System.out.printf("재도전 : %d\n",score.get재도전());
		System.out.println("=".repeat(50));
	}
	
	protected void saveScore() {
		
		while(true) {
			System.out.println("저장할 파일이름 입력");
			System.out.print(">> ");
			String fileName = scan.nextLine();
			if(fileName.equals("")) {
				System.out.println("파일이름은 반드시 입력해야 합니다");
				continue;
			}
			FileWriter fileWriter = null;
			PrintWriter out = null;
			
			try {
				fileWriter = new FileWriter(basePath + fileName);
				out = new PrintWriter(fileWriter);
				out.printf("%d:%d:%d",score.get맞은개수()
									 ,score.get틀린개수()
									 ,score.get포인트()
				);
				out.flush();
				out.close();
				System.out.println("게임저장 완료!");
				return;
			} catch (IOException e) {
				System.out.println(fileName + "파일 생성 오류");
				System.out.println("파일 이름을 다시 입력하세요");
			}
		} // end while()
	} // end saveScore()
	
	protected void loadScore() {
		
		while(true) {
			System.out.println("불러올 파일이름을 입력하세요");
			System.out.println(">> ");
			String fileName = scan.nextLine();
			if(fileName.equals("")) {
				System.out.println("게임을 처음부터 시작합니다");
				score = new ScoreVO(3);
				return;
			}
			
			FileReader fileReader = null;
			BufferedReader buffer = null;
			
			try {
				fileReader = new FileReader(basePath + fileName);
				buffer = new BufferedReader(fileReader);
				String reader = buffer.readLine();
				String[] sc = reader.split(":");
				this.score = new ScoreVO();
				
				score.set맞은개수(Integer.valueOf(sc[맞은개수]));
				score.set틀린개수(Integer.valueOf(sc[틀린개수]));
				score.set포인트(Integer.valueOf(sc[포인트]));
				buffer.close();
				return;
			} catch (FileNotFoundException e) {
				System.out.println("파일이 없습니다");
				System.out.println("파일명을 다시 입력하세요");
				continue;
			} catch (IOException e) {
				System.out.println("파일을 읽을 수 없습니다");
				score = new ScoreVO();
				return;
			}
		} // end while()
	}
	/*
	 * shuffle된 단어배열을 매개변수로 받고
	 * 게임을 진행하기
	 */
	protected String inputWord(String[] viewWord) {
		
		System.out.println("=".repeat(50));
		System.out.println("뤼팡의 영단어 게임 V2");
		System.out.println("-".repeat(50));
		System.out.println("다음 보여지는 단어를 바르게 배열 하시오");
		System.out.println(Arrays.toString(viewWord));
		System.out.println("-".repeat(50));
		while(true) {
			System.out.println("1. 다음게임(Skip)");
			System.out.println("2. 힌트보기");
			System.out.println("Quit : 게임중단");
			
			System.out.println("-".repeat(50));
			System.out.print(">> ");
			String strInput = scan.nextLine();
			if(strInput.equals("")) {
				System.out.println("단어나, 메뉴를 선택하세요");
				continue;
			} 
			return strInput;
		}
	}
	
	/*
	 * list에서 getter된 영단어VO를 
	 * 전역변수로 (클래스영역에 멤버변수)로 선언하고
	 * 단어를 저장했다
	 * 
	 *   그랬더니
	 *   영단어VO는 다른 method에서도 참조하는 변수가 되고
	 *   method간에 서로 관심을 가져야 되는 사이
	 *   이런 상황이 진행되면
	 *   영단어VO 변수의 상태를 잘 관리해야하는 문제가 발생한다
	 *   
	 *   getShuffleWord()를 사용하지 않고
	 *   list에서 영단어VO를 getter하고 직접 데이터를 관리하도록
	 *   만든다
	 *   
	 */
//	protected String[] getShuffleWord() {
//		String[] shuffleEnglish = this.shuffleWord(gameWord.getEnglish());
//		return shuffleEnglish;
//	}
}
