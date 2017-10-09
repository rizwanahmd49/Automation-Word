package com.java.practice;

public class Personal {
	private  int bal;

	public int getBal() {
		return bal;
	}

	public void setBal(int balance) {
		if (balance<18||balance>80) {
			throw new RuntimeException("Value is not valid...");
		
		}
		else {this.bal=balance;}
			
	}
	
	
}
