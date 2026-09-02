package com.javapractice;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("starting of the java");
		System.out.println("welcome to java... have nice day");
		
        Class.forName("com.mysql.cj.jdbc.Driver");
        Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		Class.forName("com.javapractice.Demo");
		
		
		System.out.println("endingof the java");
		
		

	}

}
