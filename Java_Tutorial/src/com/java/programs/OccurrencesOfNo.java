package com.java.programs;


public class OccurrencesOfNo {
	
	public static int countCharacter(String str,char  ch)
	{
		int count=0;
		int index=0;
		while (index < str.length())
		{
			if(str.charAt(index)==ch) {
				count++;
			}
			index++;
		}
		return count;
	}

	public static void main(String[] args) {

		String str="rizwAnahmadsalmani";
		
		char[] ch=str.toCharArray();
		int count=ch.length;
		//int counter=0;
		for(int i=0;i<count;i++)
		{
			int counter=0;
			for(int j=0;j<count;j++) {
				
				if(j<i && ch[i]==ch[j]) {
					break;
				}
				
				if(ch[i]==ch[j])
				{
					counter++;
				}
				
				if(j==count-1) {
					System.out.println(ch[i]+" is present "+counter+" times");
				}
				
			}
		}
		
		

	}

}
