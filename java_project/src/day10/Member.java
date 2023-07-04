package day10;

public class Member {
	String email;
	String password;
	String name;
	String joinDate;
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getJoinDate() {
		return joinDate;
	}
	
	public void print() {
		System.out.println(email+"\t"+password+"\t"+name+"\t"+joinDate);
	}
	
	
}
