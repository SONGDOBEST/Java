package day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		String[] a = new String[10];
		a[0] = "hello world!";
		
//		System.out.println(a[0]);
		
		a[1] = "안녕!";
		a[2] = "잘가!";
		
		//ArrayList
		List<String> b = new ArrayList<String>(); //꺽쇠 안 변수 타입은 안쓰면 앞서 정의해준 타입대로 따라감.
		b.add("살려는 드릴게"); //값 추가
		b.add("죽기 딱 좋은 날씨");
		b.add("드루와, 드루와");
		
		for(int i = 0; i<=2; i++) {
			System.out.println(a[i]);
		}
		for(int i = 0; i<b.size(); i++) {
			System.out.println(b.get(i));
		}
		
	}

}
