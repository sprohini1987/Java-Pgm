package com.tcs.array;

public class Star {

	public static void main(String[] args) {
		for(int i=0;i<2;i++){
			for(int j=3;j>i;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
			System.out.print("* ");
			}
System.out.println();	
	}
		for(int i=2;i>=0;i--){
			for(int j=3;j>i;j--){
				System.out.print(" ");
			}
			int col = 0;
			for(int k=0;k<=i;k++){
				if(i==2&&k==1&&col==1)
				{
					System.out.print(" ");
				}
				else{
					System.out.print("*  ");
				  col++;
			}
	}
			System.out.println();
	}

	}
}
