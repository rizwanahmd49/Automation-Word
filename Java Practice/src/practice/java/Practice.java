package practice.java;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice extends DrowPattern {

	public static void main(String[] args) throws IOException {
		   
		int totalwords=totalWordInString(10,85,30);
		System.out.println(totalwords);
	}
	
	

	 static int totalWordInString (int X, int Y, int D) {
		
		 int distance =Y-X;
		 if(distance % D==0) {
			 return distance / D;
		 }else
			 
		 return distance/ D+1;
		 
		
	    }

}
