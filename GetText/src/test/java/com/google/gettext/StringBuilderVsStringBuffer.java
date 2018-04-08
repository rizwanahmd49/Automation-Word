package com.google.gettext;

class StringBuilderVsStringBuffer {

	// Java program to demonstrate difference between String,
	// StringBuilder and StringBuffer
	static class Geeksforgeeks
	{
		// Concatenates to String
		public static void concat1(String s1)
		{
			s1 = s1 + "forgeeks";
			//System.out.println("Inside: "+s1);
		}

		// Concatenates to StringBuilder
		public static void concat2(StringBuilder s2)
		{
			s2.append("forgeeks");
		}

		// Concatenates to StringBuffer
		public static void concat3(StringBuffer s3)
		{
			s3.append("forgeeks");
		}

		public static void StringConversionToBufferAndBuilder(String name) throws Throwable  {
			System.out.println("*********StringBuffer*********");
			StringBuffer sb=new StringBuffer(name);
			String str1 = sb.toString();
			System.out.println("Without Converted Buffer: "+sb.reverse());
			System.out.println("Converted Buffer: "+str1);
			System.out.println("*********StringBuilder*********");
			StringBuilder strbuilder=new StringBuilder(name);
			String str2=strbuilder.toString();
			System.out.println("Without Converted Builder: "+strbuilder.reverse());
			System.out.println("Converted Builder: "+str2);
			throw new Exception("you hava new Exception");
			//throw new IOException("Connection failed!!");
		}
//		public static void main(String[] args) throws Throwable
//		{
//			StringConversionToBufferAndBuilder("WelcomeToHome");
//			String s1 = "Geeks";
//			concat1(s1); // s1 is not changed
//			System.out.println("String: " + s1);
//
//			StringBuilder s2 = new StringBuilder("Geeks");
//			concat2(s2); // s2 is changed
//			System.out.println("StringBuilder: " + s2);
//
//			StringBuffer s3 = new StringBuffer("Geeks");
//			concat3(s3); // s3 is changed
//			System.out.println("StringBuffer: " + s3);
//		}
	}

	
}
