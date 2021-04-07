package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. 과목명을 subject = {"국어","영어","수학"} 배열에 선언
 * 2. 과목의 점수를 담을 3개의 List 를 선언
 * 	  List<Integer> kors,
 *    List<Integer> engs,
 *    List<Integer> maths
 * 3. InputServiceV2의 inputValue() method를 사용하여
 * 	  5명 학생의 각 과목의 점수를 입력
 * 4. 입력 받은 점수를 kors, engs, maths list에 add()
 * 5. printScore() method를 사용하여 성적 리스트 출력   
 */
public class ScoreServiceV5 {
	
	protected String[] subject;
	protected List<Integer> kors;
	protected List<Integer> engs;
	protected List<Integer> maths;
	protected InputServiceV2 inService;
	protected int student;
	
	public ScoreServiceV5() {
		
		subject = new String[] {"국어","영어","수학"};
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();
		inService = new InputServiceV2();
		student = 5;
	}
	
	public Integer inputScore() {
		
		Integer[] scores = new Integer[subject.length];
		
		for(int i = 0; i < student; i++) {
			System.out.println((i + 1) + "번 학생 ");
			for(int j = 0; j < subject.length; j++) {
				scores[j] = inService.inputValue(subject[j], 0, 100);
				if(scores[j] == null) {
					return null;
				}
			}
			kors.add(scores[0]);
			engs.add(scores[1]);
			maths.add(scores[2]);
		}
		return 0;
	}
	public void printScore() {
		
		int[] sum = new int[student];
		float[] avg = new float[student];
		
		System.out.println("=".repeat(50));
		System.out.println("순번\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0; i < student; i++) {
			sum[i] = kors.get(i) + engs.get(i) + maths.get(i);
			avg[i] = (float)sum[i] / subject.length;
			
			System.out.printf("%03d\t",i+1);
			System.out.print(kors.get(i) + "\t");
			System.out.print(engs.get(i) + "\t");
			System.out.print(maths.get(i) + "\t");
			System.out.print(sum[i] + "\t");
			System.out.printf("%3.2f\n",avg[i]);	
		}
	}

}
