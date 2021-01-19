package com.jin.op;

import java.util.Scanner;

public class Calc02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력해주세요 > ");
		int first = sc.nextInt();
		
		System.out.print("두번째 정수를 입력해주세요 > ");
		int second = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (first + second));
		System.out.println("빼기 결과 : " + (first - second));
		System.out.println("곱하기 결과 : " + (first * second));
		System.out.println("나눗셈의 몫 : " + (first / second));
		// 정수 / 정수의 연산결과는 정수이며, 그 값은 몫이다.
		System.out.println("나눗셈의 나머지 : " + (first % second));
		
		System.out.println("나누기 결과 : " + ((double)first / second));
		// 일반적으로 기대했던 나눈값이 궁금하다면,
		// 제수(분모) 또는 피제수(분자) 둘 중 최소한 하나의 값을 실수(float 혹은 double)형으로
		// 강제형변환(cast) 시켜주면 됩니다.
		
		sc.close();
	}

}
