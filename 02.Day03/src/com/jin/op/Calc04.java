package com.jin.op;

import java.util.Scanner;

public class Calc04 {
// ��������� ���ؼ� ���� ������ ������ %.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("2�� ������� ������ ����(a) �Է� > ");
		int a = sc.nextInt();
		
		System.out.print("3�� ������� ������ ����(b) �Է� > ");
		int b = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("a�� 2�� ����� �½��ϴ�.");
		}else {
			System.out.println("a�� 2�� ����� �ƴմϴ�.");
		}
		
		if(b % 3 == 0) {
			System.out.println("b�� 3�� ����� �½��ϴ�.");
		}else {
			System.out.println("b�� 3�� ����� �ƴմϴ�.");
		}
		
		sc.close();
	}

}
