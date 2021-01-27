package com.jin.game;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public void upAndDown() {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int score = 0;
		boolean bool = true;
		
		while(bool) {
			System.out.println("========== Up & Down Game ==========");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("<< Game Start >>");
				int ans = r.nextInt(100)+1;
				int i = 1;
				while(true) {
					System.out.println("<< "+ i + "회차 >>");
					System.out.print("Input Number : ");
					int num = sc.nextInt();
					
					if(num == ans) {
						score++;
						System.out.println("<< 정답 >>");
						System.out.println();
						break;
					}else if(num > ans) {
						System.out.println("결과 >> DOWN");
						System.out.println();
						i++;
					}else {
						System.out.println("결과 >> UP");
						System.out.println();
						i++;
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
				System.out.println();
				bool = false;
				break;
				
			}
		}
	}
}
