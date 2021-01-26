package com.jin.game;

import java.util.Random;
import java.util.Scanner;

public class CoinGame {

	public void coinGame() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("동전 앞면 / 뒷면 맞추기 게임을 시작합니다.");
		int count = 0;
		int good = 0;
		while(true) {
			System.out.print("앞면이 나올 것 같으면 1을, 뒷면이 나올 것 같으면 2를 입력하세요 > ");
			int choice = sc.nextInt();
			if(choice != 1 && choice != 2) {
				System.out.println("올바른 값을 입력하세요. 앞면 : 1, 뒷면 : 2");
				System.out.println();
				continue;
			}
			String coin = "";
			
			int num = r.nextInt(2)+1;
			if(num == 1) {
				coin = "앞면";
			}else {
				coin = "뒷면";
			}
			
			if(choice==num) {
				System.out.println("동전은 "+coin+"이 나왔으며, 당신은 정답을 맞췄습니다.");
				good++;
			}else {
				System.out.println("동전은 "+coin+"이 나왔으며, 당신을 틀렸습니다.");
			}
			System.out.println();
			count ++;
			System.out.print("게임을 계속하고 싶다면 y를 입력하시고, 그만하시려면 아무키나 누르십시오 > ");
			char ans = sc.next().charAt(0);
			
			System.out.println();
			if(ans != 'y') {
				break;
			}
		}
		System.out.println("총 게임 횟수는 "+count+"번 이며, 그 중 맞춘 횟수는 "+good+"번 입니다.");
	}
}
