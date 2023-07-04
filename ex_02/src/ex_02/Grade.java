package ex_02;

public class Grade {
	private int kor;
	private int mat;
	private int eng;
	private String dept;
	private String sname;
	private String sno;
	private int sum;
	private double avg;
	
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public int Sum() {
		return kor+mat+eng;
	}
	public void print() {
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
	}
	
	
}
