package day09;

public class People {
	//필드
	
	private String name;
	private int age;
	
	// 생성자
	
	public People() {
		
	}
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// method
	
	//set get :: private 혹은 다른 사유로 필드가 막혀있을 때, 값을 불러오거나 저장하기 위함
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	
	
	public void print() {
		System.out.println(name+"\t"+age);
	}
	public void print1() {
		System.out.println("이름\t나이");
		System.out.println("=============");
	}
	
	
	
	public void ageUp() {
		age++;
	}
	public void ageUp1(int age) {
		this.age += age;
	}
	public int koreanAge() {
		return age-2;
	}
	
}
