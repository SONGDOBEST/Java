package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Account> list = new ArrayList<Account>();

		int cnt = 100;
		while (true) {

			System.out.println("==========산와머니==========");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 5.계좌이체 0.종료");
			System.out.println("메뉴를 입력해주세요: ");
			int menu = sc.nextInt();

			if (menu == 1) {
				Account a = new Account();
				System.out.println("이름을 입력해주세요.");
				a.setName(sc.next());
				System.out.println("랜덤한 4자리의 숫자를 입력해주세요");
				a.setNumber(sc.nextInt());
				a.setAccount(cnt + "-" + (int) (Math.random() * 999 + 100) + "-" + a.getNumber());
				a.setBalance(0);

				list.add(a);
				System.out.println(a.getName() + "님 계좌 계설을 환영합니다!");
				cnt++;

			} else if (menu == 2) {
				System.out.println("계좌번호를 입력해주세요: ");
				String userAcc = sc.next();
				System.out.println("이름을 입력해주세요: ");
				String userName = sc.next();

				boolean find = false;
				for (Account a : list) {
					if (userAcc.equals(a.getAccount()) && userName.equals(a.getName())) {
						System.out.println("입금 금액을 입력해주세요: ");
						a.deposit(sc.nextInt());
						System.out.println("입금성공 ! 현재 잔액은 " + a.getBalance() + "원 입니다.");
						find = true;
					}
				}
				if (!find) {
					System.out.println("계좌 정보가 다릅니다!");
				}
			} else if (menu == 3) {

				System.out.println("계좌번호를 입력해주세요: ");
				String userAcc = sc.next();
				System.out.println("이름을 입력해주세요: ");
				String userName = sc.next();
				boolean find2 = false;
				for (Account a : list) {
					if (userAcc.equals(a.getAccount()) && userName.equals(a.getName())) {
						System.out.println("출금 금액을 입력해주세요: ");
						if (a.withdraw(sc.nextInt())) {
							System.out.println("출금 완료! 남은 잔액은 " + a.getBalance());
							find2 = true;
						} else {
							System.out.println("잔액이 부족합니다.");
						}
					}
				}
				if (!find2) {
					System.out.println("일치하는 정보가 없습니다.");
				}

			} else if (menu == 4) {
				System.out.println("이름\t계좌번호\t잔액\t생성날짜");
				System.out.println("...................................................");
				for (Account a : list) {
					a.print();
				}
			} else if (menu == 5) {
				System.out.println("출금 계좌번호를 입력해주세요:");
				String outAcc = sc.next();
				boolean find2 = false;
				for (Account a : list) {
					if (outAcc.equals(a.getAccount())) {
						System.out.println("입금 계좌번호를 입력해주세요: ");
						String inAcc = sc.next();
						find2 = true;
						boolean find3 = false;
						for (Account b : list) {
							if (inAcc.equals(b.getAccount())) {
								System.out.println("송금 금액을 입력해주세요");
								int abc = sc.nextInt();
								find3 = true;
								if (a.withdraw(abc)) {

									System.out.println("송금 완료! 남은 잔액은 " + a.getBalance() + "원 입니다.");
									b.deposit(abc);

								} else {
									System.out.println("잔액이 부족합니다.");
								}
							}
						}
						if (!find3) {
							System.out.println("잘못된 정보입니다.");
						}

					}
				}
				if (!find2) {
					System.out.println("잘못된 정보입니다.");
				}

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}

		}
		System.out.println("프로그램을 종료합니다.");

	}

}
