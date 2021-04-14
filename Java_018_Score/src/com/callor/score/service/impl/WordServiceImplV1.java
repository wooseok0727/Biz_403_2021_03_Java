package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.WordVO;
import com.callor.score.service.WordService;

/*
 * 1. WordService interface를 implments하여 클래스 작성
 * 2. loadWord() method에서
 * 3. word.txt 파일을 읽어 영어 단어와 한글 뜻을 분리한 후
 * 	  List<WordVO> wordList에 추가
 */
public class WordServiceImplV1 implements WordService {

	List<WordVO> wordList;
	
	public WordServiceImplV1() {
		
		wordList = new ArrayList<WordVO>();
	}
	@Override
	public void loadWord() {
		// TODO 파일을 읽어 영단어와 한글 분리 후 wordList에 추가
		String fileName = "src/com/callor/score/word.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			String reader = new String();
			int count = 0;
			while((reader = buffer.readLine()) != null) {
				count++;
				String[] word = reader.split(":");
				String eng = word[0];
				String kor = word[1];
				WordVO wordVO = new WordVO();
				wordVO.setCount(count);
				wordVO.setEnglish(eng);
				wordVO.setKorea(kor);
				wordList.add(wordVO);
			}
			buffer.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없음");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없음");
		}
	}
	@Override
	public void printWord() {
		// TODO Auto-generated method stub
		for(WordVO word : wordList) {
			System.out.println(word);
		}
		
	}
	@Override
	public void viewWord() {
		// TODO Auto-generated method stub
		
	}

}
