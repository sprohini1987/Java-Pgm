package com.ctc.innerclass;

 class AnonymousClassWithInterface  {

	public static void main(String[] args) {
		Acting a=new Acting() {
			
			@Override
			public void singing() {
				// TODO Auto-generated method stub
				System.out.println("inner Class singing");
				
			}
			
			@Override
			public void dance() {
				// TODO Auto-generated method stub
				System.out.println("inner class dancing");
			}
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				System.out.println("inner class acting");
				
			}
			private void fight(){
				System.out.println("inner class fight");
			}
		};
		a.act();
		a.dance();
	AnonymousClassWithInterface a1=new AnonymousClassWithInterface();
	a1.act();
	AnonymousClassWithInterface aic= new AnonymousClassWithInterface();
	int result=aic.add(5,8);
	}

	private int add(int i, int j) {
		// TODO Auto-generated method stub
		int total=i+j;
		System.out.println(total);
		return total;
	
	}

	private void act() {
		// TODO Auto-generated method stub
		System.out.println("rajini class act");
	}
 }

