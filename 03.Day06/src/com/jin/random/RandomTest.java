package com.jin.random;

import java.util.Random;

// �����߻� Ŭ������ Random Ŭ������ ����� ����. nextIn(100); -> 0 - 99 ������ ���� �� 1��.
public class RandomTest {

	public void randomTest1() {
		Random r = new Random();
		for(int i=0; i<10; i++) {
			int num = r.nextInt(100);
			// 0���� 99������ �� �� ����.
			System.out.println("���� �� : "+num);
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			int num = r.nextInt(10) + 1;
			// 1���� 10������ �� �� ����.
			System.out.println("���� �� : "+num);
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			int num = r.nextInt(16) + 20;
			// 20���� 35������ �� �� ����
			System.out.println("���� �� : "+num);
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			int num = r.nextInt(2);
			// 0 �Ǵ� 1�� �� �� ����.
			System.out.println("���� �� : "+num);
		}
	}
	
	public void lotto() {
		Random r = new Random();
		
		System.out.print(r.nextInt(10)+" ");
		System.out.print(r.nextInt(10)+" ");
		System.out.print(r.nextInt(10)+" ");
		System.out.print(r.nextInt(10)+" ");
		System.out.print(r.nextInt(10)+" ");
		System.out.print(r.nextInt(10)+" ");
	}
}
