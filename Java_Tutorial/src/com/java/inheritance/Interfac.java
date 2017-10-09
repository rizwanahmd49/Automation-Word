package com.java.inheritance;

public interface Interfac {
	public class A {
		public A() {
			System.out.println("Constructor A");
		}

		public void print() {
			System.out.println("Method A");
		}
	}

	public void print();

	public class B extends A {
		public B() {
			System.out.println("Constructor B");
		}

		public void print() {
			System.out.println("Method B");
		}
	}

	public class C extends B {
		public C() {
			System.out.println("Constructor C");
		}

		public void print() {
			System.out.println("Method C");
		}
	}

}
