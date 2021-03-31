package com.callor.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_01A {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
		String curDate = dateForm.format(date);
		System.out.println(curDate);
		
		SimpleDateFormat timeForm = new SimpleDateFormat("hh:mm:ss");
		System.out.println(timeForm.format(date));
		
	}
}
