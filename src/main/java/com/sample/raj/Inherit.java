package com.sample.raj;

public class Inherit {

	public static void main(String[] args) {
		// inheritance = the process where one class aquires,
		//               the attributes and methods of another.
		
		Car car = new Car();
		
		//car.go();
		
		Bicycle bike=new Bicycle();
		
		//bike.stop();
		
		System.out.println(car.doors);
        System.out.println(bike.pedals);
	}

}
