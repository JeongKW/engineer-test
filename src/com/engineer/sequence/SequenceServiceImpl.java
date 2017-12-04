package com.engineer.sequence;

public class SequenceServiceImpl implements SequenceService {

	@Override
	public String calcArithmetic(SequenceBean seq) {
		String res = "";
		int sum = 0;
		for(int i = seq.getInitNum(); i <= seq.getLimitNum(); i++) {
			if(i == seq.getLimitNum()) {
				res += i + " = ";
				sum += i;
				res += sum;
			} else {
				if(i % 13 == 0) {
					res += i + "\n" + "+ ";
				} else {
					res += i + " + ";
				}
			}
			sum += i;
		}
		return res;
	}

	@Override
	public String calcSwitch(SequenceBean seq) {
		int sum = 0;
		String res = "";
		for(int i = seq.getInitNum(); i <= seq.getLimitNum(); i++) {
			if(i == seq.getLimitNum()) {
				res += i + " = ";
				sum -= i;
				res += sum;
			} else {
				if(i % 2 == 0) {
					if (i % 13 == 0) {
						res += i + "\n";
						res += "+ ";
					} else {
						res += i + " + ";
					}
					sum -= i;
				} else {
					if (i % 13 == 0) {
						res += i + "\n";
						res += "- ";
					} else {
						res += i + " - ";
					}
					sum += i;
				}
			}
		}
		return res;
	}

	@Override
	public String calcGeometric(SequenceBean seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calcDifference(SequenceBean seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calcFactorial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calcFibonacci() {
		// TODO Auto-generated method stub
		return null;
	}
}
