package com.jin.op;

import java.util.Scanner;

public class Calc03 {
// 이진수로 변환된 값들의 연산자별 계산 시각화
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이진수로 변환할 첫 번째 값 > ");
		int x = sc.nextInt();
		
		System.out.print("이진수로 변환할 두 번째 값 > ");
		int y = sc.nextInt();
		
		System.out.println("x \t= " + toBinaryString(x));
		System.out.println("y \t= " + toBinaryString(y));
		
		System.out.println("x|y \t= " + toBinaryString(x | y));
		System.out.println("x&y \t= " + toBinaryString(x & y));
		
		System.out.println("x^y \t= " + toBinaryString(x ^ y));
		System.out.println("~x \t= " + toBinaryString(~x));
		
		sc.close();
	}
	
	static String toBinaryString(int num) {
		// 10진수를 2진수로 바꾸고, 이를 자리수에 맞춰서 출력.
		String zero = "00000000000000000000000000000000";
		String binary = zero + Integer.toBinaryString(num);
		return binary.substring(binary.length() - 32);
	}

}
