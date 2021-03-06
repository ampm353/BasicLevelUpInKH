package com.jin.scan;

import java.util.Scanner;

public class MyInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 키보드로 입력을 받기 위해서 Scanner 클래스를 불러오는 것.

		System.out.print("본인의 이름을 공백없이 입력하시오 > ");
		// 입력받을 정보에 대해서 먼저 고지해주지 않으면, 유저는 마냥 기다리게 된다.
		String myName = sc.next();
		// 키보드로 입력받은 (공백없는)값을 String 자료형의 myName 변수에 넣는다.

		System.out.print("나이를 숫자로 입력하시오 > ");
		int myAge = sc.nextInt();
		// 키보드로 입력받은 정수값을 int 자료형의 myAge 변수에 넣는다.
		
		sc.nextLine();
		// 뒤에서 사용되는 nextLine 메소드가 앞서서 입력된 Enter값을 입력받아버리기 때문에,
		// 이를 사전에 소화시키는 역할을 한다.

		System.out.print("주소를 동까지 입력하시오 > ");
		String myAddr = sc.nextLine();
		// 키보드로 입력받은 (공백이 포함된)값을 String 자료형의 myAddr 변수에 넣는다.

		System.out.print("키를 실수로 입력하시오 > ");
		double myHeight = sc.nextDouble();
		// 키보드로 입력받은 실수값을 double 자료형의 myHeight 변수에 넣는다.

		System.out.print("몸무게를 실수로 입력하시오 > ");
		double myWeight = sc.nextDouble();

		System.out.print("성별을 [F/M]으로 입력하시오 > ");
		char myGender = sc.next().charAt(0);
		// 키보드로 입력받은 (공백없는)값의 0번째 문자(첫번째 문자)을 char 자료형의 myGender 변수에 넣는다.
		// 컴퓨터에서는 1이 첫 번째가 아니라, 0이 첫 번째이다.

		System.out.println("입력된 귀하의 신상정보는 아래와 같습니다.");
		System.out.println("이름 : " + myName);
		System.out.println("성별 : " + myGender);
		System.out.println("나이 : " + myAge);
		System.out.println("주소 : " + myAddr);
		System.out.println(" 키  : " + (int) myHeight);
		System.out.printf("몸무게 : %.1f\n", myWeight);
	}


}
