package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class FileWriter_01 {

	public static void main(String[] args) {
		
		// 메모리에 저장된 데이터를 Console에 출력할 때
		System.out.println("출력");
		
		// 키보드로 부터 데이터를 입력받기 위해서
		Scanner scan = new Scanner(System.in);
		// scan.nextLine();
		
		// 임의의 숫자를 만들기 위해서 
		Random rnd = new Random();
		rnd.nextInt(100);
		
		// 파일에 저장하기
		// 1. 어디에 어떤 파일로 저장할까
		String fileName = "src/com/callor/app/mydate.txt";
		
		// 2. 무엇을 사용하여, 2개의 객체를 선언!!
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		// 3. 파일에 데이터를 기록하기 위하여 파일을 열어라
		// 		새로운 파일을 생성하라
		//		"만약 이미 있으면 지우고 다시 만들어라"

		try {
			fileWriter = new FileWriter(fileName); 		// 	무조건 의무적으로 try-catch문을 써야한다!
			out = new PrintWriter(fileWriter);
			
			out.println("대한민국만세");
			out.printf("%d x %d = %d\n",3 ,4, 3 * 4);
			out.println("우리나라만세");
			
			out.flush();  // 마지막에 flush(),close() method로 닫아준다
			out.close();
			System.out.println("저장 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
