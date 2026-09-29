package com.javapractice;

public class Vehicle {
	String type;

	Vehicle(String type) {
		this.type = type;
	}

}

class Car extends Vehicle {
	String brand;
	double price;

	Car(String type, String brand, double price) {
		super(type);
		this.brand = brand;
		this.price = price;

	}

	public static void main(String[] args) {

	}
}

class ElectricCar extends Car {
	double batteryCapacity;

	ElectricCar(String type, String brand, double price, double batteryCapacity) {
		super(type, brand, price);

		this.batteryCapacity = batteryCapacity;

	}

	void display() {
		System.out.println("type : " + type);
		System.out.println("brand : " + brand);
		System.out.println("price : " + price);
		System.out.println("batteryCapacity : " + batteryCapacity);
		
	}

	public static void main(String[] args) {
		ElectricCar ec = new ElectricCar("Electric", "Tata Nexon", 2500000.0, 40.0);
		ec.display();
	}
}