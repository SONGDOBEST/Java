package day10;

public class Student {
	String no;  // 학번
	String name;  // 이름
	String dept;  // 학과
	int year;  // 학년
	
	
	public Student() {
		
	}
	public Student(String no, String name, String dept, int year) {
		
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	public void print() {
		System.out.println(no+"\t"+name+"\t"+dept+"\t"+year);
	}
	 
}
