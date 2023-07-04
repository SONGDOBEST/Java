package day09;

public class Board {
	
	//필드
	private String title;
	private int cnt;
	private boolean open;
	
	//생성자
	public Board(String title, int cnt, boolean open) {
		this.title = title;
		this.cnt = cnt;
		this.open = open;
	}
	
	//method
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public boolean getOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public void cntUp() {
		cnt += 2;
	}
	public int cntUp1(int a) {
		return cnt += a;
	}
	
	public void print() {
		System.out.println(title+"\t"+cnt+"\t"+open);
	}
}
