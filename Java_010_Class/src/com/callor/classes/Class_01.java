package com.callor.classes;

import java.util.Arrays;
import java.util.Random;

public class Class_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intnum = rnd.nextInt(51) + 50;
		
		System.out.println("난수 :" + intnum);
		int nCount = 0;
		
		for(int i = 2; i < intnum ; i++) {
			if(intnum % i == 0) {
				nCount++;
			}
		}
		int[] intNums = new int[nCount];
		
		for(int i = 2, j = 0; i < intnum; i++) {
			if(intnum % i == 0) {
				intNums[j] = i;
				j++;
				}
			}
		System.out.println(Arrays.toString(intNums));
		}
		
}
