package com.javapractice;

public class ProductBill {
	String product_name;
	double price;
	int quantity;
	double discount;
	ProductBill()
	{
		this("unknown");
	}
	ProductBill(String product_name)
	{
		this(product_name,0.0);
	}
	ProductBill(String product_name,double price)
	{
		this(product_name,price,0);
	}
	ProductBill(String product_name,double price,int quantity)
	{
		this(product_name,price,quantity,0.0);
	}
	ProductBill(String product_name,double price,int quantity,double discount)
	{

		this.product_name=product_name;
		this.price=price;
		this.quantity=quantity;
		this.discount=discount;
		
	}
	void display()
	{
		System.out.println(product_name);
		System.out.println(price);
		System.out.println(quantity);
		System.out.println(discount);
	}

	public static void main(String[] args) {
		ProductBill pb=new ProductBill("iphone",50000.0,2,20.0);
		pb.display();
		
		

	}

}
