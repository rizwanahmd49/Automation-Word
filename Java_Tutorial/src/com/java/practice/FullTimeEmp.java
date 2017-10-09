package com.java.practice;

abstract public class FullTimeEmp extends BaseEmployee {
	public int AnualSalary;

	public int getAnualSalary() {
		return AnualSalary;
	}

	public void setAnualSalary(int anualSalary) {
		AnualSalary = anualSalary;
	}

	
	abstract void MonthlySalary() ;

	}


