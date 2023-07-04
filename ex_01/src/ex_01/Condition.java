package ex_01;

import java.util.Scanner;

public class Condition {
	public static void run() {
		// if문 switch-case

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int grade = sc.nextInt();
		String result;
		if (grade >= 90) {
			if(grade >= 95) {
				result = "A+";
			}else {
				result = "A";
			}
		} else if (grade >= 80) {
			if(grade >= 85) {
				result = "B+";
			}else {
				result = "B";
			}
		} else if (grade >= 70) {
			if(grade >= 75) {
				result = "C+";
			}else {
				result = "C";
			}
		} else if (grade >= 60) {
			if(grade >= 65) {
				result = "D+";
			}else {
				result = "D";
			}
		} else {
			result = "아 조졌네 이거";
		}
		System.out.println("학점은 " + result + "입니다.");
		
		System.out.println("시간 입력: ");
		int time=sc.nextInt();
		switch (time) {
		case 6:
			System.out.println("일어나세요 용사여");
			break;
		case 9:
			System.out.println("늦었어요 이미..");
			break;
		case 12:
			System.out.println("와! 점심!");
			break;
		case 15:
			System.out.println("퇴근까지 세시간 전..");
			break;
		case 18:
			System.out.println("와! 퇴근!");
			break;
		case 21:
			System.out.println("안녕히 주무세요!");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		

	}
}
