package com.jin.star;

import java.util.Scanner;

public class JustStar {

	
	public void star1() {
		// *****
		// *****
		// *****
		// *****
		// ***** 
		// 위의 모습대로 출력되게 하기.
		// 단, for문과 System.out.print("*")만을 사용.
		
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
		// 위의 모습대로 출력되게 하기.
		// 힌트. i 와 j 를 응용(출력)하는 방법에 대한 문제.
		
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
		// 위의 모습대로 출력되게 하기.
		// 힌트. i 와 j 를 응용(출력)하는 방법에 대한 문제.
		
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
		// 위의 모습대로 출력되게 하기.
		// 힌트. 지금까지 파악한 i 와 j 의 변화에 대해 고민.
		
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
		// 위의 모습대로 출력되게 하기.
		// 힌트. 지금까지 파악한 i 와 j 의 변화에 대해 고민.
		
		for(int i=4; i>=0; i--) {
			
			for(int j=0; j<5; j++) {
				
				System.out.print(i+j+1);
			}
			System.out.println();
		}
	}
	
	// while 횟수가 지정된 것이 아닌 단순 조건(무한루프)이 제시된 반복문
	// for 횟수가 지정된 반복문
	
	public void whileTest() {
		int i = 0;
		while(i<5) {
			System.out.println("hi");
			i++;
		}
		// hi가 5번 출력.
		System.out.println("--------------------");
		while(i<0) {
			System.out.println("hi");
			i++;
		}
		// hi가 0번 출력. 그런데,
		System.out.println("--------------------");
		do {
			System.out.println("hi");
			i++;
		}while(i<0);
		// do while문은 일단 실행문을 무조건 실행시킨뒤 조건을 확인한다. 쓰임이 좋지는 않다.
		System.out.println("--------------------");
	}
	
	public void whileExam1() {
		// 정수를 5번 입력받고, 그 합을 출력하시오.
		
		int count = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(count<5) {
			System.out.print("원하는 정수를 입력하시오("+(5-count)+"번 남음) > ");
			int num = sc.nextInt();
			sum += num;
			count++;
		}
		System.out.println("입력된 정수의 총 합은 "+sum+"입니다.");
		sc.close();
		
	}
	
	public void whileExam2() {
		// 1부터 100까지의 수 중에서 짝수들의 합을 구하시오.
		int i=1;
		int sum=0;
		while(i<=100) {
			if(i%2==0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1부터 100까지 중 짝수의 합은 "+sum+"입니다.");
		
	}
	
	public void whileExam3() {
		// 1부터 입력받은 수까지의 수 중에 짝수들의 합을 구하시오.
		int i=1;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 정수를 입력하시오 > ");
		int num = sc.nextInt();
		while(i<=num) {
			if(i%2==0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1부터 "+num+"까지 중 짝수의 합은 "+sum+"입니다.");
		sc.close();
	}
	
	// 무한루프 : 반복 횟수가 정해져 있지 않고, 무한히 반복되는 루프.
	// 결국 반복문이기 때문에 for문과 while문을 사용한다.
	// while(true) <=> for(;;)
	// 일반적으로 while문이 더 선호됨.
	// 조건을 외부에서 컨트롤 하고 싶을 때 사용한다고 생각하면 됨.
	
	public void whileExam4() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("hi");
			System.out.print("계속 출력하시겠습니까? [ y / n ]");
			char ans = sc.next().charAt(0);
			if(ans == 'n') {
				break;
				// boolean형의 변수를 선언하여 종료할 수도 있지만,
				// 그렇게 되면 남은 문장도 모두 실행하고 종료하게 된다.
				// break문은 그 즉시 멈춘다. (반복명령의 실행 도중 강제적으로 빠져나올 때 사용하는 명령.)
				// break문 하나당, 인접한 반복문 하나만 탈출한다.
				// 유사하지만 명확히 다른 개념으로 continue가 있다. 
				// 반복문의 나머지 부분을 무시하고 반복문의 선두로 이동할 때 사용하는 명령.
				// continue를 만나면, 해당 반복문의 최상단. 즉, 조건문.. 으로 이동하게 된다.
			}
			System.out.println("한번 더 출력한다.");
		}
		sc.close();
		
	}
}
