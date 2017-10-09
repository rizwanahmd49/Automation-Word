package com.java.practice;

public class PartTimeEmp extends BaseEmployee {
	private int hourlypay;
	 private int totalHour;
	
	public int getHourlypay() {
		return hourlypay;
	}
	public void setHourlypay(int hourlypay) {
		this.hourlypay = hourlypay;
	}
	public int getTotalHour() {
		return totalHour;
	}
	public void setTotalHour(int totalHour) {
		this.totalHour = totalHour;
	}
	void MonthlySalary() {
		System.out.println("Monthly salary for Part Time: "+hourlypay*totalHour);
	}
}
