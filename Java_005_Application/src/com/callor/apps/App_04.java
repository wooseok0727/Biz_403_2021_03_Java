package com.callor.apps;

import java.util.Random;

/*
 * 5학급의 학생들에게 피자 간식을 지급하려고 합니다.
 * 학급의 인원은 50 ~ 59명 입니다.
 * 학급인원은 Random 클래스를 이용하여 생성합니다.
 * 피자는 1box에 6조각입니다.
 * 다음과 같이 주문리스트를 출력합니다.
 */
public class App_04 {

	public static void main(String[] args) {

		int[] intMembers = new int[5];

		Random rnd = new Random();

		for (int i = 0; i < 5; i++) {
			intMembers[i] = rnd.nextInt(10) + 50;
		}
		int pizzaPcs = 6;
		int pizzaTotal = 0;

		System.out.println("==============================");
		System.out.println("인원수\t피자주문 전체조각수");
		System.out.println("------------------------------");

		for (int i = 0; i < 5; i++) {
			int pizzaBox = intMembers[i] / pizzaPcs;

			if (intMembers[i] % (pizzaBox * pizzaPcs) > 0) {
				pizzaBox++;
			}
			pizzaTotal += pizzaBox;
			System.out.printf(" %d\t %d\t  %d\n", intMembers[i], pizzaBox, pizzaBox * pizzaPcs);
		}
		System.out.println("==============================");
		System.out.println("전체 주문 BOX 수량 : " + pizzaTotal);
	}
}
