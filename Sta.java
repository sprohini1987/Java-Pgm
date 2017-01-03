package com.ttt.loop;

public class Sta {
                static int count=0;
                int j=40;
                int k=getC();
                static {
                	count++;
                }
                public Sta(){
                	System.out.println("inside cons()");
                	count++;
                }
                
	public int getC() {
					count++;
					System.out.println("inside getC()");
					return 10;
				}
  public static void getD(){
	  
	  			count++;
	  			//k++;
  }
	public static void main(String[] args) {
		
						count++;//3
						Sta.count++;
						Sta.getD();
						System.out.println("before new");
						final Sta st=new Sta();//6
						Sta st1[]={new Sta(),new Sta()};
						//st=new Sta();//not allowed
						System.out.println("after new");
						st.count++;//7
						st.getC();//8
						st.getD();//9
						System.out.println("count=="+count);
					}
				static{
					count++;
				}
}
