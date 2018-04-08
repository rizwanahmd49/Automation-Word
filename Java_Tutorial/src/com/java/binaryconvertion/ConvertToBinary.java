package com.java.binaryconvertion;

import java.util.Scanner;

public class ConvertToBinary {

	public static void main(String arg[]) {
		int i = 135;
		int sum, num = i % 2;
		sum = i / 2;
		System.out.println("% is: " + num + "\n/ is: " + sum + "\n************************");
		// ConvertToBinary con = new ConvertToBinary();
		// con.binary();

		ConvertToBinary.binary1();
	}

	/**
	 * binary = revers of remainder
	 */
	public static void binary1() {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int bin[] = new int[100];
		int i = 0;

		while (num > 0) {
			bin[i++] = num % 2;
			num /= 2;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public void binary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int n = sc.nextInt();
		int bin[] = new int[100];
		int i = 0;
		while (n > 0) {
			bin[i++] = n % 2;// reminder
			n = n / 2;
			System.out.println("I: " + i + " N: " + n);
		}
		System.out.print("Binary number is : ");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(bin[j]);
		}
	}

}
