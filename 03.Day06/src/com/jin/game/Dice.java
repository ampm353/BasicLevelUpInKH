package com.jin.game;

import java.util.Random;
import java.util.Scanner;

public class Dice {

	public void dice() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		boolean bool = true;
		int win = 0;
		int lose = 0;
		int draw = 0;
		int money = 10000;
		int bet = 0;
		
		while(bool) {
			
			System.out.println("========== Dice Game ==========");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("<< Game Start >>");
				int count = 1;
				while(true) {
					System.out.println("== "+count+"회차 ==");
					int userSum = 0;
					for(int i=0; i<3;i++) {
						userSum += r.nextInt(6)+1;
					}
					System.out.println("당신의 주사위 3회 합 : "+userSum);
					System.out.print("배팅하시겠습니까? (y/n) ");
					char ans = sc.next().charAt(0);
					while(true) {
						if(ans=='y'||ans=='Y'||ans=='n'||ans=='N') {
							break;
						}else {
							System.out.println("잘못 입력하셨습니다. y or n로 입력해주십시오.");
							System.out.print("배팅하시겠습니까? (y/n) ");
							ans = sc.next().charAt(0);
						}
					}
					if(ans=='n'||ans=='N') {
						System.out.println("배팅을 종료합니다.");
						System.out.println();
						break;
					}
					bet++;
					System.out.println("현재 소지금 : " + money +"원");
					System.out.print("배팅 금액을 입력하세요 > ");
					int batMoney = sc.nextInt();
					while(true) {
						if(batMoney<=money) {
							break;
						}else {
							System.out.println("현재 소지금을 초과합니다. 다시 입력해주세요.");
							System.out.print("배팅 금액을 입력하세요 > ");
							batMoney = sc.nextInt();
						}
					}
					System.out.println("==========================");
					int comSum = 0;
					for(int i=0; i<3; i++) {
						comSum += r.nextInt(6)+1;
					}
					System.out.println("컴퓨터 주사위 3회 합 : "+comSum);
					System.out.println();
					System.out.println("<< 게임 결과 >>");
					if(comSum == userSum) {
						System.out.println("비겼습니다. 소지금 변동이 없습니다.");
						draw++;
						System.out.println();
					}else if(comSum>userSum) {
						System.out.println("컴퓨터가 이겼습니다. 당신은 배팅금을 잃었습니다.");
						money -= batMoney;
						lose++;
					}else {
						System.out.println("당신이 이겼습니다. 소지금에 배팅금이 추가됩니다.");
						money += batMoney;
						win++;
					}
					if(money==0) {
						System.out.println("소지금이 없습니다. 게임을 종료합니다.");
						System.out.println();
						break;
					}
					System.out.println();
					count ++;
				}
				
				
				break;
			case 2:
				System.out.println("<< Game Score >>");
				System.out.println("배팅 횟수 : "+bet+"회");
				System.out.println("WIN : "+win);
				System.out.println("LOSE : "+lose);
				System.out.println("DRAW : "+draw);
				System.out.println("잔액 : "+money+"원");
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
