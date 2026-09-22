package com.javapractice;

public class Datatype1 {
	
	byte EmployeeId;
	short Employeeage;
	double salary;
  char employeegrade;
	String  Yearsofexperience;
	boolean Employeeisactive;
	int numberofleaves;
	long EmployeePhone_relatednumericvalue;
	
	static int availbleofleaves=10;
	void usedleaves()
	{
		availbleofleaves--;
		
	}
	
//	int a;
//	Integer a1;
//	
	

	public static void main(String[] args) {
		Datatype1 d=new Datatype1();
		Datatype1 d1=new Datatype1();
		d.EmployeeId=101;
		d.Employeeage=21;
		d.salary=50000.38;
		d.employeegrade='A';
		d.Yearsofexperience="Fresher";
		d.Employeeisactive=true;
		d.numberofleaves=2;
		
		d.usedleaves();
		d1.usedleaves();
		d.EmployeePhone_relatednumericvalue=9347902788L;
		
		
		System.out.println("Employee Id "+d.EmployeeId);
		System.out.println("Employee age "+d.Employeeage);
		System.out.println("salary "+d.salary);
		System.out.println("employee grade "+d.employeegrade);
		System.out.println("Years of experience "+d.Yearsofexperience);
		System.out.println("Employee is active "+d.Employeeisactive);
		System.out.println("number of leaves "+d.numberofleaves);
		System.out.println("number of availbleleaves  "+availbleofleaves);
		System.out.println("Employee Phone-related numeric value "+d.EmployeePhone_relatednumericvalue);
		
//	System.out.println(d.a);
//	System.out.println(d.a1);
	
		
	

	}

}
