package com.jin.op;

import java.util.Scanner;

public class Calc05 {
// ������ ���ÿ� ������Ű�� And������(&&)�� ���������� ����.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ��(a) �Է� > ");
		int a = sc.nextInt();
		
		System.out.print("�� ��° ��(b) �Է� > ");
		int b = sc.nextInt();
		
		if(a > 0 && ++b > 0) {
			System.out.println("a�� 0���� ū ��(" + a + ")�̸�, ++b�� 0���� ū ��(" + b + ")�̴�.");
		}
		
		if(a < 0 && ++b > 0) {
			System.out.println("a�� 0���� ���� ��(" + a + ")�̸�, ++b�� 0���� ū ��(" + b + ")�̴�.");
		}
		
		sc.close();
	}

}
