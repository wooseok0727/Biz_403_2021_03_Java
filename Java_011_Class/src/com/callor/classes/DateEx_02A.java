package com.callor.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_02A {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeForm = new SimpleDateFormat("hh:mm:ss");
		
		String curDate = dateForm.format(today);
		String curTime = timeForm.format(today);
		System.out.printf("오늘 날짜 : %s, 현재시작 : %s",curDate ,curTime);
		
		
	}
}
