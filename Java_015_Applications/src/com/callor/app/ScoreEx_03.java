package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV1;

public class ScoreEx_03 {

	public static void main(String[] args) {
		
		ScoreService scoreService = new ScoreServiceImplV1();
		scoreService.selectMenu();
	}
}
