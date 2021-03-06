package com.jin.variable;

public class ChangeNumber {
	// 현실세계에서 내가 가진 물건과 상대방이 가진 물건을 물물교환하는 것은 간단하다.
	// 한 손으로 내 물건을 건내면서 다른 한 손으로 상대방이 건내는 물건을 받으면 그만이다.
	// 하지만 정말로 물(Water)물(Water)교환은 어떨까?
	// 빨간 컵에 담긴 빨간 물감 푼 물과 파란컵에 담긴 파란 물감 푼 물이 있을 때,
	// 서로 컵 색깔을 바꿔서 담으려면?
	// 컵까지는 아니어도 최소한 임시로 한 종류의 물을 담을 '그릇정도는 필요'하다고 생각된다.
	// 언어 상에서의 값 교환하기가 그렇다. 아래 코드로 보자.

	public static void main(String[] args) {
		int myAge = 26;
		int myYear = 1994;
		// 위 각각의 수를 바꿔서 저장하려면?

		// 임시 그릇이 필요하다!
		int temp = 0;
		// 임시 그릇 변수 temp를 선언하고 0으로 초기화.
		
		System.out.println("Before");
		System.out.println("myAge : " + myAge);
		System.out.println("myYear : " + myYear);
		// 서로 바꿔 저장하기 전.

		temp = myAge;
		// 임시 그릇에 내 나이를 담고,

		myAge = myYear;
		// 내 나이에 내 연도를 담고,

		myYear = temp;
		// 잠시 넣어뒀던 내 나이를 내 연도에 담으면 끝!
		
		System.out.println("\nAfter");
		System.out.println("myAge : " + myAge);
		System.out.println("myYear : " + myYear);
		// 서로 바꿔 저장한 후.

	}
}
