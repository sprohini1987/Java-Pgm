package com.tcs.array;

public class Customer {
	int id1=5456;
	int id2=4559;
	String name1="rohini"; 
	String name2="karthi";
	long loan1=10236;
	long loan2=56358;
	int id3=1566;
	int id4=2359;
	String name3="shankar"; 
	String name4="pravin";
	long loan3=156936;
	long loan4=512588;
	
	
	public static void main(String[] args) {
		Customer gom=new Customer();	
		Customer gom1=new Customer();
		
		
		gom.deposit();
		gom.withdrawl();
		Bank sbi=new Bank(gom);
		sbi.getcustomerdetails(gom);
		sbi.getcustomerdetails("sarah",7868);
		Bank icici=new Bank(gom1);
		icici.getcustomerdetail(gom1);
	}

	private void withdrawl() {
		System.out.println("Im going to take 5000");
		
		
	}

	private void deposit() {
		System.out.println("im going to deposit 5000");
	
		
	}

}
