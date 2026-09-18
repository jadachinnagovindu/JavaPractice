package com.javapractice;

public class Test2 {
	 int money=100;
	 int pencil_cost=7;
	int buy=money/pencil_cost;
	int balance=money%pencil_cost;

	public static void main(String[] args) {
		Test2 t=new Test2();
		System.out.println(t.buy);
		System.out.println(t.balance);
		
		
	}	

}
