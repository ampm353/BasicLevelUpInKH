package com.jin.print;

public class VarPrint {

	public static void main(String[] args) {
		System.out.println(1 + 1);
		// 정수 + 정수 = 정수
		
		System.out.println(1.1 + 1.1);
		// 실수 + 실수 = 실수
		
		System.out.println('1' + '1');
		// 문자a + 문자b = 문자a의 아스키코드 수 + 문자b의 아스키코드 수
		// 여기서 문자1의 아스키코드 수는 49이다.
		
		System.out.println("1" + "1");
		// 문자열a + 문자열b = 문자열a문자열b
		// 문자는 작은따옴표 ' 문자열은 큰따옴표 " 로 구분한다.

		System.out.println("Hello" + 'q');
		// 문자열 + 문자 = 문자열
		
		System.out.println("Hello" + 3.14);
		// 문자열 + 실수 = 문자열
		
		System.out.println(10 + 20 + "Hello");
		// 연산방향이 좌에서 우 방향이기 때문에,
		// 10+20을 먼저 연산하고, 이를 문자열 Hello와 붙이는 것이다.
		
		System.out.println(10 + "Hello" + 20);
		System.out.println("Hello" + 10);
		System.out.println(10 + "Hello");
		System.out.println(10 + (20 + "Hello"));
		// 이쯤에서 느껴질 것은, 문자열 + AnyThing = 문자열 이라는 사실이다.

		float fNum = 486.520F;
		System.out.printf("%.3f\n", fNum);
		// 형식(form)을 지정하여 출력할 수 있는 printf.

		boolean bool = true;
		System.out.println(bool);
		// 참
		
		bool = (3 > 2);
		System.out.println(bool);
		// 참
		
		bool = (1 == 2);
		System.out.println(bool);
		// 거짓

		char k1 = 'a';
		// 문자 a
		char k2 = 97;
		// 아스키코드에서 문자 a를 가리키는 수
		char k3 = '\u0061';
		// 유니코드에서 문자 a를 가리키는 기호
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		// 그래서 결국 모두 a
	}


}
