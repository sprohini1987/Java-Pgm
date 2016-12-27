package com.tcs.array;

public class IOB extends ReserveBank {

	public static void main(String[] args) {
		IOB iob=new IOB();
	iob.deposit();
	}
      void deposit(){
    	  String customername="rohini";
    	  System.out.println("Customer Name:"+customername);
    	  System.out.println("deposit rs=5000");
      }
	@Override
	public void givenLoan() {
		// TODO Auto-generated method stub
		System.out.println("loan 250000");
	}
}
