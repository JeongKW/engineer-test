package com.engineer.sequence;
/*
 * Algorithm 10번
 * 1 + 2 + 3 + 4 + ... + 100
 */
public class ArithmeticSequence10 {
	public int arithmeticTenSum(int initNum, int limitNum) {
		int sum = 0;
		for (int i = initNum ; i <= limitNum ; i++) {
			sum += i;
		}
		return sum;
	}
}
