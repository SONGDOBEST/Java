package day10;

public class Animal {
	private String kind;
	private String name;
	private String sound;
	private int leg;
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getSound() {
		return sound;
	}
	
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getLeg() {
		return leg;
	}
	
	public void print() {
		System.out.println(kind+"\t"+name+"\t"+sound+"\t"+leg+"개");
	}
	
}
