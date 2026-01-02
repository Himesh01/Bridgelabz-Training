package com.bridgelabz.oops.encapsulation.ridehailing;

public class Auto extends Vehicle implements GPS{
	  private String location;
		public Auto(long vehicleId, String driverName, double ratePerKm,String location) {
			super(vehicleId, driverName, ratePerKm);
			this.location = location;
		}

		@Override
		public void getCurrentLocation() {
		   System.out.println("Current location : "+this.location);
		}

		@Override
		public void updateLocation(String location) {
		   this.location = location;
		}

		@Override
		public void calculateFare(double distance) {
			System.out.println("Total amount : "+(distance*this.ratePerKm));
		}

}
