package com.jin.scan;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է����ּ��� > ");
		String userName = sc.next(); //���鹮�ڸ� �Է¹��� ����
		System.out.print("������ �Է����ּ��� > ");
		char userGender = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("�ּҸ� �Է����ּ��� > ");
		String userAddr = sc.nextLine(); //���鹮�ڸ� �Է¹���
		System.out.printf("�̸� : %s\n���� : %s\n�ּ� : %s\n", userName, userGender, userAddr);

		sc.close();
	}

}