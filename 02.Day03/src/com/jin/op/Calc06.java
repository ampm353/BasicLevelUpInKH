package com.jin.op;

public class Calc06 {
// ������ ���� ������ �����غ���, �ڵ带 ������Ѽ� ������ ������ ����� ��ġ���� Ȯ��.
	public static void main(String[] args) {

		int a = 50, b = 30;
		
		System.out.println(a != b && a < b); // false
		// && ��ȣ�� �������� ���� ������ Ʋ���ٸ�, ������ ���� ��������� �ʴ´�.
		// || ��ȣ�� �������� ���� ������ �´ٸ�, ������ ���� ��������� �ʴ´�.
		
		System.out.println(a < b || a == b); // false
		System.out.println(a > b && a != b); // true
		System.out.println(a > b || a == b); // true
		System.out.println();
		
		a = 70;
		b = 55;
		System.out.println(a == b || a++ < 100); //true 71 55
		System.out.println(a < b && --b <55); // false 71 55 <- ������ Ÿ������
		System.out.println(b);
		System.out.println(a != b && b-- < a++); // true 72 54
		System.out.println(a++ != b || b++ >= 85); // true 73 54 <- ������ Ÿ������
		System.out.println(b);
		System.out.println("a = " + a); // 73
		System.out.println("b = " + b); // 55
	}

}
