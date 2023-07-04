package ex_01;

public class TypeSample {
	public static void run() { //static을 사용하면 변수지정을 하지 않아도 사용 가능
		//정수 형 :: 정수는 2남 막내
				int num1=80;	//형 하나
				
				//실수 형 :: 실수는 3남 막내
				float num2=80.5f;	//첫째
				double num3=81.6;	//둘째
				
				//문자 형 :: 문자는 3남 막내
				char str = 'a';	//첫째
				String str2 = "abc";//둘째
				
				//불린 형 ::
				boolean ox = true;
				
				
				
				
				System.out.printf("num1= %d, num2= %.2f, num3= %.2f\n",num1,num2,num3);
	}
}
