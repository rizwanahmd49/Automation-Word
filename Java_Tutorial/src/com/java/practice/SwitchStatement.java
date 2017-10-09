package com.java.practice;

import java.util.Scanner;

public class SwitchStatement {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int i;
		Scanner scan=new Scanner(System.in);
		System.out.print("Please Enter Value: ");
		i=scan.nextInt();
		
		switch (i) {
		
		case 1: System.out.println("you have entered "+i);
		break;
		case 2: System.out.println("you have entered "+i);
		break;
		case 3: System.out.println("you have entered "+i);
		break;
		case 4: System.out.println("you have entered "+i);
		default: System.out.println("Enter value is not valid");
		break;
		
		}

	}

}
