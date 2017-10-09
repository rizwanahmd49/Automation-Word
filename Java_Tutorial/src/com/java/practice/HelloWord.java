package com.java.practice;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWord {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(
				"===============Welcome to Short Calculator=============== \n\nPlease Enter First Number: " + " ");
int FirstNum=scan.nextInt();
System.out.print("Plese Enter Second Num to addition: ");
int SecondNum=scan.nextInt();
int sum=FirstNum+SecondNum;
System.out.print("Addition is :");System.err.print(sum);

	}

}
