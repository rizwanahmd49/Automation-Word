package com.java.programs;

public class Pattern {
	
	public static void printSquirPattern()
	{System.out.println("|======Pattert======|");
		for(int i=1;i<=4;i++)
		{
			for(int j =1;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void printTranglePattern()
	{System.out.println("|======Pattert======|");
		for(int i=1;i<=4;i++)
		{
			for(int j =1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printTranglePattern();
		printSquirPattern();
}}
