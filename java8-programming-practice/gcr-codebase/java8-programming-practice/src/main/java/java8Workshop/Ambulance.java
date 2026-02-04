package java8Workshop;

import java.time.LocalTime;

public class Ambulance implements TransportService, EmergencyService {

    private String route;
    private double fare;
    private LocalTime departure;

    public Ambulance(String route, double fare, LocalTime departure) {
        this.route = route;
        this.fare = fare;
        this.departure = departure;
    }

    public String getServiceName() { 
    	return "Ambulance";
    }
    public String getRoute() {
    	return route; 
    }
    public double getFare() {
    	return fare; 
    }
    public LocalTime getDepartureTime() { 
    	return departure;
    }
}
