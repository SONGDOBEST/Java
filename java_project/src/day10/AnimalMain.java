package day10;

public class AnimalMain {

	public static void main(String[] args) {
		Animal dog = new Animal();
		
		dog.setKind("개");
		dog.setName("덕구");
		dog.setSound("으르렁캉캉");
		dog.setLeg(4);
		
		Animal chicken = new Animal();
		
		chicken.setKind("닭");
		chicken.setName("춘식");
		chicken.setSound("꼬끼오옥");
		chicken.setLeg(2);
		
		Animal dragon = new Animal();
		
		dragon.setKind("용");
		dragon.setName("용팔");
		dragon.setSound("구오오오");
		dragon.setLeg(0);
		
		
		System.out.println("종류\t이름\t울음소리\t다리갯수");
		System.out.println("==============================");
		dog.print();
		chicken.print();
		dragon.print();
	}

}
