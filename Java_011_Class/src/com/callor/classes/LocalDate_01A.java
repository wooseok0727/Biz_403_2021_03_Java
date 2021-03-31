package com.callor.classes;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDate_01A {

	public static void main(String[] args) {
		
		LocalDateTime local = LocalDateTime.now();
		
		System.out.println(local);
		
		System.out.println(local.toString());
		
		System.out.println(local.plusMonths(2).with(TemporalAdjusters.lastDayOfMonth()));
		
		System.out.println(local.toLocalDate());
		System.out.println(local.toLocalTime());
	}
}
