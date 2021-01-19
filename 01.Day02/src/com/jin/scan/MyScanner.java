package com.jin.scan;

import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 입력해주세요 > ");
		int i = sc.nextInt();
		
		System.out.println("입력한 값은 : " + i + "입니다.");
		
		
		System.out.print("작은 실수를 입력해주세요 > ");
		float j = sc.nextFloat();

		System.out.println("입력한 값은 : " + j + "입니다.");
		
		
		System.out.print("실수를 입력해주세요 > ");
		double k = sc.nextDouble();

		System.out.println("입력한 값은 : " + k + "입니다.");
		
		
		System.out.print("한 글자를 입력해주세요 > ");
		char l = sc.next().charAt(0);
		sc.nextLine();

		System.out.println("입력한 값은 : " + l + "입니다.");
		
		
		System.out.print("문자열을 입력해주세요 > ");
		String m = sc.nextLine();

		System.out.println("입력한 값은 : " + m + "입니다.");
		
		sc.close();
	}


}
