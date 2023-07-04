package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Long id = 100l;
		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<Member>();

		while (true) {
			System.out.println("1.멤버등록 2.멤버리스트 3.멤버검색 0.종료");
			System.out.println("메뉴 선택: ");
			int menu = sc.nextInt();

			if (menu == 1) {

				System.out.println("email 입력");
				System.out.println("pw 입력");
				System.out.println("이름 입력");

				Member m = new Member(id++, sc.next(), sc.next(), sc.next());
				list.add(m);

			} else if (menu == 2) {
				System.out.println("\n번호\t이메일\t비밀번호\t이름\t가입날짜");
				System.out.println("............................................................");
//				for(int i = 0; i<list.size(); i++) {
//					list.get(i).print();
//				}
				for (Member m : list) { // 향상된 for문 or for each문:: (담아야 할 객체):여러가지 값을 가진 집합(배열, arraylist 등등)
					m.print();
				}
				System.out.println();
			} else if (menu == 3) {
				System.out.println("이메일을 입력하세요");
				String userEmail = sc.next();
				System.out.println("이름을 입력하세요");
				String userName = sc.next();

				boolean find = false;
				for (Member m : list) {
					if (userEmail.equals(m.getEmail()) && userName.equals(m.getName())) {
						System.out.println("\n번호\t이메일\t비밀번호\t이름\t가입날짜");
						System.out.println("............................................................");
						m.print();
						find = true;
					}
				}
				System.out.println();
				if (!find) {
					System.out.println("입력하신 정보가 일치하지 않습니다.");
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
