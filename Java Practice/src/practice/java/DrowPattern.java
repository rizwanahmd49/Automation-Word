package practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public abstract class DrowPattern {
	public static void main(String[] args) throws IOException {
		//DrowPattern.longestWord1();
		DrowPattern.longestWord();
	}
	
	  static void longword() {
		 String str="my name is rizwanahmad";
		 int size=str.length();
		 String x="", max="",min="";
		 char ch;
		 for(int i=0;i<size;i++) {
			 ch=str.charAt(i);
			 if(ch!=' ') {
				 x=x+ch;
				 
			 }
		 }
	 }
	public static void longestWord() {
		// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				// System.out.print("Enter any sentence : "); //inputting the sentence
				// String s=br.readLine();

				String s = "my name is rizwan I am from Indiaae";

				s = s + " "; // adding a space at the end, to extract the last word also
				int len = s.length(); // finding the length of the sentence
				String x = "", maxw = "", minw = "";
				char ch;
				int p, maxl = 0, minl = len;

				for (int i = 0; i < len; i++) {
					ch = s.charAt(i); // extracting characters of the string one at a time
					if (ch != ' ') {
						x = x + ch; // adding characters to form word if character is not space
					} else {
						p = x.length();

						if (p < minl) // checking for minimum length
						{
							minl = p;
							minw = x;
						}

						if (p > maxl) // checking for maximum length
						{
							maxl = p;
							maxw = x;
						}
						x = ""; // emptying the temporary variable to store next word
					}
				}
				System.out.println("Shortest word = " + minw + "\nLength = " + minl);
				System.out.println("Longest word = " + maxw + "\nLength = " + maxl);
	}
	
}
