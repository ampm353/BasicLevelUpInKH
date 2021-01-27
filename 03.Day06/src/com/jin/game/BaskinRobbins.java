package com.jin.game;

import java.util.Random;
import java.util.Scanner;

public class BaskinRobbins {

	public void baskinRobbins() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean bool = true;
		int score = 0;
		
		while(bool) {
			System.out.println("========== Baskin Robbins Game ==========");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("���� > ");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("<< Game Start >>");
				int count = 0;
				while(true) {
					System.out.println("== Your Turn ==");
					System.out.print("1 ~ 3 ������ �� �߿��� ������ �ּ��� > ");
					int userNum = sc.nextInt();
					if(userNum>3 || userNum<=0) {
						System.out.println("�߸� �Է��ϼ̽��ϴ�. 1 ~ 3 ������ ���� �Է����ּ���.");
						continue;
					}// �� �κ� �ߵǳ� Ȯ��.
					System.out.println(userNum+"��!");
					System.out.println();
					for(int i=0; i<userNum;i++) {
						System.out.println(++count+" !");
						if(count == 31) {
							System.out.println("�й��Ͽ����ϴ�.");
							break;
						}
					}
					if(count==31) {
						break;
					}
					System.out.println("== Computer Turn ==");
					int comNum = r.nextInt(3)+1;
					System.out.println(comNum+"��!");
					System.out.println();
					for(int i=0; i<comNum;i++) {
						System.out.println(++count+" !");
						if(count==31) {
							System.out.println("�¸��Ͽ����ϴ�.");
							score++;
							break;
						}
					}
					if(count==31) {
						break;
					}
				}
				
				break;
			case 2:
				System.out.println("<< Game Score >>");
				System.out.println("Score : "+score);
				System.out.println();
				break;
			case 3:
				System.out.println("<< End Game >>");
				bool = false;
				break;
			}
		}
	}
}
