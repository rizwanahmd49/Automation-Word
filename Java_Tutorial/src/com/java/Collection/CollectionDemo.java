package com.java.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	
	public static void main(String args[]) {
		
		Collection<String> values=new ArrayList<>();
		values.add("Name:- ");
		values.add("rizwan");
		values.add("10.25");
		
		for(Object e:values)
		{
			//String s="";
		System.out.println(e);
		}
	}

}
