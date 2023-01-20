package com.sample.ramesh;

public class Test {
	
	
	
	//scopes of variables
	/*
	 * 
	 *   local, global, final, static  
	 *   
	 *   public, private , protected
	 *   
	 *   arithmetic, relation, bitwise, logical, assignment, misc 
	 *   
	 *   arithmetic (+,-, %, *, /, ++, -- )
	 *   relational (==, >=, <=, !=, <, >)
	 *   
	 *   misc(   ?: )
	 *   
	 *   variable x = (expression) ? value if true : value if false 
	 *   
	 *   a = 0011 1100
	 *   
	 *   logical(&&, ||, !)
	 * 
	 */
	
	public Test(){
		System.out.println("test");
	} 
	
   public Test(String a){
		
	}
	
	
	protected static String city;    // variable globally
	public static final String age = "18";
	
	public static void main(String[] args) {
		
		Test t = new Test();   // syntax to create object 
		 int a = 6;
		 a++;
		 a++;
		 
		 
		 int b;
		 b = (a==6) ? 10:20;
		 System.out.println(b);
		 
		 if(a < 6 &&  a > 10) {
			 System.out.println("equal");
		 }else {
			 System.out.println("not equal");
		 }
		 System.out.println(a);
		
		add("c");
		
	}
	
	
	public static void add() {
		String number = "12345";  // declared varibale assigned value to it
		city = "abc";
		System.out.println();
	}
	
    public static void add(String name) {
    	//age = "21";
    	//number = "123";
    	city = "xyz";
    	System.out.println("inside single param method: "+name);
	}
    
   public static void add(char name) {
	   city = "qwer";
	   System.out.println("inside char method: " +name);
	}
    
    public static void add(String name, String address) {
    	System.out.println(name + " " + address);
	}
	

}
