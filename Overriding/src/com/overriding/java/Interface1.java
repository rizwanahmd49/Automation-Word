package com.overriding.java;

import java.util.concurrent.CompletionException;

public interface Interface1 {
	final class  Complex {
		 
	    private final double re;
	    private final double im;
	 
	    public Complex(double re, double im) {
	        this.re = re;
	        this.im = im;
	    }
	 
	    public String toString() {
	        return "(" + re + " + " + im + "i)";
	    }
	}
	
	
	 
	
}
