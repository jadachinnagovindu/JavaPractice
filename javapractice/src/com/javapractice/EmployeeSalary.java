package com.javapractice;

public class EmployeeSalary {
	String employee_name;
	int employee_id;
	double basic_salary;
	double bonus;
	EmployeeSalary()
	{
		this("unknown",0.0,0.0);
	}
	EmployeeSalary(String employee_name,double basic_salary,double bonus)
	{
		this("unknown");
	}
	EmployeeSalary(String employee_name,double basic_salary)
	{
		this("unknown");
	}
	EmployeeSalary(String employee_name)
	{
		this.employee_name=employee_name;
	}
	void display() {
		System.out.println(employee_name);
	}


	

	public static void main(String[] args) {
		EmployeeSalary es=new EmployeeSalary("chinna");
		es.display();
		EmployeeSalary es1=new EmployeeSalary("chinna",50000.0);
		es1.display();
		
		

	}

}
