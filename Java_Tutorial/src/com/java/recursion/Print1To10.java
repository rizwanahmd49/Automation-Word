package com.java.recursion;



public class Print1To10 {
	public static void main(String[] args)  {
		//print1to10(1);
		print(11);
	}
	
	public static void print1to10(int num)  {
		if(num<11) {
			System.out.println(num);
			print1to10(num+1);
		}
	}
	
	public static void print(int n) {
		System.out.println(n/2+1);
		for (int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n||i==n/2+1&&j==n/2+1) {
		 		System.out.print(" *");
				
				}else {
					System.out.print("  ");
				}
				
				
			}
			System.out.println();
		}
		
	}

}
