package com.java.practice;

import java.util.Scanner;

public class Encapsulation {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Personal p = new Personal();
		p.setBal(scan.nextInt());
		System.out.println(p.getBal());
		scan.nextLine();
	}

}
