package com.javapractice;

public class Demo {

	public static void main(String[] args) {
		
//		***********Find the second largest element. ************
		
//		int arr[] = {10, 25, 8, 40, 30};
//		int largest=arr[0];
//		int secondlargest=arr[0];
//		for(int i=1;i<arr.length;i++)
//		{
//			if(arr[i]<largest)
//			{
//				secondlargest=largest;
//				largest=arr[i];
//				
//			}
//			else if(arr[i]<secondlargest && arr[i]!=largest)
//			{
//				secondlargest=arr[i];
//			}
//		}
//		System.out.println("largest "+largest);
//		System.out.println("secondlargest "+secondlargest);
	

		int arr[] = {10, 20, 10, 30, 20, 40};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
		
	}

}
