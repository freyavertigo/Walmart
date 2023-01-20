package com.sample.binny;

public class Test {
	private static double a = 37.22, b = 28.40;
	public Test()
	{
		System.out.println("The value of a is:" + a);
	}
	public static void main(String[] args) //Main method
	{
		Test t1 = new Test();
		multiplyNumbers();
		System.out.println(display());
		System.out.println(name());
		value();
		System.out.println("The value of x1 is:" +myMethod(12));
		System.out.println(myMethod(20,30));
	}
	public static void multiplyNumbers() //Multiplying two double numbers
	{
		double c = a * b;
		System.out.println(c);
	}
	public static char display() //Displaying a character
	{
		final char a1 = 'A'; //Variable declared as final
		return a1; 
	}
	public static String name() //Concatenate a name using string 
	{
		String fname = "Joe";
		String lname = "Mick";
		String fullname = fname + " " + lname;
		return fullname;
	}
	private static void value() //Printing a boolean value
	{
		boolean x = true;
		System.out.println("Value of x is:" +x);
	}
	public static int myMethod(int x1) //Method overloading
	{
		return x1;
	}
	public static double myMethod(double y1, double y2) //Method overloading
	{
		return y1 + y2;
	}

}

