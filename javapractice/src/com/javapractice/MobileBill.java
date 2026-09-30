package com.javapractice;

import java.util.Scanner;

public class MobileBill {
	
	String Mobilemodel;
	int Quantity;
	double Price;
	double Deliverycharge;
	
	
	MobileBill()
	{
		this("unknown");
	}
	MobileBill(String Mobilemodel)
	{
		this(Mobilemodel,1);
	}
	MobileBill(String Mobilemodel,int Quantity)
	{
		this(Mobilemodel,Quantity,0.0);
	}
	MobileBill(String Mobilemodel,int Quantity,double Price)
	{
		this(Mobilemodel,Quantity,Price,0.0);
	}
	MobileBill(String Mobilemodel,int Quantity,double Price,double Deliverycharge)
	{
		this.Mobilemodel=Mobilemodel;
		this.Quantity=Quantity;
		this.Price=Price;
		this.Deliverycharge=Deliverycharge;
	}
	void display() {
		double mobileCost=Price*Quantity;
		double finalBill=mobileCost+Deliverycharge;
		System.out.println("\n----- Mobile Bill------");
		System.out.println("Mobile modal : "+Mobilemodel);
		System.out.println("Mobile Quantity : "+Quantity);
		System.out.println("Mobile modal : "+Price);
		System.out.println("Mobile modal : "+Deliverycharge);
		System.out.println("Mobile mobileCost : "+mobileCost);
		System.out.println("Mobile finalBill : "+finalBill);
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Mobilemodel ");
		String model=sc.next();
		System.out.println("Enter your Quantity ");
		int quantity=sc.nextInt();
		System.out.println("Enter your Price ");
		double price=sc.nextDouble();
		System.out.println("Enter your Deliverycharge ");
		double deliverycharge=sc.nextInt();
		
		
		MobileBill mb=new MobileBill(model,quantity,price,deliverycharge);
		mb.display();

	}

}
