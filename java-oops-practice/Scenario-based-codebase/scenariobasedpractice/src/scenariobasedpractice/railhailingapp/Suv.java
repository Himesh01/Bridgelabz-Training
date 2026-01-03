package scenariobasedpractice.railhailingapp;

public class Suv extends Vehicle implements IRideService{
    double distance;
	public Suv(String vehicleNo,String driverName,String licenseNo,float rating ) {
		super(driverName,licenseNo,rating,vehicleNo,8,"SUV");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookRide(double distance) {
	    this.distance = distance;
	}

	@Override
	public void endRide() {
	  System.out.println("\n Total amount : "+(this.distance*100));
	  System.out.println("Thank you come again");
	}
    @Override
    public void details() {
	// TODO Auto-generated method stub
	super.details();
	System.out.println("Distance         : "+this.distance);
  }
}