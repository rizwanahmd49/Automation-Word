package com.java.cloneable;

public class Student18 implements Cloneable {
	
	int rollno;
	String name;
	
	Student18(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}

	public static void main(String[] args) {
		
		try {
			Student18 s1=new Student18(102, "Rizwan");
			Student18 s2=(Student18)s1.clone();
			
			System.out.println("Roll No: "+s1.rollno+"\nName: "+s1.name);
			System.out.println("Roll No: "+s2.rollno+"\nName: "+s2.name);
			
		}catch(CloneNotSupportedException c){}

	}

}
