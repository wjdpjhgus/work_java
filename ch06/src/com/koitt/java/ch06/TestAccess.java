package com.koitt.java.ch06;

import inheritance.access.Account;

public class TestAccess extends Account {
	
	private String text;

	public TestAccess (String name, int number) {
		super(name, number);
		Date a = this.open;
	}
	
	public static void main(String[] args) {
		Account account = new Account();
		String name = account.name;
		
		TestAccess t = new TestAccess("홍길동", 1000);
		String a = t.text;
		 Data b = t.open;
		 
		 int c = t.number;
		 

	
	
	}
}
