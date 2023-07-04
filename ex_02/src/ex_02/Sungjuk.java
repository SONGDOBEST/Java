package ex_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sungjuk {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		List<VOscore> list = new ArrayList<VOscore>();
		int cnt = 0;

		while (true) {
			System.out.println("............성적관리................");
			System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |0.종료");
			System.out.println("메뉴 입력");
			String menu = sc.nextLine();

			if (menu.equals("1")) {
				VOscore s1 = new VOscore();
				System.out.println(".................성적입력...............");
				System.out.println("이름 입력: ");
				s1.setSname(sc.nextLine());
				System.out.println("학과 입력: ");
				s1.setDept(sc.nextLine());
				System.out.println("국어 점수: ");
				s1.setKor(sc.nextInt());
				System.out.println("영어 점수: ");
				s1.setEng(sc.nextInt());
				System.out.println("수학 점수: ");
				s1.setMat(sc.nextInt());
				sc.nextLine();
				
				s1.setSno("2023" + (cnt + 1));
				s1.getSum();
				s1.getAvg();
				
				if (s1.getAvg() >= 90) {
					if (s1.getAvg() >= 95) {
						s1.setGrade("A+");
					} else {
						s1.setGrade("A");
					}
				} else if (s1.getAvg() >= 80) {
					if (s1.getAvg() >= 85) {
						s1.setGrade("B+");
					} else {
						s1.setGrade("B");
					}
				} else if (s1.getAvg() >= 70) {
					if (s1.getAvg() >= 75) {
						s1.setGrade("C+");
					} else {
						s1.setGrade("C");
					}
				} else if (s1.getAvg() >= 60) {
					if (s1.getAvg() >= 65) {
						s1.setGrade("D+");
					} else {
						s1.setGrade("D");
					}
				} else {
					s1.setGrade("F");
				}
				
				
				list.add(s1);

			} else if (menu.equals("2")) {
				System.out.println("...............성적조회...............");
				System.out.println("이름을 입력하세요: ");
				String search = sc.nextLine();
				boolean find = false;
				for (VOscore a : list) {
					if (search.equals(a.getSname())) {
						System.out.println("학번\t이름\t학과\t국어\t영어\t수학\t총점\t평균\t학점");
						System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
						a.print();
						find = true;
					}
				}
				if (!find) {
					System.out.println("일치하는 이름이 없습니다!");
				}
			} else if (menu.equals("3")) {
				System.out.println("..............성적목록...............");
				System.out.println("학번\t이름\t학과\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				for (VOscore a : list) {
					a.print();
				}
			} else if (menu.equals("4")) {
				System.out.println(".................점수수정..............");
				System.out.println("이름을 입력하세요: ");
				String search = sc.nextLine();
				boolean find = false;
				for (VOscore a : list) {
					if (search.equals(a.getSname())) {
						System.out.println("수정 할 과목을 선택하세요.");
						System.out.println("1.국어 2.영어 3.수학");
						int choose = sc.nextInt();
						sc.nextLine();
						find = true;

						if (choose == 1) {
							System.out.println("국어 선택!");
							System.out.println("점수를 입력하세요: ");
							a.setKor(sc.nextInt());
							a.getSum();
							a.getAvg();
							a.setGrade(a.getGrade());
							sc.nextLine();
						} else if (choose == 2) {
							System.out.println("영어 선택!");
							System.out.println("점수를 입력하세요: ");
							a.setEng(sc.nextInt());
							a.getSum();
							a.getAvg();
							a.setGrade(a.getGrade());
							sc.nextLine();
						} else if (choose == 3) {
							System.out.println("수학 선택!");
							System.out.println("점수를 입력하세요: ");
							a.setMat(sc.nextInt());
							a.getSum();
							a.getAvg();
							a.setGrade(a.getGrade());
							sc.nextLine();
						} else {
							System.out.println("잘못된 입력입니다!");
						}
					}
				}
				if (!find) {
					System.out.println("일치하는 이름이 없습니다!");
				}
			} else if (menu.equals("5")) {
				System.out.println(".................정보삭제..............");
				System.out.println("이름을 입력하세요: ");
				String search = sc.nextLine();
				boolean find = false;
				for (VOscore a : list) {
					if (search.equals(a.getSname())) {
						list.remove(a);
						find = true;
					}
				}if(!find) {
					System.out.println("일치하는 이름이 없습니다.");
				}
			} else if (menu.equals("0")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}

		}System.out.println("프로그램 종료!");

	}
}
