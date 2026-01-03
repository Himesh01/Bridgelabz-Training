package scenariobasedpractice.railhailingapp;

public class Sedan extends Vehicle implements IRideService{
    double distance;
	public Sedan(String vehicleNo,String driverName,String licenseNo,float rating ) {
		super(driverName,licenseNo,rating,vehicleNo,8,"Sedan");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookRide(double distance) {
	    this.distance = distance;
	}

	@Override
	public void endRide() {
	  System.out.println("\n Total amount : "+(this.distance*500));
	  System.out.println("Thank you come again");
	}
    @Override
    public void details() {
	// TODO Auto-generated method stub
	super.details();
	System.out.println("Distance         : "+this.distance);
  }

}