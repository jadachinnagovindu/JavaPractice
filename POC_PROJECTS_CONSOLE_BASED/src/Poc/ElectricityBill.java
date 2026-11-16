package Poc;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;
			
	    do {
		System.out.println("Enter Your Connection Type Domestic/Commericial");
		String connectiontype=sc.next();
		connectiontype=connectiontype.toLowerCase();
		System.out.println("Enter your units");
		double units=0;
		if(!sc.hasNextDouble())
		{
			System.out.println("Invalid inputs! enter numbers only");
		}
		else {
			 units=sc.nextDouble();
		}
		
		double rate=0;
		double bill=0;
		boolean valid=true;
		if(units<0)
		{
			System.out.println("Invalid Unit");
		}
		else
		{
			switch(connectiontype)
			{
			case "domestic" ->
			{
				if(units<=100) {
					rate=2;
				}
				else
				{
					rate=3;
				}		
			}
			case "commericial" ->{
				if(units<=100) {
					rate=4;
				}
				else if(units<=300) {
					rate=6;
				}
				else 
				{
					rate=8;
				}
					
				
			}
			default ->{ System.out.println("Unknown connectionType");
			valid = false;
			
			}
					
		}
		}
		
		if(valid)
		{
			bill=units*rate;
			System.out.println("Connection Type: " + connectiontype);
	         System.out.println("Units Consumed: " + units);
	         System.out.println("Rate Per Unit: " + rate);
	         System.out.println("Total Electricity Bill: " + bill);
		}
		
		System.out.println("Do you want to Calculate another Bill ");
		 choice=sc.next().charAt(0);
		
	    } while(choice=='y'|choice=='Y');
		
	}

}

