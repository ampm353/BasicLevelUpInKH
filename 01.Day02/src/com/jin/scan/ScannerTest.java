package com.jin.scan;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 > ");
		String userName = sc.next(); //공백문자를 입력받지 않음
		System.out.print("성별을 입력해주세요 > ");
		char userGender = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("주소를 입력해주세요 > ");
		String userAddr = sc.nextLine(); //공백문자를 입력받음
		System.out.printf("이름 : %s\n성별 : %s\n주소 : %s\n", userName, userGender, userAddr);

		sc.close();
	}

}
