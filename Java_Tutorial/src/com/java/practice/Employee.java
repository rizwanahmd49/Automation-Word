package com.java.practice;

 class PartTimeEmployee extends Employee{
	 public static void PrintFullName() {
		 System.out.println(firstName+" "+lastName+" "+"Part_Time");
	 }
	 
}
class FullTimeEmployee extends Employee{
	
	public static void PrintFullName() {
		 System.out.println(firstName+" "+lastName+" "+"Full_Time");
	 }
}

public class Employee {
	
	 static String firstName;
	 static String lastName;
	 public static void PrintFullName() {
		 System.out.println(firstName+" "+lastName);
	 }
	 
	 
	 
	

	public static void main(String[] args) {
		
		
		Employee.firstName="Rizwan";
		Employee.lastName="Ahmad";
		Employee.PrintFullName();
		
		
	}

}

 