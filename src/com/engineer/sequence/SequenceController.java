package com.engineer.sequence;

import java.util.Scanner;

public class SequenceController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SequenceService sequenceService = new SequenceServiceImpl();
		SequenceBean sequenceBean = new SequenceBean();
		int sel = 0;
		while (true) {
			System.out.println("[0]종료 [1] 등차수열 [2] 스위치수열");
			sel = scanner.nextInt();
			if(sel != 0 || sel != 3) {
				System.out.print("시작값 : ");
				sequenceBean.setInitNum(scanner.nextInt());
				System.out.print("끝 값 : ");
				sequenceBean.setLimitNum(scanner.nextInt());
			} 
			switch (sel) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println(sequenceService.calcArithmetic(sequenceBean));
				break;
			case 2:
				System.out.println(sequenceService.calcSwitch(sequenceBean));
				break;
			}
		}
	}
}
