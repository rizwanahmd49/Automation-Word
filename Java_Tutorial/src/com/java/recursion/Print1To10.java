package com.java.recursion;

import java.util.Scanner;

public class Print1To10 {

	public static void printUsingCecursion(int n) {
		if (n <= 10) {
			System.out.println(n);
			printUsingCecursion(n + 1);

		}
	}

	public static void swipe() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first No X:");
		int x = scan.nextInt();
		System.out.println("Enter the Second No Y: ");
		int y = scan.nextInt();

		System.out.println("Initial value of x: " + x + " and Y: " + y);

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("\nAfter swapping value of x: " + x + " and y : " + y);
		
		
	}
	
	static Scanner s;
	public static void factorial() {
	
		Scanner scan=new Scanner(System.in);
		int i=1,fact=1,x=scan.nextInt();
		
		while (i<=x) {
			fact=fact*i;
			i++;
		}
		System.out.printf("The factorial of given Num is: %fact",fact);
		 
	}
	public static void main(String[] args) {
		factorial();
		//swipe();
		// printUsingCecursion(5);
		// print(11);
		// revers();
		// reverstheString();
	}

	public static void revers() {
		String str = "rizwanahmad";
		str = new StringBuffer(str).reverse().toString();
		System.out.print(str);

	}

	static void reverstheString() {
		String name = "damhanawzir";
		int size = name.length() - 1;
		int i = 0;
		while (size > i) {
			char c = name.charAt(size);
			System.out.print(c);
			size = size - 1;
		}
	}

	public static void print(int n) {
		System.out.println(n / 2 + 1);
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n || i == n / 2 + 1 && j == n / 2 + 1) {
					System.out.print(" *");

				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

}
