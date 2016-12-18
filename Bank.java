package com.tcs.array;

public class Bank {
      String customername1,customername2;
      int customerid1,customerid2;
	public Bank(Customer k) {
		System.out.println("hai");
		customername1=k.name1;
		System.out.println(customername1);
		customername2=k.name2;
		System.out.println(customername2);
		customerid1=k.id1;
		System.out.println(customerid1);
		customerid2=k.id2;
		System.out.println(customerid2);
		
	}



	public void getcustomerdetails(String custname, int mob) {
		
		
		System.out.println("customer Details " + custname+" "+mob);
	}



	public void getcustomerdetails(Customer gom) {
	System.out.println("customerid1:"+gom.id1);
	System.out.println("customername1:"+gom.name1);
	System.out.println("customerid2:"+gom.id2);
	System.out.println("customername2:"+gom.name2);
	System.out.println("calculating loan");
	double interest1=gom.loan1*0.1;
	System.out.println("Interest for person1 "+ gom.name1+ "is "+interest1);
	double interest2=gom.loan2*.1;
	System.out.println("interest for person2 "+ gom.name2+ "is "+interest2);
//	 System.out.println("Interest for person1 "+gom.name1+"is"+interest1 + "\n" +"interest for person2 "+ gom.name2+ "is"+interest2 );
	}



	public void getcustomerdetail(Customer h) {
		System.out.println("customerid1:"+h.id3);
		System.out.println("customername1:"+h.name3);
		System.out.println("customerid2:"+h.id4);
		System.out.println("customername2:"+h.name4);
		System.out.println("calculating loan");
		double interest1=h.loan3*0.1;
		System.out.println("Interest for person1 "+ h.name3+ "is "+interest1);
		double interest2=h.loan4*.1;
		System.out.println("interest for person2 "+h.name4+ "is "+interest2);
		
	}


   
}
