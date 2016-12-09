package com.tcs.array;

public class Customer {

	public static void main(String[] args) {
		Customer gom=new Customer();
		gom.deposit();
		gom.withdrawl();
		Bank form=new Bank();
		form.getcustomerdetails();
	}

	private void withdrawl() {
		System.out.println("Im going to take 5000");
		
		
	}

	private void deposit() {
		System.out.println("im going to deposit 5000");
	
		
	}

}
