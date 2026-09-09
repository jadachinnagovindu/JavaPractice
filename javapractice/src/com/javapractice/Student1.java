package com.javapractice;

public class Student1 {
	String Name;
	int  Age;
	String College;
	
	void display()
	{
		
		System.out.println(Name);
		System.out.println(Age);
		System.out.println(College);
	
	}

	public static void main(String[] args) {
		Student1 std=new Student1();
		std.Name="chinna";
		std.Age=21;
		std.College="pace";
		std.display();
		
		

	}

}
