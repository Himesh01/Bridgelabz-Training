package scenariobasedpractice.railhailingapp;

public class Vehicle extends Driver{
	 String vehicleNo;
    int seatCapacity;
    String type;
    public Vehicle(String driverName, String licenseNo, float rating,String vehicleNo,int seatCapacity,String type ) {
		super(driverName, licenseNo, rating);
		this.vehicleNo = vehicleNo;
		this.seatCapacity =seatCapacity;
		this.type = type;
	}

	
	@Override
   public void details() {
		super.details();
   	System.out.println("Vehicle Number   : "+this.vehicleNo);
   	System.out.println("Seating Capacity : "+this.seatCapacity);
   	System.out.println("Vehicle Type     : "+this.type);
   }
}