package com.tcs.miniproject;

import java.util.Scanner;

public class Hpproducts {

	public static void main(String[] args) {
		Hpproducts hp=new Hpproducts();
		Scanner a=new Scanner(System.in);
		System.out.println("WELCOME TO HP BIG SALE OFFER \n  TIME IS NOW OR NEVER \nDecember 25th - 31th 2016");
		System.out.println("     Great Offers \nVisit Employee store at www.hpshopping.in/CEPP\nFor any Assistance 1800 180 1810");
		System.out.println("LIST OF PRODUCTS \n 1.LAPTOP \n 2.PRINTER \n 3.DESKTOP \n 4.TABLET \n 5.ACCESSORIES");
		System.out.println("PRESS THE PRODUCT NO: TO GET PRODUCT DETAILS");
		int b=a.nextInt();
		for(int i=5;i>=b;i--){
		if(b==1){
			System.out.println("TYPES OF LAPTOP\n 1.HP Pavilion 14-al022TU \n 2.HP Pavilion 11-u052TUx360 \n 3.HP Pavilion 13-u131TUx360");
			System.out.println("PRESS PRODUCT NO TO GET DETAILS ABOUT THAT PRODUCT");
			int c=a.nextInt();
			for(int j=3;j>=c;j--){
			if(c==1){
				System.out.println("1.HP Pavilion 14-al022tu \n @NEW GOLD COLOUR \n @6th Generation Intel Core i5-6200U Processor\n @Windows 10 Home \n"
						+ " @4GB Ram,1TB SATA HDD \n @Intel HD GRAPICS 520 \n @35.56cm(14inch)\n @FHD WLED-backlit(1920x1080)");
				System.out.println("EXTRA FEATURES \n >Prismatic Battery \n >B&O Play \n >Fast charge \n >New Chrome \n >Light Weight \n #EPP Price Rs.49,990 | Big Sale Price Rs.43,990");
			}
			else if(c==2){
				System.out.println("2.HP Pavilion 11-u052TUx360 \n @Intel Pentium N3710 Processor \n @Windows 10 Home \n @4GB DDR3 RAM,500GB HDD \n @Intel HD Grapics 405 \n @Full size island style keyboard \n "
						+ "@29.5cm(11.6 inch)diagonal HD UWVA anti-glare WLED-backlit touch screen(1366x768)");
				System.out.println("EXTRA FEATURES \n >360 degree hinges \n >Touch Display \n >Audio by B&O Play \n #Big Sale EPP Price Rs.29,490");
			}
			else if(c==3){
				System.out.println("3.HP Pavilion 13-u131TUx360 \n @7th Generation Intel core i3-7100U Processor\n @Windows 10 Home \n @4GB DDR4 RAM,1TB HDD \n @Intel HD Grapics 620 \n @Full size island style backlit keyboard \n "
						+ "@33.8cm(13.3 inch)diagonal FHD IPS UWVA WLED-backlit multi-touch-enabled edge-to-edge glass(1920x1080)");
				System.out.println("**Preinstalled MS Office Home & Student 2016 LifeTime full version worth Rs.5,999 included**");
				System.out.println("EXTRA FEATURES \n >360 degree hinges \n >FHD Display \n >Audio by B&O Play \n#Big Sale EPP Price Rs.45,978");
			}
			}
		}
		else if(b==2){
			System.out.println("TYPES OF PRINTER \n 1.HP DeskJet Ink Advantage 4535 All-in-One \n 2.HP DeskJet Ink Advantage 3635 All-in-One \n 3.HP DeskJet Ink Advantage 3775 All-in-One");
			System.out.println("PRESS PRODUCT NO TO GET DETAILS ABOUT THAT PRODUCT");
			int d= a.nextInt();
			for(int k=3;k>=d;k--){
			if(d==1){
				System.out.println("1.HP DeskJet Ink Advantage 4535 All-in-One \n@Print,Scan,Copy(Part no.F0V64B) \n*Up to 9.5/6.8ppm A4/letter(ISO,black/color) \n"
						+ "*5.5cm(2.2inch)mono graphic touchscreen display");
				System.out.println("EXTRA FEATURES \n>Print \n>Wireless \n>Scan \n  #EPP Price Rs.6,699 | Big Sale Prce Rs.5,999");
			}
			else if(d==2){
				System.out.println("2.HP DeskJet Ink Advantage 3635 All-in-One \n@Print,Scan,Copy(Part no.F5S44B) \n*Up to 20/16ppm(Draft)|8.5/6(ISO,black/color) \n"
						+ "*1 Hi-Speed USB 2.0 \n*Up to 1,000 pages duty cycle");
				System.out.println("EXTRA FEATURES \n >Auto On/Off Technology \n >Wireless \n> E-Print \n  #EPP Price Rs.4,984 | Big Sale Prce Rs.4,784");
				
			}
			else if(d==3){
				System.out.println("3.HP DeskJet Ink Advantage 3775 All-in-One \n@Print,Scan,Copy,Photo(Part no.J9V87B) \n*Up to 8/5.5ppm(black/color)ISO \n"
						+ "*1 Hi-Speed USB 2.0 \n*Up to 1,000 pages duty cycle");
				System.out.println("EXTRA FEATURES \n >Wireless Direct \n >Wireless \n>Scan \n  ##EPP Price Rs.5,299 | Big Sale Prce Rs.4,999");
			}
			}
		}
		else if(b==3){
			System.out.println("TYPES OF DESKTOP  \n 1.HP Slimline 260-a041IN Desktop PC \n2.HP Pavilion Desktop-510-p053in \n3.HP Slimline 260-p021IN Desktop PC");
			System.out.println("PRESS PRODUCT NO TO GET DETAILS ABOUT THAT PRODUCT");
			int e=a.nextInt();
			for(int l=3;l>=e;l--)
			if(e==1){
				System.out.println("1.HP Slimline 260-a041IN Desktop PC \n*Intel Pentium J3710 Processor \n*Windows 10 Home \n*4GB RAM,1TB HDD \n*Intel HD Grapics 510 \n*HP 19ka 18.5-inch Mointor included \n#EPP Price Rs.27,590 | Big Sale Price Rs.25,590");
			
			}
			else if(e==2){
				System.out.println("2.HP Pavilion Desktop-510-p053in \n*6th Generation Intel Core i5-6400T Processor \n*Windows 10 Home \n*4GB DDR4 RAM,1TB HDD \n*Intel HD Graphics 530 \n*HP 19ka 18.5-inch Monitor included \n#EPP Price Rs.45,071 | Big Sale Price Rs.43,990");
				
			}
			else if(e==3){
				System.out.println("3.HP Slimline 260-p021IN Desktop PC \n*6th Generation Intel Core i3-6100T Processor \n*Windows 10 Home \n*4GB RAM,1TB HDD \n*Intel HD Graphics 530 \n*HP 19ka 18.5-inch Monitor included \n#EPP Price Rs.33,110 | Big Sale Price Rs.31,990");
			}
		}
		else if(b==4){
			System.out.println("TYPES OF TABLET \n1.HP Sream 8 Tablet Model No:5901tw \n2.HP Pro 610");
			System.out.println("PRESS PRODUCT NO TO GET DETAILS ABOUT THAT PRODUCT");
			int f=a.nextInt();
			for(int n=2;n>=f;n--)
			if(f==1){
				System.out.println("1.HP Sream 8 Tablet Model No:5901tw \n*Windows 8.1 \n*8-inch IPS Display \n*3G Connectivity \n*32GB Memory "
						+ "\n*Dual HD Camera \n#EPP Price Rs.10,000 | Big Sale Price Rs.9,750");
			     }
			else if(f==2){
				System.out.println("2.HP Pro 610 \n*Windows 8.1 \n*10.1-inch HD Display \n*Long Battery Life \n*32GB Memory "
						+ "\n*Dual HD Camera \n#EPP Price Rs.16,990 | Big Sale Price Rs.15,990");
			    }
	}
		else if(b==5){
			System.out.println("TYPES OF ACCESSORIES \n1.HP Roar Yellow Bluetooth Speaker \n2.HP External Portable USB 3.0 Hard Drive(1TB) \n3.HP 7600 Power Pack \n4.HP Z3700 Wireless MOUSE");
			System.out.println("PRESS PRODUCT NO TO GET DETAILS ABOUT THAT PRODUCT");
			int g=a.nextInt();
			for(int m=4;m>=g;m--)
			if(g==1){
				System.out.println("1.HP Roar Yellow Bluetooth Speaker \n*Part no.F6S95AA \n #Big Sale Price Rs.2,199");
			     }
			else if(g==2){
				System.out.println("2.HP External Portable USB 3.0 Hard Drive(1TB) \n*Part no.K6A93AA \n#Big Sale Price Rs.4,149");
			    }
			else if(g==3){
				System.out.println("3.HP 7600 Power Pack \n*Part no.T7U14AA \n#Big Sale Price Rs.1,299");
			    }
			else if(g==4){
				System.out.println("4.HP Z3700 Wireless MOUSE \n*Colors-Silver/Black/Blue/Red Mouse \n*Part no.X7Q44AA/VOL79AA/VOL81AA/VOL82AA \n#Big Sale Price Rs.1,199");
			    }
		}

}
}
}
