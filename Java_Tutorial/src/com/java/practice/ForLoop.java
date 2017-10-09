package com.java.practice;

public class ForLoop {

	static void BasicForLoop() {
		for (int i = 1; i <= 20; i++) {
			System.out.println( "*");
		}

	}

	public static void ArrayForLoop() {

		int[] index = { 20, 30, 40, 50, 60, 70 };
		for (int i = 0; i <= 5; i++) {// Second For loop

			System.out.println(index[i]);
		}
	}
	
	public static void Pattern() {
		int i,j;
		
		for (i=0;i<5;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		}
			
		
		
		
	

	public static void main(String[] args) {
		Pattern();
		
		

	}

}

class AddvanceForLoop {

	static void ArrayLoop() {
		int[] myintArray = { 10, 20, 30, 40, 50, 60, };
		for (int element : myintArray) {
			System.out.print(element + " ");
		}
	}

}
