package com.badongs.calender;

import java.util.Scanner;

public class CalenderJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello, Calender");
//		System.out.println(" 일   월   화   수   목   금   토");
//		System.out.println("---------------------");
//		System.out.println(" 1  2  3  4  5  6  7 ");
//		System.out.println(" 8  9 10 11 12 13 14 ");
//		System.out.println("15  16  17  18 19 20 ");
//		System.out.println("21  22 23  24  25 26 ");
//		System.out.println("27  28 29  30  31 ");
//		2
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		int month = scanner.nextInt();
		
		int[] maxDays = {31,28,31,30,31,30,31,30,31,30,31,30};
		
		System.out.printf("%d 월은 %d일까지 있습니다.\n", month, maxDays[month-1] );
		scanner.close();
	}

}
