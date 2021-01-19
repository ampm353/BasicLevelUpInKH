package com.jin.op;

import java.util.Scanner;

public class Calc05 {
// 조건을 동시에 만족시키는 And연산자(&&)와 증감연산자 복습.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수(a) 입력 > ");
		int a = sc.nextInt();
		
		System.out.print("두 번째 수(b) 입력 > ");
		int b = sc.nextInt();
		
		if(a > 0 && ++b > 0) {
			System.out.println("a는 0보다 큰 값(" + a + ")이며, ++b도 0보다 큰 값(" + b + ")이다.");
		}
		
		if(a < 0 && ++b > 0) {
			System.out.println("a는 0보다 작은 값(" + a + ")이며, ++b는 0보다 큰 값(" + b + ")이다.");
		}
		
		sc.close();
	}

}
