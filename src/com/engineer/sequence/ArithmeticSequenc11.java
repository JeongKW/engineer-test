package com.engineer.sequence;
/*
 * Algorithm 11번 문제
 * 1-2+3-4+5-6...+99-100
 */
public class ArithmeticSequenc11 {
	public int arithmeticElevenSum(int initNum, int limitNum) {
		int sum = 0;
		for (int i = initNum; i <= limitNum; i++) {
			if(i % 2 == 0) { // even
				sum -= i;
			} else { // odd
				sum += i;
			}
		}
		return sum;
	}
}

