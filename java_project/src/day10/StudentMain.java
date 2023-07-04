package day10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Student> list = new ArrayList<Student>();
		
		while(true) {
			System.out.println("=====스튜-단트관리시-스템=====");
			System.out.println("1.학생등록 2.학생리스트 3.학생검색 0.종료");
			System.out.println("메뉴 선택: ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				Student s = new Student();
				
				System.out.println("학번: ");
				s.setNo(sc.next());
				System.out.println("이름: ");
				s.setName(sc.next());
				System.out.println("학과: ");
				s.setDept(sc.next());
				System.out.println("학년: ");
				s.setYear(sc.nextInt());
				
				System.out.println(s.getName()+"학생 등록 완료!");
				list.add(s);
			}else if(menu == 2) {
				System.out.println("학번\t이름\t학과\t학년");
				System.out.println("==============================");
				for(int i=0; i<list.size(); i++) {
					list.get(i).print();
				}
			}else if(menu == 3) {
				
				boolean find = true;
				
				System.out.println("학번 입력: ");
				String newNo = sc.next();
				
				for(int i=0; i<list.size(); i++) {
					if(newNo.equals(list.get(i).getNo())){
						find = false;
						list.get(i).print();
					}
				}
				if(find) {
					System.out.println("잘못된 정보입니다.");
				}
				
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			
		}System.out.println("시-스템 종료");
		
		
		
		
//		Student s = new Student();
//		s.no = "37892";
//		s.name = "이현우";
//		s.dept = "간호학과";
//		s.year = 4;
//		
//		
//		list.add(s);
//		
//		
//		
//		Student s1 = new Student();
//		s1.no = "37913";
//		s1.name = "김범수";
//		s1.dept = "컴공";
//		s1.year = 3;
//		
//		list.add(s1);
//		
//		list.get(1).print();
//		
//		
//		for(int i = 0; i<2; i++) {
//			list.get(i).print();
//		}
//		
//		for(Student student : list) { // for each 문법
//			student.print();
//		}
//		

		
		
		
		
		
		
		
		
		
		

	}

}
