package com.kop.enumeration;

public class ProductsPrice {
     public enum SuperMarket{
    	 Soap(10) {
			@Override
			int assessweight() {
				// TODO Auto-generated method stub
				return 0;
			}
		},ToothPaste(15) {
			@Override
			int assessweight() {
				// TODO Auto-generated method stub
				return 10;
			}
		},CoolDrinks(20) {
			@Override
			int assessweight() {
				// TODO Auto-generated method stub
				return 0;
			}
		},Shampoo(56) {
			@Override
			int assessweight() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
    	 int productprice,SoapPrice;
    	 SuperMarket(int price){
    		 this.productprice=price;
    	 }
     SuperMarket(){
    	 
     }
     int getPrice(){
    	 return productprice;
     }
     abstract int assessweight();
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMarket product1=SuperMarket.Soap;
		SuperMarket product2=SuperMarket.ToothPaste;
		System.out.println(product1);
		System.out.println(product2);
		SuperMarket []s=SuperMarket.values();
		for(SuperMarket ProductName:s){
			System.out.println(ProductName.name()+":"+ProductName.getPrice());
			System.out.println(ProductName.name()+":"+ProductName.assessweight());
		}
		
     ProductsPrice f=new ProductsPrice();
    System.out.println(f);

}
}
