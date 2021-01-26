package com.jin.game;

import java.util.Random;
import java.util.Scanner;

public class RSP {

	public void rsp(){
		Scanner sc = new Scanner(System.in);
		Random r =  new Random();
		
		System.out.println("========== 가위 바위 보 게임 ==========");
		while(true) {
			System.out.print("가위는 1로, 바위는 2, 보는 3으로 입력해주세요 > ");
			int user = sc.nextInt();
			if(!(user == 1 || user == 2 || user == 3)) {
				continue;
			}
			int computer = r.nextInt(3)+1;
			System.out.println();
			System.out.println("========== 게임 결과 ==========");
			System.out.println("유저 : "+intToString(user));
			System.out.println("컴퓨터 : "+intToString(computer));
			if((user+1) == computer || (computer+2) == user) {
				System.out.println("당신이 졌습니다.");
			}else if(user == computer) {
				System.out.println("비겼습니다.");
			}else {
				System.out.println("이겼습니다.");
				break;
			}
			System.out.println();
		}
	}
	
	public String intToString(int num) {
		String word = "";
		switch(num) {
			case 1:
				word = "가위";
				break;
			case 2:
				word = "바위";
				break;
			case 3:
				word = "보";
				break;
			default:
				break;
		}
		return word;
	}
}
