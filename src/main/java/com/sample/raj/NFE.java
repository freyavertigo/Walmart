package com.sample.raj;

public class NFE {

	public static void main(String[] args) {
		
		String str="raj";
		
		try
		{
			int a=Integer.parseInt(str);
			System.out.println(a);
				
		}
		
		catch(NumberFormatException n)
		{
		System.out.println("string "+str+" cannot be converted to integer");
		
		}
		System.out.println("main methiod ended");
		
		}

}
