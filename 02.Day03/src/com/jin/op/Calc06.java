package com.jin.op;

public class Calc06 {
// 각각에 대한 정답을 생각해보고, 코드를 실행시켜서 본인의 생각과 결과가 일치한지 확인.
	public static void main(String[] args) {

		int a = 50, b = 30;
		
		System.out.println(a != b && a < b); // false
		// && 기호를 기준으로 좌측 수식이 틀리다면, 우측의 식은 연산되지도 않는다.
		// || 기호를 기준으로 좌측 수식이 맞다면, 우측의 식은 연산되지도 않는다.
		
		System.out.println(a < b || a == b); // false
		System.out.println(a > b && a != b); // true
		System.out.println(a > b || a == b); // true
		System.out.println();
		
		a = 70;
		b = 55;
		System.out.println(a == b || a++ < 100); //true 71 55
		System.out.println(a < b && --b <55); // false 71 55 <- 우항을 타지않음
		System.out.println(b);
		System.out.println(a != b && b-- < a++); // true 72 54
		System.out.println(a++ != b || b++ >= 85); // true 73 54 <- 우항을 타지않음
		System.out.println(b);
		System.out.println("a = " + a); // 73
		System.out.println("b = " + b); // 55
	}

}
