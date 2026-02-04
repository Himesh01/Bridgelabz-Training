package java8Workshop;
import java.time.LocalTime;

public class BusService implements TransportService {

    private String route;
    private double fare;
    private LocalTime departure;

    public BusService(String route, double fare,
                      LocalTime departure) {
        this.route = route;
        this.fare = fare;
        this.departure = departure;
    }

    public String getServiceName() { return "Bus"; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public LocalTime getDepartureTime() { return departure; }
}
