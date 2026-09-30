package com.javapractice;

public class BankAccount1 {
	int  accountNumber; 
	String accountHolderName; 
	double balance; 
	String branch;
	BankAccount1(int  accountNumber,String accountHolderName,double balance,String branch)
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
		this.branch=branch;
	}
	BankAccount1(BankAccount1 bank,int  accountNumber,String accountHolderName)
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=bank.balance;
		this.branch=bank.branch;
	}
	
	void DisplayAccountDeatails() {
		System.out.println("accountNumber : "+accountNumber);
		System.out.println("accountHolderName : "+accountHolderName);
		System.out.println("balance : "+balance);
		System.out.println("branch : "+branch);
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("main method Stated");
		BankAccount1 ba=new BankAccount1(98765,"Chinna",100000.0,"SBI");
		ba.DisplayAccountDeatails();
		System.out.println("***************************");
		BankAccount1 ba1=new BankAccount1(ba,54321,"bharath");
		
//		ba1.accountNumber=543210;
//		ba1.accountHolderName="bharath";
		
		
		ba1.DisplayAccountDeatails();
		System.out.println("main method ended");
	}

}
