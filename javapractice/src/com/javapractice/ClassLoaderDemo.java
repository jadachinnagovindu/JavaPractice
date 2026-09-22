package com.javapractice;

public class ClassLoaderDemo {

	public static void main(String[] args) {
		//bootstrap class Loader 
		System.out.println("Object class Loader "+Object.class.getClassLoader());
		//bootstrap class Loader
		System.out.println("String Class Loader "+String.class.getClassLoader());
		//bootstrap class Loader
		System.out.println("System Class Loader "+System.class.getClassLoader());
		//Apllication class Loader
		System.out.println("classLoaderDemo"+ClassLoaderDemo.class.getClassLoader());
		
		
		

	}

}
