package com.ccc.inter;

		public class VoterIdCheckExp extends Exception {

			int voterAge; 
			public VoterIdCheckExp(int age) {
				// TODO Auto-generated constructor stub
				
				this.voterAge = age; 
				ageFinder(voterAge); 
				
			}
	
			public VoterIdCheckExp() {
				// TODO Auto-generated constructor stub
			}

			private void ageFinder(int age) {
				// TODO Auto-generated method stub
				if(age<18)
				{
					try {
						throw new VoterIdCheckExp();
					} catch (VoterIdCheckExp e) {
						// TODO Auto-generated catch block
						System.out.println("Please check your age");
						Throw.voterAgeCheck();
					} 
				}
				
					System.out.println("Age "+ age);
				
				
				
			}
			
			

	}

