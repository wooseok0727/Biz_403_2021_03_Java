package com.callor.method.service;

/*
 * 1. NumberServiceV7 클래스를 선언
 * 2. {"국어","영어","수학","과학","국사"}를 요소로 갖는 문자열 배열 선언
 * 3. NumberServiceV7.inputScore() method를 선언
 * 
 * 4. InputService 클래스의 inputValue() method를 호출하여
 * 5. 각 과목의 점수를 입력 받고
 * 6. 점수 범위 0 ~ 100의 유효성 검사를 수행합니다
 */
public class NumberServiceV7 {

	protected InputService inService;

	public NumberServiceV7() {

		inService = new InputService();
	}

	public void inputScore() {

		String[] subject = { "국어", "영어", "수학", "과학", "국사" };
		Integer[] retNum = new Integer[5];

		for (int i = 0; i < subject.length; i++) {
			while (true) {
				retNum[i] = inService.inputValue(subject[i]);
				if (retNum[i] == null) {
					return;
				} else if (retNum[i] < 0 || retNum[i] > 100) {
					System.out.println("점수는 0 ~ 100까지");
					continue;
				} else {
					break;
				}
			}
		}
	}
}
