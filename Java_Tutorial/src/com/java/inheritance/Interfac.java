package com.java.inheritance;

public interface Interfac {
	class Grandparent {
	    public void Print() {
	        System.out.println("Grandparent's Print()");
	    }
	}
	  
	class Parent extends Grandparent {
	    public void Print() {
	        System.out.println("Parent's Print()");
	    }
	}
	  
	class Child extends Parent {
	    public void Print() {
	        super.Print(); 
	        System.out.println("Child's Print()");
	    }
	}
	  
	public static  class Main{
		public static void main (String args[]) {
			
		}
	}
	

}
