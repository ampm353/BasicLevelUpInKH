package com.jin.scan;

import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� �Է����ּ��� > ");
		int i = sc.nextInt();
		
		System.out.println("�Է��� ���� : " + i + "�Դϴ�.");
		
		
		System.out.print("���� �Ǽ��� �Է����ּ��� > ");
		float j = sc.nextFloat();

		System.out.println("�Է��� ���� : " + j + "�Դϴ�.");
		
		
		System.out.print("�Ǽ��� �Է����ּ��� > ");
		double k = sc.nextDouble();

		System.out.println("�Է��� ���� : " + k + "�Դϴ�.");
		
		
		System.out.print("�� ���ڸ� �Է����ּ��� > ");
		char l = sc.next().charAt(0);
		sc.nextLine();

		System.out.println("�Է��� ���� : " + l + "�Դϴ�.");
		
		
		System.out.print("���ڿ��� �Է����ּ��� > ");
		String m = sc.nextLine();

		System.out.println("�Է��� ���� : " + m + "�Դϴ�.");
		
		sc.close();
	}


}
