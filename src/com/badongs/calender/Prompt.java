package com.badongs.calender;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal>";
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();

		// int repeat = scanner.nextInt();
		int year = 2017;
		int month = 1;
		while (true) {
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}

			if (month > 12) {
				continue;
			}
			//System.out.printf("%d 월은 %d일까지 있습니다.\n", month, cal.getmaxDaysOfMonth(month));
			cal.printCalender(year, month);
		}
		/*
		 * for(int i=0; i<repeat;i++) { System.out.println("달을 입력하세요");
		 * System.out.print(prompt); int month = scanner.nextInt();
		 * System.out.printf("%d 월은 %d일까지 있습니다.\n", month,
		 * cal.getmaxDaysOfMonth(month)); }
		 */

		System.out.println("Bye~~");
		scanner.close();
	}
	
	public static void main(String[] args) {
		// 셀 실행
		Prompt prompt = new Prompt();
		prompt.runPrompt();
	}
}
