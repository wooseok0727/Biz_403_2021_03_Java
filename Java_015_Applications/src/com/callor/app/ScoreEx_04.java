package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV2B;

public class ScoreEx_04 {

	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV2B();
		sService.selectMenu();
		
	
	}
}
