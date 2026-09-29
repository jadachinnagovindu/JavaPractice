package com.javapractice;

public class Test10 {
	int accountNumber;
	String customerName;
	String accountType;
	Double balance;
	
	Test10(int accountNumber,String customerName,String accountType,Double balance ){
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.accountType=accountType;
		this.balance=balance;
	}
	

	public static void main(String[] args) {
		
		Test10 t=new Test10(7677,"Chinna","savings",50000.00);
		t.CustomerInfo();
		System.out.println("******************************");
		Test10 t1=new Test10(7652,"Chinnagovindu","business",75000.00);
		t1.CustomerInfo();
	}
	void CustomerInfo()
	{
		System.out.println("Customer AccountNumber is : "+accountNumber);
		System.out.println("Customer customerName is : "+customerName);
		System.out.println("Customer accountType is : "+accountType);
		System.out.println("Customer balance is : "+balance);
	}

}
