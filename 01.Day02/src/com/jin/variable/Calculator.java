package com.jin.variable;

public class Calculator {
	// 계산기 예제를 통해서, 다음에 배울 변수 타입으로 자연스럽게 넘어가보자.

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// 두 정수 a와 b를 각각 더하고(+) 빼고(-) 곱하고(*) 나누는(/) 연산을 수행.

		System.out.println("a(" + a + ") + b(" + b + ") = " + (a + b));
		// System.out.println()안에서의 +는 문자열들의 결합에 대한 기호로 보통 쓰이기 때문에
		// 산술연산인 plus로 온전히 사용하려면 위 처럼 두 수와 연산자를 괄호로 묶어주어야 한다.

		System.out.println("a(" + a + ") - b(" + b + ") = " + (a - b));
		// 뺄셈

		System.out.println("a(" + a + ") * b(" + b + ") = " + (a * b));
		// 곱셈

		System.out.println("a(" + a + ") / b(" + b + ") = " + (a / b));
		// 나눗셈

		// 일반적으로 / 연산을 수행하면 우리가 아는 0.5가 나올 것이라고 생각했지만,
		// 결과를 보니 0이 나왔다. 왜 그럴까?
		// 이유는 바로 정수 / 정수 = 정수(몫) 이기 때문.
		
		// 하여 우리가 일반적으로 알고 있는 0.5값을 보고 싶다면
		// 분모나 분자 중 최소한 하나는 '실수형'이어야 한다.
		// 기본 실수형이 double이니, 이를 적용해보자.
		
		double c = 20;
		System.out.println("a(" + a + ") / c(" + c + ") = " + (a / c));
		// 진짜 나눗셈
		
		// 여기서! 정수 / 정수 = 정수(몫)라고 했는데, 나머지 연산도 있는가?
		// 있다. %가 바로 나머지 연산.
		
		System.out.println("a(" + a + ") % b(" + b + ") = " + (a % b));
		// 나머지
		
		// 끝으로 위에서 c를 실수형으로 새로 만들어줘도 되지만,
		// b를 실수형으로 '강제형변환(cast)' 해도 우리가 아는 연산이 수행된다.

		System.out.println("a(" + a + ") / b(" + b + ") = " + (a / (double)b));
		// 진짜 나눗셈
		
	}


}
