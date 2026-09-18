package com.javapractice;

public class Test5 {
	int  empId;
	String empName;
	float empSalary;
	
	void display()
	{
	
		System.out.println("Employee id "+empId);
		System.out.println("Employee name "+empName);
		System.out.println("Employee salary "+empSalary);
	}

	public static void main(String[] args) {
		
		Test5 t=new Test5();
		Test5 t1=new Test5();
		Test5 t2=new Test5();
		
		t.empId=101;
		t.empName="chinna";
		t.empSalary=50000F;
		t.display();
		
		
		t1.empId=102;
		t1.empName="govindu";
		t1.empSalary=40000F;
		t1.display();
		
		
		t2.empId=103;
		t2.empName="hari";
		t2.empSalary=45000F;
		t2.display();
		
		
		
		
		
		
		

	}

}
