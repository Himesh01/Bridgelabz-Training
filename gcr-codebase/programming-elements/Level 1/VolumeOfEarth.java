public class VolumeOfEarth{
	public static void main(String[]args){
	int radiusInKm =6378;
	double radiusInMiles =6378*1.6;
	final double pi= 3.14;
	double volumeInKm = (4.0/3.0) * pi * radiusInKm * radiusInKm * radiusInKm;
	double volumeInMiles = (4.0/3.0) * pi * radiusInMiles * radiusInMiles * radiusInMiles;
	System.out.println("The volume of earth in cubic kilometers is "+volumeInKm+" and cubic miles is " + volumeInMiles );
	}
}
	
	