package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV2;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreService scoreService = new ScoreServiceImplV2();
		scoreService.selectMenu();
		
		
	}
}
