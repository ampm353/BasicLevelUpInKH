package com.jin.op;

import java.util.Scanner;

public class Calc07 {
// 3항 연산자
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("짝수 / 홀수를 판별하고 싶은 숫자를 입력하시오 > ");
		int num = sc.nextInt();
		
		String isEven = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(isEven);
		
		sc.close();
	}

}
