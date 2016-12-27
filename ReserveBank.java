package com.tcs.array;

public abstract class ReserveBank {
	String customername1,customername2;
    int customerid1,customerid2;
      private int minBalance;

	public int getMinBalance() {
			return minBalance;
		}
		public void setMinBalance(int minBalance) {
			this.minBalance = minBalance;
		}
	public static void main(String[] args) {
		StateBank loan=new StateBank();
		IOB lo=new IOB();
		loan.givenLoan();
		lo.givenLoan();
	}
		
	public void ReseveBank() {
		System.out.println("hai");
		customername1="rohini";
		System.out.println(customername1);
		customername2="karthi";
		System.out.println(customername2);
		customerid1=4568;
		System.out.println(customerid1);
		customerid2=41891;
		System.out.println(customerid2);
		
		
	}
	public void getcustomerdetails(String custname, int mob) {
		System.out.println("customer Details " + custname+" "+mob);
	}

   void deposit(){
	   System.out.println("deposit here in RBI");
}
   public abstract void givenLoan();
}

	
