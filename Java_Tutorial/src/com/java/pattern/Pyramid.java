package com.java.pattern;

public class Pyramid {
	
	/*
	 *		    *
	 * 		   * *
	 * 		  * * *
	 * 		 * * * *
	 * 		* * * * *
	 */
//	1	2	3	4	5	6	7	8	9
//1					*				
//2				*		*			
//3			*		*		*		
//4		*		*		*		*	
//5	*		*		*		*		*


	public static void main(String[] args) {
		int j,i,k  ;
		for (i=1;i<=7;i++)
		{
			k = 1;
			
			for(j=1;j<=13;j++)
			{
				if(j>=8-i&&j<=6+i&&k==1) 
				{
					System.out.print("A");
					k=0;
				}else
				{
					System.out.print(" ");
					k=1;
				}
			}
			System.out.println();
		}
		System.out.println(System.getProperty("user.dir"));
		
		
	}
	
	
	

}
