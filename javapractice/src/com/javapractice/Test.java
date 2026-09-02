package com.javapractice;

class Test{
	static int count=0;

	static void main()
	{
		
		count++;
		
	}
	void test()
	{
		main();
		main();
	}

	
	

	
	public static void main(String args[])
	{
		
		Test t=new Test();
		t.test();
		t.test();
		Test t1=new Test();
		main();
		Test t2=new Test();
		main();
		Test t3=new Test();
		main();
		 System.out.println(count);

	}
	
}
 
	



	       
