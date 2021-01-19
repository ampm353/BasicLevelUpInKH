package com.jin.op;

import java.util.Scanner;

public class Calc01 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		// 입력 받을 세 수를 전역변수로 선언 후 초기화.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a값을 입력해주세요 > ");
		a = sc.nextInt();
		System.out.print("b값을 입력해주세요 > ");
		b = sc.nextInt();
		System.out.print("c값을 입력해주세요 > ");
		c = sc.nextInt();
		// 각각의 수를 입력받음.
		
		System.out.println("a++ = " + a++);
		// 초기 입력값이 그래도 출력됨(이후 1증가)
		System.out.println("a = " + a);
		// 이전의 증감연산자 때문에 1 증가된 값이 출력됨.
		System.out.println("--a = " + --a);
		// a값을 먼저 1 감소 시킨 후, 출력.
		
		// 다양한 상황을 통한 숙달을 위한 코드.
		System.out.println("a + b = " + ( a+ b));
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + "\n");
		System.out.println("a + (--c) = " + ( a + --c));
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + "\n");
		System.out.println("a + (b--) = " + (a + b--));
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + "\n");
		System.out.println("(a++) + (b++) + (c++) = " + (a++ + b++ + c++));
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + "\n");
		System.out.println("(--a) + (b--) + (c++) = " + (--a + b-- + c++));
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + "\n");
		
		boolean flag = true;
		// 참 혹은 거짓 값만을 갖는 flag란 이름의 boolean형 변수.
		System.out.println(!flag);
		// true를 부정(!) 했으므로 false
		System.out.println(!!flag);
		// false를 부정(!) 했으므로 true
		System.out.println(!!!flag);
		// true를 부정(!) 했으므로 false
		System.out.println(!!!!flag);
		// false를 부정(!) 했으므로 true
		
		sc.close();
	}

}
