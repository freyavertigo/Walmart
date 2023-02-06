package com.sample.raj;


class A extends Thread{
	
	public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("Rahul");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
  }
}


public class B {

	public static void main(String[] args) throws InterruptedException {
		A t=new A();
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Raj");
			Thread.sleep(1000);
			
		}

	}

}
