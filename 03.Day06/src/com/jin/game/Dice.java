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
			System.out.print("���� > ");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("<< Game Start >>");
				int count = 1;
				while(true) {
					System.out.println("== "+count+"ȸ�� ==");
					int userSum = 0;
					for(int i=0; i<3;i++) {
						userSum += r.nextInt(6)+1;
					}
					System.out.println("����� �ֻ��� 3ȸ �� : "+userSum);
					System.out.print("�����Ͻðڽ��ϱ�? (y/n) ");
					char ans = sc.next().charAt(0);
					while(true) {
						if(ans=='y'||ans=='Y'||ans=='n'||ans=='N') {
							break;
						}else {
							System.out.println("�߸� �Է��ϼ̽��ϴ�. y or n�� �Է����ֽʽÿ�.");
							System.out.print("�����Ͻðڽ��ϱ�? (y/n) ");
							ans = sc.next().charAt(0);
						}
					}
					if(ans=='n'||ans=='N') {
						System.out.println("������ �����մϴ�.");
						System.out.println();
						break;
					}
					bet++;
					System.out.println("���� ������ : " + money +"��");
					System.out.print("���� �ݾ��� �Է��ϼ��� > ");
					int batMoney = sc.nextInt();
					while(true) {
						if(batMoney<=money) {
							break;
						}else {
							System.out.println("���� �������� �ʰ��մϴ�. �ٽ� �Է����ּ���.");
							System.out.print("���� �ݾ��� �Է��ϼ��� > ");
							batMoney = sc.nextInt();
						}
					}
					System.out.println("==========================");
					int comSum = 0;
					for(int i=0; i<3; i++) {
						comSum += r.nextInt(6)+1;
					}
					System.out.println("��ǻ�� �ֻ��� 3ȸ �� : "+comSum);
					System.out.println();
					System.out.println("<< ���� ��� >>");
					if(comSum == userSum) {
						System.out.println("�����ϴ�. ������ ������ �����ϴ�.");
						draw++;
						System.out.println();
					}else if(comSum>userSum) {
						System.out.println("��ǻ�Ͱ� �̰���ϴ�. ����� ���ñ��� �Ҿ����ϴ�.");
						money -= batMoney;
						lose++;
					}else {
						System.out.println("����� �̰���ϴ�. �����ݿ� ���ñ��� �߰��˴ϴ�.");
						money += batMoney;
						win++;
					}
					if(money==0) {
						System.out.println("�������� �����ϴ�. ������ �����մϴ�.");
						System.out.println();
						break;
					}
					System.out.println();
					count ++;
				}
				
				
				break;
			case 2:
				System.out.println("<< Game Score >>");
				System.out.println("���� Ƚ�� : "+bet+"ȸ");
				System.out.println("WIN : "+win);
				System.out.println("LOSE : "+lose);
				System.out.println("DRAW : "+draw);
				System.out.println("�ܾ� : "+money+"��");
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
