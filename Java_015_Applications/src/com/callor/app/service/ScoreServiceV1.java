package com.callor.app.service;

import com.wooseok.standard.InputService;
import com.wooseok.standard.impl.InputServiceImplV1;

/* 
 * 1. InputService interface를 활용하여
 * 2. 한 학생의 국어, 영어, 수학점수를 입력받고
 * 3. 총점과 평균을 계산하여 출력
 * 4. 단, 점수는 0 ~ 100까지만 입력할 수 있음
 */
public class ScoreServiceV1 {
	
	protected InputService inputService;
	protected String[] subject;
	
	public ScoreServiceV1() {
		
		inputService = new InputServiceImplV1();
		subject = new String[] {"국어","영어","수학"};	
	}
	
	public void inputScore() {
		
		Integer[] scores = new Integer[subject.length];
		int sum = 0;
		for(int i = 0; i < subject.length; i++) {
			scores[i] = inputService.inputValue(subject[i], 0, 100);
			if(scores[i] == null) {
				return;
			}
			sum += scores[i];
		}
		float avg = (float)sum / subject.length;
		this.printScore(sum,avg);
	}
	
	public void printScore(int sum, float avg) {
		
		System.out.printf("총점 : %d\t",sum);
		System.out.printf("평균 : %3.2f\n",avg);
	}
}
