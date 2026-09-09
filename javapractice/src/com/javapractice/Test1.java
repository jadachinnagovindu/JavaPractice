package com.javapractice;

public class Test1 {
//	static void display()
//	{
//		System.out.println("static display method");
//	}
//	static void hello()
//	{
//		display();
//		System.out.println("static hello method");
//	}
//	void buy()
//	{
//		hello();
//		System.out.println("instance hello method");
//	}
//	void call()
//	{
//		buy();
//		System.out.println("instance call method");
//	}


	static {
	call1();
	call();
	Test1 t=new Test1();
	
   t.display();
   t.display1();

	}
	
	void display()
	{
		System.out.println("display method");
		
	}
	
	void display1()
	{
	
		System.out.println("display1 method");
	}
	static void call()
	{
		
		System.out.println("call method");
		
	}
	static void call1()
	{ 
		
		System.out.println("call1 method");
	}
	public static void main(String[] args) {
		
//		Test1 t=new Test1();
//		t.call();

		
		
		
	}

}
