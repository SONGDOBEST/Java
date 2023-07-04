package ex_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address1 {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		
		int cnt = 0;
		while (true) {
			System.out.println("....................................");
			System.out.println("1. 정보 입력 2. 정보 열람 3. 정보 검색 4. 주소 변경 5. 정보 삭제 0. 종료");
			System.out.println("메뉴 입력: ");
			String menu = sc.nextLine();
			
			if(menu.equals("0")) {
				break;
			}else if(menu.equals("1")) {
				Student s1 = new Student();
				
				System.out.println("이름 입력: ");
				s1.setSname(sc.nextLine());
				System.out.println("주소 입력: ");
				s1.setAddress(sc.nextLine());
				System.out.println("학과 입력: ");
				s1.setDept(sc.nextLine());
				s1.setSno("2023"+(cnt+1));
				
				cnt++;
				
				
				list.add(s1);
			}else if(menu.equals("2")) {
				for(Student s1 : list) {
					System.out.println(s1.toString());
					
				}
				
			}else if(menu.equals("3")) {
				System.out.println("이름 검색: ");
				String search = sc.nextLine();
				boolean find = false;
				for(Student s1 : list) {
					if(search.equals(s1.getSname())) {
						System.out.println(s1.toString());
						find = true;
					}
				}if(!find) {
					System.out.println("잘못된 정보입니다.");
				}
			}else if(menu.equals("4")){
				System.out.println("이름 입력: ");
				String search = sc.nextLine();
				boolean find = false;
				for(Student s1 : list) {
					if(search.equals(s1.getSname())) {
						System.out.println("변경된 주소 입력: ");
						String newAddress = sc.nextLine();
						s1.setAddress(newAddress);
						find = true;
					}
				}if(!find) {
					System.out.println("잘못된 정보입니다.");
				}
				
				
			}else if(menu.equals("5")) {
				System.out.println("삭제할 이름 입력: ");
				String delName = sc.nextLine();
				boolean find = false;
				for(Student s1 : list) {
					if(delName.equals(s1.getSname())) {
						list.remove(s1);
						find = true;
						System.out.println("삭제 완료되었습니다.");
						break;
					}
				}if(!find) {
					System.out.println("삭제하려는 정보가 없습니다.");
				}
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}System.out.println("프로그램이 종료됩니다.");
	}
}
