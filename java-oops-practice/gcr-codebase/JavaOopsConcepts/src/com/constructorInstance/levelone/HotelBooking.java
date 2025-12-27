package com.constructorInstance.levelone;

public class HotelBooking {

     String customerName;
     String roomType;
     int nights;
     
     public HotelBooking() {
    	 this("xys","normal",1);
     }
     
     public HotelBooking(String customerName,String roomType,int nights) {
    	 this.customerName = customerName;
    	 this.roomType = roomType;
    	 this.nights = nights;
     }
     
     public HotelBooking(HotelBooking h) {
    	 this.customerName = h.customerName;
    	 this.roomType = h.roomType;
    	 this.nights = h.nights;
     }
     
     public void increaseNight(int n) {
    	 this.nights+=n;
     }
     public void bill() {
    	 int amount = this.nights*700;
    	 
    	 System.out.println("The Total amount is : "+amount);
     }
     public static void main(String[] args) {
    	 HotelBooking h = new HotelBooking();
    	 HotelBooking h1 = new HotelBooking("Lucky","delux",3);
    	 
    	 h1.bill();
    	 
    	 h1.increaseNight(4);
    	 
    	 System.out.println(h1.customerName);
    	 System.out.println(h1.roomType);
    	 System.out.println(h1.nights);
    	 
    	 h1.bill();
     }
}
