package com.javapractice;

public class Test3 {

	public static void main(String[] args) {
		
		Test3 t=new Test3();
		t.addition(10,10);
		

		
	}
	
	void addition(int a,int b)
	{
		int s=a+b;
		System.out.println(s);//20
		subtract(50,s);
	}
	void subtract(int a,int b)
	{
		int s=a-b;
		System.out.println(s);//30
		multiplication(s,2);
		
	}
	void  multiplication(int a,int b)
	{
		int s=a*b;
		System.out.println(s);//60
		division(s,2);
		
	}
	void   modulus(int a,int b)
	{
		int s=a%b;
		System.out.println(s);//0
		
	}
	void   division(int a,int b)
	{
		int s=a/b;
		System.out.println(s);
		modulus(s,4);
		
	}
	

}
