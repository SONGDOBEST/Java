package day10;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator n1 = new Calculator();
		
		n1.num1 = 10;
		n1.num2 = 8;
		
		n1.sum();
		n1.sub(20, 10);
		
		System.out.println(n1.mul());
		System.out.println(n1.div(20, 4));
		
		
	}

}
