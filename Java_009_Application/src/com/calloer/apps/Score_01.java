package com.calloer.apps;

import com.calloer.apps.service.ScoreServiceV1;

public class Score_01 {

	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		ssV1.inputScore();
		ssV1.sumScore();
		ssV1.printScore();
	}
}
