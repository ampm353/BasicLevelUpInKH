package com.jin.op;

import java.util.Scanner;

public class Calc07 {
// 3�� ������
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("¦�� / Ȧ���� �Ǻ��ϰ� ���� ���ڸ� �Է��Ͻÿ� > ");
		int num = sc.nextInt();
		
		String isEven = (num % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(isEven);
		
		sc.close();
	}

}
