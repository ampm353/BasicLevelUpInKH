package com.jin.op;

import java.util.Scanner;

public class Calc01 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		// �Է� ���� �� ���� ���������� ���� �� �ʱ�ȭ.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a���� �Է����ּ��� > ");
		a = sc.nextInt();
		System.out.print("b���� �Է����ּ��� > ");
		b = sc.nextInt();
		System.out.print("c���� �Է����ּ��� > ");
		c = sc.nextInt();
		// ������ ���� �Է¹���.
		
		System.out.println("a++ = " + a++);
		// �ʱ� �Է°��� �׷��� ��µ�(���� 1����)
		System.out.println("a = " + a);
		// ������ ���������� ������ 1 ������ ���� ��µ�.
		System.out.println("--a = " + --a);
		// a���� ���� 1 ���� ��Ų ��, ���.
		
		// �پ��� ��Ȳ�� ���� ������ ���� �ڵ�.
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
		// �� Ȥ�� ���� ������ ���� flag�� �̸��� boolean�� ����.
		System.out.println(!flag);
		// true�� ����(!) �����Ƿ� false
		System.out.println(!!flag);
		// false�� ����(!) �����Ƿ� true
		System.out.println(!!!flag);
		// true�� ����(!) �����Ƿ� false
		System.out.println(!!!!flag);
		// false�� ����(!) �����Ƿ� true
		
		sc.close();
	}

}
