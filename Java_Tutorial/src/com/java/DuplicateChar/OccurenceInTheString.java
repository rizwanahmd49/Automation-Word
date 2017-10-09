package com.java.DuplicateChar;


import java.util.Set;
import java.util.TreeMap;
public class OccurenceInTheString {
	
	
	/****
	 * Find the retation of char in string using "toCharArray()"method
	 * 
	 * @param str
	 */
	public void DuplicateChar(String str) {
		System.out.println("DuplicateChar");
		// char ch = str.charAt(3);
		// log.info("Charactor is: "+ch);
		// String str="rizwanahmad";
		char[] ch = str.toCharArray();
		int size = str.length();
		for (int i = 0; i < size; i++) {
			int counter = 0;
			for (int j = 0; j < size; j++) {
				if (ch[i] == ch[j] && j < i) {
					break;
				}
				if (ch[i] == ch[j]) {
					counter++;
				}
				if (j == size - 1) {

					System.out.println(ch[i] + "-> repeted " + counter + " times");

				}
			}
		}

	}

	/**
	 * Find the retation of char in string using "charAt(index)"method
	 * 
	 * @param str
	 */
	public void charOccrance(String str) {
		System.out.println("CharOccarnce");
		// String str = "rizwanahmadsalmani";
		int size = str.length();
		for (int i = 0; i < size; i++) {
			int counter = 0;
			for (int j = 0; j < size; j++) {
				if (str.charAt(i) == str.charAt(j) && j < i) {
					break;
				}
				if (str.charAt(i) == str.charAt(j)) {
					counter++;
				}
				if (j == size - 1) {
					System.out.println("Char " + str.charAt(i) + " repeated " + counter);
				}
			}
		}
	}

	public void DuplicateCharUsingHashMap() {
	
		String str = "rizwanahmadsalmani";
		char[]ch=str.toCharArray();
		TreeMap<Character, Integer>charMap=new TreeMap<Character, Integer>();
		for(char c:ch) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}
		}
		 Set<Character> keys = charMap.keySet();
		for(char key:keys) {
			System.out.println(key+"--->  "+charMap.get(key));
			}
	}
		

	public static void main(String[] args) {
		OccurenceInTheString ocr = new OccurenceInTheString();

		ocr.DuplicateCharUsingHashMap();
		// ocr.DuplicateChar("aaaaaaaaaaaaaa");
		// ocr.charOccrance("rizwanahmadsalmani");

	}

}
