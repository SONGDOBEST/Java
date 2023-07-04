package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account {
	private	String name;
	private	String account;
	private	int balance;
	private String joinDate;
	private int number;
	private boolean withdraw;
	
	//
	
	public Account() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 mm월 dd일 HH:mm:ss");
		joinDate = dtf.format(LocalDateTime.now());
	}
	
	//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void print() {
		System.out.println(name+"\t"+account+"\t"+balance+"\t"+joinDate);
	}
	
	public void deposit(int inmoney) {
		balance += inmoney;
	}
	public boolean withdraw(int outmoney) {
		if(balance>=outmoney) {
			balance -= outmoney;
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
}
