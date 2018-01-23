package com.badongs.calender;

public class Calender {

	private static final int[] MAX_DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
	private static final int[] LEAP_MAX_DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
	private int j;

	private boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 != 0)) {
			return true;
		}
		return false;
	}

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		} else {
			return MAX_DAYS[month];
		}

		// TODO Auto-generated method stub
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

		// System.out.println("---------------------");
		// System.out.println(" 1 2 3 4 5 6 7 ");
		// System.out.println(" 8 9 10 11 12 13 14 ");
		// System.out.println("15 16 17 18 19 20 21");
		// System.out.println("22 23 24 25 26 27 28");
		// System.out.println("29 30 31 ");

	}
	
	private int getWeekDay(int year, int month, int day) {
		int syear = 1970;
		final int STANDARD_WEEKDAY = 3; //1970/Jan/1st = Thursday
		
		int count = 0;
		
		for (int i = syear; i < year; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		
		//System.out.println(count);
		for (int i = 1; i < month; i++) {
			int delta = getMaxDaysOfMonth(year, i);
			count += delta;
		}
		
		count += day;
		
		int weekday = (count + STANDARD_WEEKDAY) % 7;
		return weekday;
	}
	
	public static void main(String[] args) {
		Calender c = new Calender();
		c.getWeekDay(1970, 1, 1);
	}
}
