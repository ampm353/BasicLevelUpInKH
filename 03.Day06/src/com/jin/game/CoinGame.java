package com.jin.game;

import java.util.Random;
import java.util.Scanner;

public class CoinGame {

	public void coinGame() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ո� / �޸� ���߱� ������ �����մϴ�.");
		int count = 0;
		int good = 0;
		while(true) {
			System.out.print("�ո��� ���� �� ������ 1��, �޸��� ���� �� ������ 2�� �Է��ϼ��� > ");
			int choice = sc.nextInt();
			if(choice != 1 && choice != 2) {
				System.out.println("�ùٸ� ���� �Է��ϼ���. �ո� : 1, �޸� : 2");
				System.out.println();
				continue;
			}
			String coin = "";
			
			int num = r.nextInt(2)+1;
			if(num == 1) {
				coin = "�ո�";
			}else {
				coin = "�޸�";
			}
			
			if(choice==num) {
				System.out.println("������ "+coin+"�� ��������, ����� ������ ������ϴ�.");
				good++;
			}else {
				System.out.println("������ "+coin+"�� ��������, ����� Ʋ�Ƚ��ϴ�.");
			}
			System.out.println();
			count ++;
			System.out.print("������ ����ϰ� �ʹٸ� y�� �Է��Ͻð�, �׸��Ͻ÷��� �ƹ�Ű�� �����ʽÿ� > ");
			char ans = sc.next().charAt(0);
			
			System.out.println();
			if(ans != 'y') {
				break;
			}
		}
		System.out.println("�� ���� Ƚ���� "+count+"�� �̸�, �� �� ���� Ƚ���� "+good+"�� �Դϴ�.");
	}
}
