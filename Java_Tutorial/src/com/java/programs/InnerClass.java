package com.java.programs;

public class InnerClass {

	static int i;
	static class A
	{
		int j;
	}
	public static void main(String[] args) {
//		InnerClass inn=new InnerClass();
//		inn.i=10;
//		InnerClass.A a= inn. new A();
//		a.j=20;
//		int sum=a.j+inn.i;
//		System.out.println("Sum is: "+sum);
		
		//Static Inner Class no need to create instance of outter class
		
		InnerClass.i=40;
		InnerClass.A a=new InnerClass.A();
		a.j=50;
		int sum=InnerClass.i+a.j;
		System.out.println("Sum is: "+sum);
		
		
	}

}
