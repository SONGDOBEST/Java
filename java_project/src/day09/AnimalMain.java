package day09;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal dog = new Animal();
		Animal cat = new Animal();
		Animal chicken = new Animal();
		Animal snake = new Animal();
		
		
		dog.setName("망치");
		dog.setSound("그르릉컹컹");
		dog.setLeg(4);
		
		
		cat.setName("나비");
		cat.setSound("미야아아옹");
		cat.setLeg(4);
		
		chicken.setName("양념이");
		chicken.setSound("꼬끼옥");
		chicken.setLeg(2);
		
		snake.setName("슉슉이");
		snake.setSound("슉슉");
		snake.setLeg(0);
		
		
		dog.print();
		cat.print();
		chicken.print();
		snake.print();
		chicken.print1();
		snake.print1();
		
		
		
	}

}
