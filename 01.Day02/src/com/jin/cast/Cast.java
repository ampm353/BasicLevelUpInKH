package com.jin.cast;

public class Cast {
	// 기본형 변수들에 대해서 간략하게 설명하고, 강제형변환(Cast)에 대해서 배워보자.

	public static void main(String[] args) {
		boolean bool = true;
		// boolean 타입은 참 거짓 값 중 하나만을 가질 수 있는 타입으로, 1바이트의 크기를 가진다.

		char charText = 'a';
		// char 타입은 '하나'의 문자만을 가질 수 있는 타입으로 2바이트의 크기를 가진다.
		// 나중에 배울 "문자열"을 담는 참조형 변수 String와 비슷해보이지만 많은 차이를 가진다.

		byte byteNum = 127;
		// byte 타입은 정수형 변수 중에서 가장 작은 타입으로, -128 ~ 127의 값만 가질 수 있다.
		// boolean 타입과 마찬가지로 1바이트의 크기를 가진다.

		short shortNum = 10000;
		// short 타입은 -32,768 ~ 32,767의 값을 가질 수 있으며, 2바이트의 크기를 가진다.

		int intNum = 941219;
		// int 타입은 정수형 타입 중 주로 사용되는 타입으로, 약 +/-10억의 값을 가질 수 있으며
		// 4바이트의 크기를 가진다.

		long longNum = 1500000000000000L;
		// long 타입은 정수형 타입 중 가장 큰 타입으로, 약 +/-2의 63승의 값을 가질 수 있으며,
		// 8바이트의 크기를 가진다. 천문학적인 거리를 담을 수 있는 크기이다.
		// 특히 long 타입의 변수는 리터럴(대입되는 값)의 맨 뒤에 L을 반드시 붙여줘야 한다.
		// 뒤에 붙여주는 L은 대소문자 구분을 하지 않지만 통상 1과의 혼동을 줄이기 위하여 대문자를 사용한다.

		float floatNum = 2.718281828F;
		// float 타입은 실수형 타입으로, 가장 많이 쓰이는 double의 장점(정밀도)에 묻혀서 잘 사용되지 않는다.
		// long 타입과 유사하게 리터럴의 맨 뒤에 F를 반드시 붙여줘야 한다.
		// 뒤에 붙여주는 F는 대소문자 구분을 하지 않지만, 눈에 더 잘 띄게 하기 위하여 통상 대문자를 사용한다.
		// 4바이트의 크기를 가진다.

		double doubleNum = 3.141592;
		// double 타입은 같은 실수형 타입인 float보다 오차범위가 더 작고, 주로 사용된다.
		// 8바이트의 크기를 가진다.
		// 사실 double형에도 D라는 접미사가 붙지만, double형은 long형ㅇ나 float형과 다르게 생략이 가능하다.

		System.out.println("불린 타입 : " + bool);
		System.out.println("char 타입 : " + charText);
		System.out.println("byte 타입 : " + byteNum);
		System.out.println("short 타입 : " + shortNum);
		System.out.println("int 타입 : " + intNum);
		System.out.println("long 타입 : " + longNum);
		System.out.println("float 타입 : " + floatNum);
		System.out.println("double 타입 : " + doubleNum);

		// 여기서 잠시 생각해보자.

		// 앞서서 서로 다른 물이 담긴 두 컵에서 내용물만 바꾸는 과정을 생각해보았다.
		// 그럼 이번에는 서로 다른 자료형의 두 변수를 서로 바꾸는 과정을 생각해보자.

		// 아기용 물컵과 어른용 물컵이 각각 2개씩 있다고 해보자.
		// 아기용 물컵 하나에는 우유가 들어있고,
		// 어른용 물컵 하나에는 오렌지 주스가 들어있다.

		// 아기용 물컵에 들은 우유를 비어있는 어른용 물컵에 따르는 것은 아무 문제가 되지 않을 것 같다.
		// 그런데 어른용 물컵에 들은 오렌즈 주스를, 아기용 물컵에 따른다면 어떤 일이 벌어질까?
		// 식탁이 온통 오렌즈주스로 넘쳐 흐르게 될 것이다.

		// 여기서 아기용 물컵은 크기가 작은 변수를 의미하고,
		// 어른용 물컵은 크기가 큰 변수를 의미한다.

		// 예를 들어보자.

		// double형 변수에 들어있던 3.141592를 int형 변수에 넣는다면 무슨 일이 벌어질까?

		// 실제로 아래 코드를 실행해보면
		System.out.println((int) doubleNum);
		// 결과값은 3이 나온다. 0.141519라는 값은 식탁에 흥건하게 있다. 이는 주워담아 마실 수 없다.
		// 컴퓨터도 마찬가지도 한번 절삭된 값은 되살릴 수 없다.

		// 같은 정수형 끼리도 이런 현상은 발생한다.
		// 예를들어 long타입에 들어있는 아주 큰 수를 int형으로 바꾼다면
		System.out.println((int) longNum);
		// int형의 범위를 넘어서기 때문에 쓰레기 값이 나오게 된다.

		// 여기서 잠시 쓰레기 값이란 무엇인지 알아보면,
		byte num1 = 127;
		//127은, byte형 변수가 가질 수 있는 최대값이다.
		
		// 그런데 이 값에 1을 추가하면 어떤 값이 될까?
		byte num2 = (byte)(num1 + 1);
		System.out.println(num2);
		// 128이 아니라 -128이 된 모습을 볼 수 있다.
		// 이렇게 사람이 의도하지 않은 이상한 값이 변수에 들어간 것을 쓰레기 값이 들어갔다고 한다.
		// 왜 이런 현상이 일어나는지는 각 자료형들이 숫자를 저장하는 방식에 대해서 알면 쉽게 이해할 수 있다.
		
		// 끝으로 눈으로 확인하는 예제이다.
		long longVal = 100L;
		int intVal = (int)longVal;
		
		System.out.println(intVal);
		//long형이라 하더라도, int형에서 소화할 수 있는 수(100)이기 때문에 정상출력됨.
		
		double dValue = 123.5;
		int iValue = (int)dValue;
		
		System.out.println(iValue);
		//double형이었던 123.5를 정수형으로 캐스팅 했기 때문에 소수점 아래 수가 탈락됨.
		
	}



}
