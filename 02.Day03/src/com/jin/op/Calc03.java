package com.jin.op;

import java.util.Scanner;

public class Calc03 {
// �������� ��ȯ�� ������ �����ں� ��� �ð�ȭ
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� ��ȯ�� ù ��° �� > ");
		int x = sc.nextInt();
		
		System.out.print("�������� ��ȯ�� �� ��° �� > ");
		int y = sc.nextInt();
		
		System.out.println("x \t= " + toBinaryString(x));
		System.out.println("y \t= " + toBinaryString(y));
		
		System.out.println("x|y \t= " + toBinaryString(x | y));
		System.out.println("x&y \t= " + toBinaryString(x & y));
		
		System.out.println("x^y \t= " + toBinaryString(x ^ y));
		System.out.println("~x \t= " + toBinaryString(~x));
		
		sc.close();
	}
	
	static String toBinaryString(int num) {
		// 10������ 2������ �ٲٰ�, �̸� �ڸ����� ���缭 ���.
		String zero = "00000000000000000000000000000000";
		String binary = zero + Integer.toBinaryString(num);
		return binary.substring(binary.length() - 32);
	}

}
