package scenariobasedpractice.railhailingapp;
/*
public class Main {
	public static void main(String[] args) {
		Suv suv = new Suv("MP 04 BH 3230","Himesh Kurmi","MP04CD2210",4.1f);
		Sedan car = new Sedan("MP 12 BH 3632","RAj","UP75FG1236",3.2f);
		suv.bookRide(5.5);
		suv.details();
		car.details();
	}
}

*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- SUV DETAILS --------
        System.out.println("Enter SUV details:");

        System.out.print("Vehicle Number: ");
        String suvVehicleNo = sc.nextLine();

        System.out.print("Driver Name: ");
        String suvDriverName = sc.nextLine();

        System.out.print("Driving License Number: ");
        String suvLicense = sc.nextLine();

        System.out.print("Driver Rating: ");
        float suvRating = sc.nextFloat();

        Suv suv = new Suv(suvVehicleNo, suvDriverName, suvLicense, suvRating);

        System.out.print("Enter distance for SUV ride (km): ");
        double suvDistance = sc.nextDouble();

        suv.bookRide(suvDistance);
        suv.details();

        sc.nextLine(); // clear buffer

        // -------- SEDAN DETAILS --------
        System.out.println("\nEnter Sedan details:");

        System.out.print("Vehicle Number: ");
        String sedanVehicleNo = sc.nextLine();

        System.out.print("Driver Name: ");
        String sedanDriverName = sc.nextLine();

        System.out.print("Driving License Number: ");
        String sedanLicense = sc.nextLine();

        System.out.print("Driver Rating: ");
        float sedanRating = sc.nextFloat();

        Sedan sedan = new Sedan(sedanVehicleNo, sedanDriverName, sedanLicense, sedanRating);

        System.out.println("\nSedan Details:");
        sedan.details();

        sc.close();
    }
}
