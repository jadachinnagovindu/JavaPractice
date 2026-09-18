package com.javapractice;
import java.util.Scanner;

public class BankAccount {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your deposite amount");
		int d=sc.nextInt();
		deposit(d);
		System.out.println("enter your withdraw amount");
		int w=sc.nextInt();
		withdraw(w);
	}
	
	static int balance=1000;
	
  static  void deposit(int amount)
	{
		balance+=amount;
		System.out.println(balance);	
		
	}
	static void withdraw(int amount)
	{
		if(balance<amount)
		{
			
			System.out.println("in your bankaccountSufficiantAmount is -  "+balance);
		}
		else
		{
			balance-=amount;
			
			System.out.println("your final bance is "+balance);
		
		}
		
	}

}
