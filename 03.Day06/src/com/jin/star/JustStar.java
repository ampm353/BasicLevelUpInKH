package com.jin.star;

import java.util.Scanner;

public class JustStar {

	
	public void star1() {
		// *****
		// *****
		// *****
		// *****
		// ***** 
		// ���� ������ ��µǰ� �ϱ�.
		// ��, for���� System.out.print("*")���� ���.
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
	public void number1() {
		// 11111
		// 22222
		// 33333
		// 44444
		// 55555
		// ���� ������ ��µǰ� �ϱ�.
		// ��Ʈ. i �� j �� ����(���)�ϴ� ����� ���� ����.
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5; j++) {
				
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
	
	public void number2() {
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		// ���� ������ ��µǰ� �ϱ�.
		// ��Ʈ. i �� j �� ����(���)�ϴ� ����� ���� ����.
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5; j++) {
				
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
	
	public void number3() {
		// 12345
		// 23456
		// 34567
		// 45678
		// 56789
		// ���� ������ ��µǰ� �ϱ�.
		// ��Ʈ. ���ݱ��� �ľ��� i �� j �� ��ȭ�� ���� ���.
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5; j++) {
				
				System.out.print(i+j+1);
			}
			System.out.println();
		}
	}
	
	public void number4() {
		// 56789
		// 45678
		// 34567
		// 23456
		// 12345
		// ���� ������ ��µǰ� �ϱ�.
		// ��Ʈ. ���ݱ��� �ľ��� i �� j �� ��ȭ�� ���� ���.
		
		for(int i=4; i>=0; i--) {
			
			for(int j=0; j<5; j++) {
				
				System.out.print(i+j+1);
			}
			System.out.println();
		}
	}
	
	// while Ƚ���� ������ ���� �ƴ� �ܼ� ����(���ѷ���)�� ���õ� �ݺ���
	// for Ƚ���� ������ �ݺ���
	
	public void whileTest() {
		int i = 0;
		while(i<5) {
			System.out.println("hi");
			i++;
		}
		// hi�� 5�� ���.
		System.out.println("--------------------");
		while(i<0) {
			System.out.println("hi");
			i++;
		}
		// hi�� 0�� ���. �׷���,
		System.out.println("--------------------");
		do {
			System.out.println("hi");
			i++;
		}while(i<0);
		// do while���� �ϴ� ���๮�� ������ �����Ų�� ������ Ȯ���Ѵ�. ������ ������ �ʴ�.
		System.out.println("--------------------");
	}
	
	public void whileExam1() {
		// ������ 5�� �Է¹ް�, �� ���� ����Ͻÿ�.
		
		int count = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(count<5) {
			System.out.print("���ϴ� ������ �Է��Ͻÿ�("+(5-count)+"�� ����) > ");
			int num = sc.nextInt();
			sum += num;
			count++;
		}
		System.out.println("�Էµ� ������ �� ���� "+sum+"�Դϴ�.");
		sc.close();
		
	}
	
	public void whileExam2() {
		// 1���� 100������ �� �߿��� ¦������ ���� ���Ͻÿ�.
		int i=1;
		int sum=0;
		while(i<=100) {
			if(i%2==0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1���� 100���� �� ¦���� ���� "+sum+"�Դϴ�.");
		
	}
	
	public void whileExam3() {
		// 1���� �Է¹��� �������� �� �߿� ¦������ ���� ���Ͻÿ�.
		int i=1;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ������ �Է��Ͻÿ� > ");
		int num = sc.nextInt();
		while(i<=num) {
			if(i%2==0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1���� "+num+"���� �� ¦���� ���� "+sum+"�Դϴ�.");
		sc.close();
	}
	
	// ���ѷ��� : �ݺ� Ƚ���� ������ ���� �ʰ�, ������ �ݺ��Ǵ� ����.
	// �ᱹ �ݺ����̱� ������ for���� while���� ����Ѵ�.
	// while(true) <=> for(;;)
	// �Ϲ������� while���� �� ��ȣ��.
	// ������ �ܺο��� ��Ʈ�� �ϰ� ���� �� ����Ѵٰ� �����ϸ� ��.
	
	public void whileExam4() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("hi");
			System.out.print("��� ����Ͻðڽ��ϱ�? [ y / n ]");
			char ans = sc.next().charAt(0);
			if(ans == 'n') {
				break;
				// boolean���� ������ �����Ͽ� ������ ���� ������,
				// �׷��� �Ǹ� ���� ���嵵 ��� �����ϰ� �����ϰ� �ȴ�.
				// break���� �� ��� �����. (�ݺ������ ���� ���� ���������� �������� �� ����ϴ� ���.)
				// break�� �ϳ���, ������ �ݺ��� �ϳ��� Ż���Ѵ�.
				// ���������� ��Ȯ�� �ٸ� �������� continue�� �ִ�. 
				// �ݺ����� ������ �κ��� �����ϰ� �ݺ����� ���η� �̵��� �� ����ϴ� ���.
				// continue�� ������, �ش� �ݺ����� �ֻ��. ��, ���ǹ�.. ���� �̵��ϰ� �ȴ�.
			}
			System.out.println("�ѹ� �� ����Ѵ�.");
		}
		sc.close();
		
	}
}
