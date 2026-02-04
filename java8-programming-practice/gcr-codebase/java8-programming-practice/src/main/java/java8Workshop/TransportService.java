package java8Workshop;

import java.time.LocalTime;

public interface TransportService {

	String getServiceName();
    String getRoute();
    double getFare();
    LocalTime getDepartureTime();

    //this method is default method
    default void printServiceDetails() {
    	System.out.println("Service: " + getServiceName() +
    			" | Route: " + getRoute() +
    			" | Fare: " + getFare() +
    			" | Departure: " + getDepartureTime());
   	}
}
