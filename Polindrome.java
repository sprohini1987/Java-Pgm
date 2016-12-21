package com.ttt.loop;

public class Polindrome {

	public static void main(String[] args) {
		int n[]={23,121,656,899,1001};
		for(int i=0;i<n.length;i++){
			int n1=n[i];
			int reverse=0;
			int temp=0;
			while(n1>0){
				temp=n1%10;
				n1=n1/10;
				reverse=reverse*10+temp;
			}
			if(n[i]==reverse){
				System.out.println(n[i]+ " polindrome num");
			}
				else{
					System.out.println(n[i]+" not polindrome num");
				}
			}
			}
		}


