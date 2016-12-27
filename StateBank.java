package com.tcs.array;

public class StateBank extends ReserveBank {

	
	public static void main(String[] args) {
		StateBank sbi=new StateBank();
		sbi.deposit();
		ReserveBank rbi=new StateBank();
		
	}
	void deposit(){
	System.out.println("deposit here in sbi");
	}
	@Override
	public void givenLoan() {
		// TODO Auto-generated method stub
		System.out.println("give loan rs 200000");
	}
}
