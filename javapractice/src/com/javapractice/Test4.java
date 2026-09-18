package com.javapractice;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String fn = sc.nextLine();
		System.out.println("Enter your last name");
		String ln = sc.next();
		geNametInfo(fn, ln);
		System.out.println("Enter your age");
		int a = sc.nextInt();
		getAge(a);
		System.out.println("Enter your SSC marks");
		Float marks = sc.nextFloat();
		getMarks(marks);
		System.out.println("Enter your Gender");
		char gender = sc.next().charAt(0);
		getGenderInfo(gender);

		System.out.println("Enter your Location ");
		String loc = sc.next();
		getLocation(loc);
		System.out.println("Enter your School name ");
		String school = sc.next();
		getSchoolName(school);
		System.out.println("Enter your current Location");
		String curr_location = sc.next();
		getCurrentLocation(curr_location);
		System.out.println("Enter your Caste");
		String caste = sc.next();
		getCaste(caste);
		System.out.println("Enter your telugu  Subject marks");
		int t = sc.nextInt();
		System.out.println("Enter your english  Subject marks");
		int e = sc.nextInt();
		System.out.println("Enter your hindi  Subject marks");
		int h = sc.nextInt();
		System.out.println("Enter your social  Subject marks");
		int so = sc.nextInt();
		System.out.println("Enter your science  Subject marks");
		int se = sc.nextInt();
		System.out.println("Enter your maths  Subject marks");
		int m = sc.nextInt();
		getEachSubMarkSum(t, e, h, so, se, m);
		System.out.println("enter your Intermarks ");
		float intermarks = sc.nextFloat();
		getInterMarks(intermarks);
		System.out.println("enter your B.tech CGPA");
		double btech = sc.nextDouble();
		getbtechMarks(btech);
		System.out.println("enter your 10th passout Year ");
		int y = sc.nextInt();
		your10thpassout(y);
		System.out.println("enter your 12th passout Year ");
		int ye = sc.nextInt();
		your12thpassout(ye);
		System.out.println("enter your B.tech passout Year ");
		int yea = sc.nextInt();
		yourbtechpassout(yea);

	}

	static void yourbtechpassout(int year) {
		System.out.println("Your B.tech passout year is -" + year);
	}

	static void getbtechMarks(Double marks) {
		System.out.println("Your B.tech  Marks is -" + marks);
	}

	static void your12thpassout(int year) {
		System.out.println("Your 10th passout year is -" + year);
	}

	static void your10thpassout(int year) {
		System.out.println("Your 10th passout year is -" + year);
	}

	static void getInterMarks(float marks) {
		System.out.println("Your Intermeadiate Marks is -" + marks);
	}

	static void getEachSubMarkSum(int t, int e, int h, int so, int se, int m) {
		System.out.println("your 10th total marks is - " + (t + e + h + so + se + m));
	}

	static void getCaste(String Castename) {
		System.out.println("your Caste is - " + Castename);
	}

	static void getCurrentLocation(String CurrentLocation) {
		System.out.println("your Current location is - " + CurrentLocation);
	}

	static void getSchoolName(String school) {

		System.out.println("your School name is - " + school);

	}

	static void getLocation(String location) {
		System.out.println("your Location is - " + location);

	}

	static void getGenderInfo(char c) {
		System.out.println("your Gender is - " + c);

	}

	static void getMarks(float m) {
		System.out.println("your SSC marks is  - " + m);

	}

	static void getAge(int age) {
		System.out.println("your age is - " + age);

	}

	static void geNametInfo(String fn, String ln) {
		System.out.println("full name is - " + fn + " " + ln);
	}

}
