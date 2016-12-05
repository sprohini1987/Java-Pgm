package com.cts.cond;

public class TwoOppTri {

	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
				}
			for(int k=3;k>i;k--)
			{
				System.out.print("*");
			}
		System.out.println();
}
		for(int i=3;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print(" ");
				}
			for(int k=3;k>=i;k--)
			{
				System.out.print("*");
			}
		System.out.println();
}


		
	}

	}

