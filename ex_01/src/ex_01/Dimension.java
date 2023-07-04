package ex_01;

import java.util.Scanner;

public class Dimension {
	public static void run() {
		String[] name = new String[22];
		String[] address = new String[22];

		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("....................................");
			System.out.println("1. 정보 입력 2. 정보 열람 0. 종료");
			System.out.println("메뉴 입력: ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("이름 입력: ");
				name[cnt] = sc.next();
				System.out.println("주소 입력: ");
				address[cnt] = sc.nextLine();
				cnt++;
			} else if (menu == 2) {
				System.out.println("이름\t주소");
				System.out.println("=====================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\n", name[i], address[i]);
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}System.out.println("프로그램 종료");

	}
}
