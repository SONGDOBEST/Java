package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Member {
	private Long id;
	private String email;
	private String pw;
	private String name;
	private String joinDate;
	
	//
	
	public Member() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년mm월dd일 HH:mm:ss");
		joinDate = dtf.format(LocalDateTime.now());
	}
	public Member(Long id, String email, String pw, String name) {
		this();     //이 생성자 안에는 datetimeformatter가 없기 때문에, 기본 생성자에 설정한 dtf를 가져와야 한다.
		this.id = id;
		this.email = email;
		this.pw = pw;
		this.name = name;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void print() {
		System.out.println(id+"\t"+email+"\t"+pw+"\t"+name+"\t"+joinDate);
	}
	
	
	
}
