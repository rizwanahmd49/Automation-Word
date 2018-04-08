package com.overriding.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.overriding.java.Interface1.Complex;




public class Test extends Value {

public static void main(String []args) {
	
	Complex c = new Complex(10, 15);
    System.out.println("Complex number is " + c);
	}
/**
 * 
 * @param str
 */
static void DuplicateString (String str) {
	char []c=str.toCharArray();
	int size=str.length();
	int counter;
	for(int i=0;i<size;i++) {
		counter=0;
		for(int j=0;j<size;j++) {
			if(j<i&&c[i]==c[j]) {
				break;
			}
			if(c[i]==c[j]) {
				counter++;
			}
			if(j==size-1) {
				System.out.println(c[i]+" is present "+counter+" times");
			}
		}
	}
}	


static void hashTable () {
	 
    /*
		  * **********Hashtable*************
		  */
    
    System.out.println("**********Hashtable*************");
    Hashtable<Integer, String>ht=new Hashtable<>();
    ht.put(102, "Ahmad");
    ht.put(101, "rizwan");
    ht.put(104, "karari");
    ht.put(103, "Salmani");
    ht.put(1025, "other");
    ht.put(105, null);
    for(Map.Entry m:ht.entrySet()) {
  	  System.out.println(m.getKey()+" "+m.getValue());
    }
}
static void hashMap() {
	 /*
	  * **********HashMap*************
	  */
	 System.out.println("**********HashMap*************");
	 TreeMap<Integer, String>hm=new TreeMap<>();
     hm.put(102, "Ahmad");
     hm.put(101, "rizwan");
     hm.put(25, "other");
     hm.put(103, "Salmani");
     hm.put(107, "Salmani");
         hm.put(104, null);
     hm.put(105, null);
     hm.put(106, null);
     for(Map.Entry m:hm.entrySet()) {
   	  System.out.println(m.getKey()+" "+m.getValue());
     }
}
static	void first() {
		  /*
		  * **********Hashtable*************
		  */
     
     System.out.println("**********TreeMap*************");
     
    Map<Integer, String>tm=new TreeMap<>();
     tm.put(102, "Ahmad");
     tm.put(101, "rizwan");
     tm.put(25, "other");
     tm.put(103, "Salmani");
     
     for(Map.Entry m:tm.entrySet()) {
   	  System.out.println(m.getKey()+" "+m.getValue());
     }
	}
static void arryList() {
	ArrayList<String> al=new ArrayList<String>();  
	al.add("Viru");  
	al.add("Saurav");  
	al.add("Mukesh");  
	al.add("Tahir");  
	  
	Collections.sort(al);  
	Iterator itr=al.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	 }  
}

}
