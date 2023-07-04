package day09;

public class BoardMain {

	public static void main(String[] args) {
		
		Board b1 = new Board("반지의제왕", 10, true);
		b1.cntUp(); // 10 + 2
		b1.print();
		
		Board b2 = new Board("해리포터", 5, true);
		b2.cntUp1(12); // 5 + 12
		b2.print();
		
	}

}
