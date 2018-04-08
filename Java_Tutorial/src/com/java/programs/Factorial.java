package com.java.programs;

public class Factorial {

	public static void main(String[] args) {
		int x=5;
		int fact=1;
		for(int i=1;i<=x;i++) {
			fact=fact*i;
		}
		System.out.printf("Factorial of %d is "+fact,x);

	}

}
