package com.javapractice;

public class Test7 {
	int sid;
	String sname;

	// no-arg Constructor
	Test7() {
		System.out.println("no-args Constrctor");
		sid = 111;
		sname = "ganesh";
		

	}

	Test7(int sid, String sname) {
		this.sid=sid;
		this.sname=sname;

	}

	{
		System.out.println("instance block called");
	}

	public static void main(String[] args) {

		System.out.println("main method started ");

		// Default Constructor
		Test7 t = new Test7();
		t.sid = 7677;
		t.sname = "chinna";
		t.TestInfo();

		System.out.println("************************");

		Test7 t1=new Test7();
		t1.TestInfo();
		System.out.println("************************");
		
		Test7 t2=new Test7(101,"chinna");
		t2.TestInfo();
		System.out.println("************************");


		System.out.println("main method ended ");

	}

	void TestInfo() {
		System.out.println("student id : " + sid);
		System.out.println("student name : " + sname);
	}

}
