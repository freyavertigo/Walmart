package com.sample.binny;

public class Test1 {
	private static int a = 20, b = 30;
	public static void main(String[] args)
	{
		compare();
		increment();
	}
	public static void compare()
	{
		String x = (a == b) ? "true":"false"; //Miscellaneous operator
		System.out.println(x);
		if(a > b) //relational operator
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("b is greater than a");
		}
		
	}
	public static void increment() 
	{
		a++; //Increment operator
		b--; //Decrement operator
		System.out.println("The incremented value of a is:" +a);
		System.out.println("The drcremented value of b is:" +b);
	}
	

}
