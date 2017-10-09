package com.java.programs;

public class ReversTheString {
	
	public  void reversUsingWhile(String str)
	{
		
		int lenght=str.length()-1;
						System.out.println("The lenght is: "+lenght);
		while(lenght>=0)
		{
			//char c=str.charAt(lenght);
			//System.out.print(c);
			//====OR=====
			System.out.print(str.charAt(lenght));
			lenght=lenght-1;
		}
		
	}
	
	public void reversUsingStringBuffer(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}

	public static void main(String args [] ) {
		ReversTheString re=new ReversTheString();
		re.reversUsingWhile("welcome");
		System.out.println();
		re.reversUsingStringBuffer("damhA nawziR");
		
	}

}
