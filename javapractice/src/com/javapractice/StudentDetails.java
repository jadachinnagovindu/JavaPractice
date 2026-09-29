package com.javapractice;

public class StudentDetails {
	String name;
	int age;
	String course;
	Double marks;
	StudentDetails()
	{
		this("unknown");
	}
	StudentDetails(String name)
	{
		this(name,0);
	}
	StudentDetails(String name,int age)
	{
		this(name,age,"unknown");
	}
	StudentDetails(String name,int age,String course)
	{
		this(name,age,course,0.0);
	}
	StudentDetails(String name,int age,String course,Double marks)
	{
		this.name=name;
		this.age=age;
		this.course=course;
		this.marks=marks;
	}
	
	void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(course);
		System.out.println(marks);
	}

	public static void main(String[] args) {
		StudentDetails sd=new StudentDetails("chinna");
		sd.display();
		System.out.println("**********************************");
		StudentDetails sd1=new StudentDetails("chinna",21);
		sd1.display();
		System.out.println("**********************************");
		StudentDetails sd2=new StudentDetails("chinna",21,"java");
		sd2.display();
		System.out.println("**********************************");
		StudentDetails sd3=new StudentDetails("chinna",21,"java",100.0);
		sd3.display();
		
		

	}

}
