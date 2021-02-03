package com.jin.random;

import java.util.Random;

// 난수발생 클래스인 Random 클래스를 사용할 것임. nextIn(100); -> 0 - 99 사이의 숫자 중 1개.
public class RandomTest {

	public void randomTest1() {
		Random r = new Random();
		for(int i=0; i<10; i++) {
			int num = r.nextInt(100);
			// 0부터 99까지의 수 중 랜덤.
			System.out.println("랜덤 수 : "+num);
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			int num = r.nextInt(10) + 1;
			// 1부터 10까지의 수 중 랜덤.
			System.out.println("랜덤 수 : "+num);
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			int num = r.nextInt(16) + 20;
			// 20부터 35까지의 수 중 랜덤
			System.out.println("랜덤 수 : "+num);
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			int num = r.nextInt(2);
			// 0 또는 1의 수 중 랜덤.
			System.out.println("랜덤 수 : "+num);
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
