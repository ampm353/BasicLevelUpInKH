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
			System.out.print("선택 > ");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("<< Game Start >>");
				int count = 0;
				while(true) {
					System.out.println("== Your Turn ==");
					System.out.print("1 ~ 3 까지의 수 중에서 선택해 주세요 > ");
					int userNum = sc.nextInt();
					if(userNum>3 || userNum<=0) {
						System.out.println("잘못 입력하셨습니다. 1 ~ 3 사이의 수로 입력해주세요.");
						continue;
					}// 이 부분 잘되나 확인.
					System.out.println(userNum+"번!");
					System.out.println();
					for(int i=0; i<userNum;i++) {
						System.out.println(++count+" !");
						if(count == 31) {
							System.out.println("패배하였습니다.");
							break;
						}
					}
					if(count==31) {
						break;
					}
					System.out.println("== Computer Turn ==");
					int comNum = r.nextInt(3)+1;
					System.out.println(comNum+"번!");
					System.out.println();
					for(int i=0; i<comNum;i++) {
						System.out.println(++count+" !");
						if(count==31) {
							System.out.println("승리하였습니다.");
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
