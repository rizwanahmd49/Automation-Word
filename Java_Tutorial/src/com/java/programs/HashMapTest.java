package com.java.programs;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> phonebook = new HashMap<>();
		phonebook.put(101, "Rizwan");
		phonebook.put(102, "Huzaifa");
		phonebook.put(103, "Farah");
		phonebook.put(104, "Farah");
		phonebook.put(105, "Farah Bano");
		phonebook.put(106, "Farah");
		// System.out.println(phonebook.get(103));
		Set<Integer> Keys = phonebook.keySet();

		for (int i : Keys) {
			System.out.println(i);
			// System.out.println(i + ": " + phonebook.get(i));
		}
		Set<Map.Entry<Integer, String>> Values = phonebook.entrySet();

		for (Map.Entry<Integer, String> e : Values) {

			// System.out.println(e);

			// OR Result will be the same
			System.out.println(e.getKey() + ":" + e.getValue());
		} // End of Map forLoop
	}// End of main.
}// End of class
