package day10;

public class Fruit {
	String name;
	String color;
	boolean isSeed;
	
	public Fruit() {
		
	}
	public Fruit(String name) {
		this.name = name;
	}
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public Fruit(String name, String color, boolean isSeed) {
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
	}
	
	public void print() {
		System.out.println(name+"\t"+color+"\t"+isSeed);
	}
}
