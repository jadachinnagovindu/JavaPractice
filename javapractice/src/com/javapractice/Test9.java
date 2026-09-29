package com.javapractice;

public class Test9 {
	 String name;
	 int id;
	 double salary;
	
	Test9(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
//		System.out.println(this.name);
//		System.out.println(this.id);
//		System.out.println(this.salary);
	}
	

	public Test9() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		
		
		Test9 t=new Test9("chinna",101,50000);
		t.stuInfo();
		
		

	}
	 void stuInfo()
	{
		
		System.out.println("student name : "+name);
		System.out.println("student id : "+id);
		System.out.println("student salary : "+salary);
	}

}
