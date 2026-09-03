package com.javapractice;

public class Practice2 {

	public static void main(String[] args) {
//		*********Missing Number***********
		
//		int arr[]= {1,2,3,5};
//		int n=5;
//		int expectedSum=n*(n+1)/2;
//		int actualSum=0;
//		for(int number:arr)
//		{
//			actualSum+=number;
//		}
//		int missing=expectedSum-actualSum;
//		System.out.println(missing);
//		
//		*********check array is sorted or not***********
		
//		int arr[]= {50,40,20,30,10};
//		boolean sorted=true;
//		for(int i=0;i<arr.length-1;i++)
//		{
//			if(arr[i]>arr[i+1]) 
//			{
//				sorted=false;
//				break;
//			}
//		}
//		if(sorted)
//		{
//			System.out.println("array Sorted");
//		}
//		else
//		{
//			System.out.println("array not Sorted");
//		}
//		

		
//		*********pair of with given sum***********
		
//		int arr[]= {10,20,30,40,50};
//		int target=70;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]+arr[j]==target) 
//				{
//					System.out.println(arr[i] +"+"+arr[j]+"="+target);
//				}
//				
//			}
//		}
//		
//		
//		*********separate Even and Odd Elements***********	
//				int arr[]= {10,15,20,25,30,35};
//				System.out.println("even Numbers");
//				for(int n:arr)
//				{
//					if(n%2==0)
//					{
//						System.out.println(n);
//					}
//				
//				}
//				System.out.println("odd Numbers");
//				for(int n:arr)
//				{
//					if(n%2!=0)
//					{
//						System.out.println(n);
//					}
//				
//				}
//		
//		*********Reverse Array in-Place***********	
		
		
		int arr[]= {10,20,30,40,50};
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int n:arr)
		{
			System.out.println(n);
		}
		
		
	}

}
