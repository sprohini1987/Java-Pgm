package com.tcs.array;

import java.util.Scanner;

public class MatrixaddNew {

	public static void main(String[] args) {
		int a[][]={{6,9},{4,7}};
		int b[][]={{7,6},{5,9}};
		int i;
		int j;
		int c[][]=new int[2][2];
	
		for(i=0;i<=1;i++){
			for(j=0;j<=1;j++){
				
			System.out.print(a[i][j]+" ");
		}
			System.out.println();
		}
			for(i=0;i<=1;i++){
				for(j=0;j<=1;j++){
					
					System.out.print(b[i][j]+" ");
				}
			System.out.println();
	}
			for(i=0;i<=1;i++)
			for(j=0;j<=1;j++)
				c[i][j]=a[i][j]+b[i][j];
		
			for(i=0;i<=1;i++){
				for(j=0;j<=1;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
	}

}
}
