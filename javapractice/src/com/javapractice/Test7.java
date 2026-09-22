package com.javapractice;


public class Test7 {
	int sid;
	String sname;
	//no-arg Constructor
	Test7()
	{
		System.out.println("no-args Constrctor");
		int sid=11100;
		String sname="ganesh";
	}
	
	Test7(int sid,String sname)
	{
		
	}
	
	{
		System.out.println("instance block called");
	}

	public static void main(String[] args) {
		//Default Constructor
		Test7 t=new Test7();
		t.sid=7677;
		t.sname="chinna";
		t.TestInfo();
		
		System.out.println("************************");
		Test7 t1=new Test7(101,"Srikanth");
		t.TestInfo();
		
	}
	 void TestInfo()
	{
		System.out.println("student id : "+sid);
		System.out.println("student name : "+sname);
	}

}
