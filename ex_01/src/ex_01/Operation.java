package ex_01;

public class Operation {
	public static void run() {
		//산술 연산자
		int kor = 59;
		int eng = 59;
		int mat = 100;
		int sum = kor+eng+mat;
		int cnt = 0;
		double avg = (double)sum/3; //정수 뒤에 . 붙이면 실수화. ex) 3(int) 3.(실수)
		
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+mat);
		System.out.println("총점: "+sum);
		System.out.printf("평균: %.2f\n",avg);
		
		//관계연산자 (>, >=, <, <=, ==, !=)
		
		//삼항연산자 (if를 쓰지 않고도 true인지 false인지 출력이 가능하다

		String pass =(avg >= 70) && (kor>=60) && (eng>=60) && (mat>=60)
				? "합격" : "불합격";
		
		System.out.println("결과: "+pass);
		
		if(kor<60) {
			cnt++;
		}if(eng<60) {
			cnt++;
		}if(mat<60) {
			cnt++;
		}
		if(cnt != 0) {
		System.out.println("과락 개수: "+cnt+"개 입니다.");
		}
		//논리연산자(&& || !)
		//증감연산자(++, --)
		
	}
}
