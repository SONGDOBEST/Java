package day09;

public class FruitMain {

	public static void main(String[] args) {
		
		Fruit apple = new Fruit(); //1번 method (기본 생성자)(괄호 안 조건 X)
		apple.name = "사과";
		apple.color = "빨강";
		apple.isSeed = true;
		
		
		
				
		Fruit banana = new Fruit("바나나","노랑",false); //4번 method
		
		
		apple.print();
		banana.print();
		
		Fruit melon = new Fruit("멜론"); //2번 method
		
		melon.color = "녹색";
		melon.isSeed = true;
		melon.print();
		
		Fruit orange = new Fruit("오렌지","주황색"); //3번 method
		
		orange.isSeed = true;
		orange.print();
		//print method에는 name color isSeed가 다 있기 때문에
		//생성하는 과정에서 없는 변수들은 추가
		
		

	}

}
