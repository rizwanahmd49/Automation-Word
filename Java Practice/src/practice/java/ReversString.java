package practice.java;

public class ReversString {

	public static void main (String args[]) {
		revers("rizwanahmad");
	}

	

	private static void revers(String string) {
		int size=string.length()-1;
		char array[]=string.toCharArray();
		while (size>=0) {
			System.out.print(array[size]);
			size--;
		}
				
	}
}
