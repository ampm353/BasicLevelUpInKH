package com.jin.op;

import java.util.Scanner;

public class Calc04 {
// 배수판정을 통해서 배우는 나머지 연산자 %.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("2의 배수인지 판정할 정수(a) 입력 > ");
		int a = sc.nextInt();
		
		System.out.print("3의 배수인지 판정할 정수(b) 입력 > ");
		int b = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("a는 2의 배수가 맞습니다.");
		}else {
			System.out.println("a는 2의 배수가 아닙니다.");
		}
		
		if(b % 3 == 0) {
			System.out.println("b는 3의 배수가 맞습니다.");
		}else {
			System.out.println("b는 3의 배수가 아닙니다.");
		}
		
		sc.close();
	}

}
