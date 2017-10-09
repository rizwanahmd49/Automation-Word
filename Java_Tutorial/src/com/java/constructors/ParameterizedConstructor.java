package com.java.constructors;

public class ParameterizedConstructor {
	
	public ParameterizedConstructor() {
		System.out.println("Thsi is default constructor");
	}
	ParameterizedConstructor(int userID,String pass)
	{
		System.out.println("The user Is and Passwor are below:\nUser ID: "+userID+"\nPassword: "+pass);
		
	}

	public static void main(String[] args) {
	//	ParameterizedConstructor pc=new ParameterizedConstructor();
	// 	ParameterizedConstructor p=new ParameterizedConstructor(101, "Rizwan");
		

	}

}
