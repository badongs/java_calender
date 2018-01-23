package com.badongs.calender;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// 두수의 합을 구하시요.
		int i,j;
		
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해 주세요.");
		s1 = scanner.next();
		s2 = scanner.next();
		
		i = Integer.parseInt(s1);
		j = Integer.parseInt(s2);
		
		//int sum =  i+j;
		//System.out.println("두 수의 합은 =" + sum);
		
		System.out.printf("%d와 %d의 합는 %d 입니다.", i, j ,i+j);
		scanner.close();
		
	}

}
