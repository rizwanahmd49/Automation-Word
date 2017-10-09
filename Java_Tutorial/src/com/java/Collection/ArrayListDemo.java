package com.java.Collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListDemo {
	
	
	public static void ArrayDemo() {
		//ArrayList<Integer>li=new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		li.add(23);
		li.add(20);
		li.add(24);
		li.add(21);
		li.add(31);
		li.add(22);
		li.add(20);
		Collections.sort(li);
		for(Object a:li) {
			System.out.println(a);
		}
		
	}
	

	

	
	public static void main(String[] args) {
		
		ArrayListDemo.ArrayDemo();
	}

}
