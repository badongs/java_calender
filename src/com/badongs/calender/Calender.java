/* 
<<<<<<<<<<  화면 예제  >>>>>>>>>>
//
//	년을 입력하세요
//	YEAR >
//	2018
//	달을 입력하세요
//	MONTH > 1
//	    <<2018년   1월>>
//	 SU MO TU WE TH FR SA
//	  1  2  3  4  5  6  7
//	  8  9 10 11 12 13 14
//	 15 16 17 18 19 20 21
//	 22 23 24 25 26 27 28
//	 29 30 31
//	 
<<<<<<<<<<  화면 예제  >>>>>>>>>>	 
*/

package com.badongs.calender;

public class Calender {

	private static final int[] MAX_DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
	private static final int[] LEAP_MAX_DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
	private int j;
	
	// === 윤년계산 ===
	private boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 != 0)) {
			return true;
		}
		return false;
	}

	// === 해당월의 마지막 일자  ===
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		} else {
			return MAX_DAYS[month];
		}

		// TODO Auto-generated method stub
	}

	// === 해당월의 첫날 요일 ===
	private int getWeekDay(int year, int month, int day) {
		// 1970년 1월1일의 요일 을 찾아서 등록 (4 : 목요일) 
		int syear = 1970;
		final int STANDARD_WEEKDAY = 4; //1970/Jan/1st = Thursday
		
		int count = 0;
		
		// 검색년도까지의 일자검색 (1970.1.1 ~ 검색전년도) 
		for (int i = syear; i < year; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		
		// 검색월까지의 일자검색 (1.1 ~ 검색전월)
		for (int i = 1; i < month; i++) {
			int delta = getMaxDaysOfMonth(year, i);
			count += delta;
		}
		
		count += day - 1;
		
		int weekday = (count + STANDARD_WEEKDAY) % 7;
		return weekday;
	}
	
	
	public void printCalender(int year, int month) {
		System.out.printf("    <<%4d년 %3d월>>", year, month);
		System.out.println();
		System.out.println(" SU MO TU WE TH FR SA");

		int maxDay = getMaxDaysOfMonth(year, month);

		int weekday = getWeekDay(year, month, 1);

		for (j = 1; j <= weekday; j++) {
			System.out.print("   ");
		}

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (j % 7 == 0) {
				System.out.println();
			}
			j++;
		}

		System.out.println();
		System.out.println();
	}
}
