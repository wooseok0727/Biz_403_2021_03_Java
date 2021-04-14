package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 1. word.txt 파일을 읽어 들인 후
 *    영어 단어와 단어의 해석을 다음과 같이 출력
 *    ==========================================
 *    academy		학술원
 *    ==========================================
 */
public class Word_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/word.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			System.out.println("=".repeat(50));
			String reader = new String();
			while((reader = buffer.readLine()) != null) {
				
				String[] word = reader.split(":");
				System.out.printf("%s   %s\n",word[0],word[1]);
			}
			buffer.close();
			System.out.println("=".repeat(50));
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없음");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없음");
		}
	}
}
