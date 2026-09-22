package com.javapractice;
import java.util.Scanner;
public class Test6 {
	static Scanner sc=new Scanner(System.in);
	
	int Course_id;
	String course_name;
	float feeAmount;
	
	int id;
	String name;
	String course;
	
	static int emp_id;
	static String Emp_name;
	static Double Emp_sal;
	static String Emp_job;
	
	
	String s1;
	String s2;
	String s3;
	String s4;
	String s5;
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("say to anything greeting");
		hello();
		System.out.println("Enter your Name");
		name();
		System.out.println("Enter your Age");
		age();
//		System.out.print("\n");
		System.out.println("Enter your City");
		city();
		System.out.println("Enter your College Name");
		clgname();
		System.out.println("Print the 1 to 10 values");
		print1();
		System.out.println("Print the 10 to 1 values");
		print2();
		System.out.println("Print even numbers 1–20");
		print3();
		System.out.println("Print odd numbers 1–20");
		print4();
		System.out.println("print the multiple of Table");
		print5();
		System.out.println("Print numbers 1 to n");
		print6();
		System.out.println("Print numbers n to 1");
		print7();
		System.out.println("\n");
		System.out.println("Print Java course details"); 
		print8(7677,"javafullstack",25000);
		System.out.println("Print student details");
		Test6 t=new Test6();
		System.out.println("\n");
		t.print9(7677,"govindu","javafullstack");
		System.out.println("Print employee details");
		print10();
		System.out.println();
		welcome();
		System.out.println();
		System.out.println("enter your clg name");
		print11();
		System.out.println();
		t.subject();
		
		
		
		

		
	}
	 void subject() 
	{
		 System.out.println("enter your subject1 name");
		s1=sc.next();
		System.out.println("enter your subject2 name");
		s2=sc.next();
		System.out.println("enter your subject3 name");
		s3=sc.next();
		System.out.println("enter your subject4 name");
		s4=sc.next();
		System.out.println("enter your subject5 name");
		s5=sc.next();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
	}
	static void print11()
	{
		System.out.println("Sri Gowthami Jr college");
	}
	
	static void  welcome()
	{
		System.out.println("welcome to java Basics");
	}
	static void print10()
	{
		System.out.println("enter your emp_id");
		emp_id=sc.nextInt();
		System.out.println("enter your emp_name");
		Emp_name=sc.next();
		System.out.println("enter your emp_sal");
		Emp_sal=sc.nextDouble();
		System.out.println("enter your emp_job");
		Emp_job=sc.next();
		System.out.println(emp_id);
		System.out.println(Emp_name);
		System.out.println(Emp_sal);
		System.out.println(Emp_job);
		
	}
	 void print9(int id,String name,String course)
	{
		
		
		this.id=id;
		this.name=name;
		this.course=course;
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.course);
		
		System.out.println("Here student detail are.. ");
		System.out.println("\n");
		
		
	}
	static void print8(int id,String course_name,float fee) {
		System.out.println("here Course Detaile Are");
		System.out.println("id is  "+id+"\n"+"course_name  "+course_name+"\n"+"fee details "+fee);
	}
			
	static void print7()
	{
		System.out.println("enter your Value");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	
	static void print6()
	{
		System.out.println("enter your Value");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println(i);
		}
	}
	static void hello()
	{
		System.out.println("hello hi");
	}
	static void name()
	{
		System.out.println("chinna");
	}
	static void age()
	{
		System.out.println("21");
	}
	static void  city()
	{
		System.out.println("Markapur");
	}
	static void clgname()
	{
		System.out.println("Pace Institute of Technology and Sciences");
	}
	static void print() {
		System.out.println("Java is Simple By Govindu");
		
	}
	static void print1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}
	static void print2()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	
	static void print3()
	{
		int n=20;
		for(int i=0;i<=n;i+=2)
		{
			System.out.println(i);
		}
	}
	static void print4()
	{
		int n=20;
		for(int i=1;i<=n;i+=2) {
			System.out.println(i);
		}
	}
	static void print5()
	{
		int n=2;
		for(int i=0;i<=10;i++ )
		{
			System.out.println(n+"x"+i+"="+(n*i));
		}
	}

}
