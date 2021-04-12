package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/*
 *  1. Random 클래스를 사용하여 0 ~ 100 까지 범위의  난 수 2개를
 *     생성한 후 4칙 연산을 수행한다.
 *  2. FileWriter, PrintWriter 클래스를 사용하여
 *     src/com/callor/app/data.txt 파일에 4칙 연산 결과를
 *     다음과 같이 저장한다
 *     ※ 뺼셈과 나눗셈은 큰수 - 작은수, 큰수 / 작은수 로 연산
 *     ==========================================
 *     3 + 4 = 7
 *     4 - 3 = 1
 *     3 * 4 = 12
 *     4 / 3 = 1
 */
public class FileWriterEx_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(101);	
		int num2 = rnd.nextInt(101);
		
		String fileName = "src/com/callor/app/data.txt";
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		int temp = 0;
		int tempNum1 = 0;
		int tempNum2 = 0;
		
		if(num1 < num2) {
			temp = num1;
			tempNum1 = num2;
			tempNum2 = temp;
		}
		
		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			
			out.println("=".repeat(50));
			out.printf("%d + %d = %d\n",num1 ,num2 ,num1 + num2);	
			out.printf("%d - %d = %d\n",tempNum1 ,tempNum2 ,tempNum1 - tempNum2);
			out.printf("%d x %d = %d\n",num1 ,num2 ,num1 * num2);
			out.printf("%d / %d = %d\n",tempNum1 ,tempNum2 ,tempNum1 / tempNum2);
			out.println("-".repeat(50));
			
			out.flush();
			out.close();
			System.out.println("완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 생성할 수 없음");
		}
	}
}
