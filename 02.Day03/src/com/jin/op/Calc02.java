package com.jin.op;

import java.util.Scanner;

public class Calc02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է����ּ��� > ");
		int first = sc.nextInt();
		
		System.out.print("�ι�° ������ �Է����ּ��� > ");
		int second = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (first + second));
		System.out.println("���� ��� : " + (first - second));
		System.out.println("���ϱ� ��� : " + (first * second));
		System.out.println("�������� �� : " + (first / second));
		// ���� / ������ �������� �����̸�, �� ���� ���̴�.
		System.out.println("�������� ������ : " + (first % second));
		
		System.out.println("������ ��� : " + ((double)first / second));
		// �Ϲ������� ����ߴ� �������� �ñ��ϴٸ�,
		// ����(�и�) �Ǵ� ������(����) �� �� �ּ��� �ϳ��� ���� �Ǽ�(float Ȥ�� double)������
		// ��������ȯ(cast) �����ָ� �˴ϴ�.
		
		sc.close();
	}

}
