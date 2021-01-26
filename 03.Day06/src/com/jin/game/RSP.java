package com.jin.game;

import java.util.Random;
import java.util.Scanner;

public class RSP {

	public void rsp(){
		Scanner sc = new Scanner(System.in);
		Random r =  new Random();
		
		System.out.println("========== ���� ���� �� ���� ==========");
		while(true) {
			System.out.print("������ 1��, ������ 2, ���� 3���� �Է����ּ��� > ");
			int user = sc.nextInt();
			if(!(user == 1 || user == 2 || user == 3)) {
				continue;
			}
			int computer = r.nextInt(3)+1;
			System.out.println();
			System.out.println("========== ���� ��� ==========");
			System.out.println("���� : "+intToString(user));
			System.out.println("��ǻ�� : "+intToString(computer));
			if((user+1) == computer || (computer+2) == user) {
				System.out.println("����� �����ϴ�.");
			}else if(user == computer) {
				System.out.println("�����ϴ�.");
			}else {
				System.out.println("�̰���ϴ�.");
				break;
			}
			System.out.println();
		}
	}
	
	public String intToString(int num) {
		String word = "";
		switch(num) {
			case 1:
				word = "����";
				break;
			case 2:
				word = "����";
				break;
			case 3:
				word = "��";
				break;
			default:
				break;
		}
		return word;
	}
}
