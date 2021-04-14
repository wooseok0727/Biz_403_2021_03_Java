package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *  1. http://github.com/callor/Reference/../student.txt
 *     데이터를 복사하여 score 패키지 아래에 student.txt 파일에 저장
 *  2. student.txt 파일을 읽어 들인 후
 *     학생들의 이름과 주소를 다음과 같은 형식으로 출력
 *     (200명 학생 리스트를 출력)
 *     ===================================================
 *     홍길동		서울시
 *     이몽룡		남원시
 *     ===================================================   
 */
public class Student_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/student.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		final int 이름 = 1;
		final int 주소 = 5;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			System.out.println("=".repeat(70));
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				String[] studentInfo = reader.split(":");
				System.out.printf("%s\t%s\n",studentInfo[이름],studentInfo[주소]);
			}
			buffer.close();
			System.out.println("=".repeat(70));
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다");
		}
	}
}
