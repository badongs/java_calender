package com.badongs.calender;

import java.util.Scanner;

public class Prompt {
	public int parseDay(String week) {

		switch (week) {
		case "su":
			return 0;
		case "mo":
			return 1;
		case "tu":
			return 2;
		case "wd":
			return 3;
		case "th":
			return 4;
		case "fr":
			return 5;
		default:
			return 100;
		}
		// TODO Auto-generated method stub
	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();

		// int repeat = scanner.nextInt();
		int year = 2017;
		int month = 1;
		while (true) {
			System.out.println("년을 입력하세요");
			System.out.print("YEAR > ");
			year = scanner.nextInt();
			System.out.println("달을 입력하세요");
			System.out.print("MONTH > ");
			month = scanner.nextInt();
			
			if (year == -1) {
				System.err.println("잘못된 입력입니다.");
				break;
			}
			
			if (month > 12 || month == -1) {
				System.err.println("잘못된 입력입니다.");
				continue;
			}
			
			cal.printCalender(year, month);
		}


		System.out.println("Bye~~");
		scanner.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt prompt = new Prompt();
		prompt.runPrompt();
	}
}
