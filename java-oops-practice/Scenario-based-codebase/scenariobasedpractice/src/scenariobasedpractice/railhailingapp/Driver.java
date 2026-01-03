package scenariobasedpractice.railhailingapp;

public class Driver {
	 String driverName;
	 String licenseNo;
	 float rating;
	 public Driver(String driverName,String licenseNo,float rating) {
		 // TODO Auto-generated constructor stub
		 this.driverName = driverName;
		 this.licenseNo = licenseNo;
		 this.rating = rating;
	 }
	 public void details() {
		 System.out.println("\n --------Vehicle Details----------");
		 System.out.println("Driver Name      : "+this.driverName);
		 System.out.println("License No       : "+this.licenseNo);
		 System.out.println("Rating           : "+this.rating);
	 }
}
