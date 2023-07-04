package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
	
	private String name;
	private String id;
	private String pw;
	private String joinDate;
	
	//
	
	public User() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년mm월dd일 HH:mm:ss");
		joinDate = dtf.format(LocalDateTime.now());
	}
	public User(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw(){
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void print() {
		System.out.println(name+"\t"+id+"\t"+pw+"\t"+joinDate);
	}
	
}
