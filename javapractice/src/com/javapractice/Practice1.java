package com.javapractice;

public class Practice1 {

	public static void main(String[] args) {
//		basic traverse
//		int[] numbers= {10,20,30,40,50};
//		for(int i=0;i<numbers.length;i++)
//		{
//			System.out.print(numbers[i]+" " );
//		}
//				
	
//		**********no.of even elements************
//		int arr[]= {10,20,30,40,50};
//		for(int i=0;i<arr.length;i++)
//		{
//			if(i%2==0)
//			{
//				System.out.println(arr[i]);
//			}
//		}
		
//		**********second large number************	
		
//		int arr[]= {10,50,30,90,40};
//		int large=arr[0];
//		int secondlarge=arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>large)
//			{
//				secondlarge=large;
//				large=arr[i];
//			}
//			else if(arr[i]>secondlarge && arr[i]!=large)
//			{
//				secondlarge=arr[i];
//			}
//		}
//		System.out.println(large);
//		System.out.println(secondlarge);
			
		
//		**********second min number************
		
//		int arr[]= {10,50,30,5,40};
//		int min=arr[0];
//		int secondmin=arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]<min)
//			{
//				secondmin=min;
//				min=arr[i];
//			}
//			else if(arr[i]<secondmin && arr[i]!=min)
//			{
//				secondmin=arr[i];
//			}
//		}
//		System.out.println(min);
//	    System.out.println(secondmin);
		
		
//		*********count Pasitive& Negative And Zero**************
		
//		int arr[]= {10,-20,30,0,-5,40};
//		int pasitive=0;
//		int negative=0;
//		int zero=0;
//		for(int a:arr) {
//			if(a>0)
//			{
//				pasitive++;
//			}
//			else if(a<0)
//			{
//				negative++;
//			}
//			else
//			{
//				zero++;
//			}
//		}
//		System.out.println(pasitive);
//		System.out.println(negative);
//		System.out.println(zero);
		
		
//		int n[]= {10,20,10,30,10,40,30};
//		int search=30;
//		int count=0;
//		for(int a:n)
//		{
//			if(a==search)
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
//		
		
		
//		***********duplicate elements*************
		
//		int n[]= {10,20,30,20,10,40};
//		for(int i=0;i<n.length;i++)
//		{
//			for(int j=i+1;j<n.length;j++)
//			{
//				if(n[i]==n[j])
//				{
//					System.out.println(n[i]);
//					break;
//				}
//			}
//		}

		int n[]= {10,20,30,20,10,40};
		for(int i=0;i<n.length;i++)
		{
			int count=0;
			for(int j=0;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(n[i]);
			}
		}
		
	}

}
 