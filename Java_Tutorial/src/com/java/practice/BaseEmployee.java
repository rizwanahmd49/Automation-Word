package com.java.practice;

public abstract class BaseEmployee {

	private int ID;
	private String FirstName;
	private String LastName;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	abstract  void MonthlySalary();

	void FullName() {
		System.out.println(FirstName + " " + LastName);
	}

}
