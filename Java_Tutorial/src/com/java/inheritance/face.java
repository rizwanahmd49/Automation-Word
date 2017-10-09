package com.java.inheritance;

public interface face {
	public class InheriClass {

		public InheriClass(String str) {
			System.out.println("Parameterized Constructor");
			char[] ch = str.toCharArray();
			int size = ch.length;
			for (int i=0;i<size;i++) {
				int count=0;
				for(int j=0;j<size;j++) {
					if(ch[i]==ch[j]&&j<i) {
						break;
					}
		 			if(ch[j]==ch[i]) {
						count++;
					}
					if(j==size-1) {
						if(count>1) {
						System.out.println(ch[i]+" is repeated "+count+" times.");}
					}
				}
			}
			
		}
		
		
		
		public InheriClass() {
			System.out.println("Default Constructor");
			String str="rizwanahmadsalmani";
			char[] ch = str.toCharArray();
			for(int i=0;i<ch.length;i++) {
				int count=0;
				for(int j=0;j<ch.length;j++) {
					if(ch[j]==ch[i]&&j<i) {
						break;
					}
					if(ch[j]==ch[i]) {
						count++;
					}
					if(j==ch.length-1) {
						System.out.println(ch[i]+" is prsent "+count+" times");
					}
				}
			}

		}

	}
}