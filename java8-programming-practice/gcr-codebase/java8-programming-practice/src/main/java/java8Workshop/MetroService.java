package java8Workshop;

import java.time.LocalTime;

public class MetroService implements TransportService {

    private String route;
    private double fare;
    private LocalTime departure;

    public MetroService(String route, double fare, LocalTime departure) {
        this.route = route;
        this.fare = fare;
        this.departure = departure;
    }

    public String getServiceName() {
    	return "Metro";
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
