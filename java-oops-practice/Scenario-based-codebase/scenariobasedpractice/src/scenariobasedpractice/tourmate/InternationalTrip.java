package scenariobasedpractice.tourmate;
import java.util.*;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration, Transport transport,
                             Hotel hotel, List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    @Override
    public void book() {
        System.out.println("Booking international trip with visa and insurance");
    }

    @Override
    public void cancel() {
        System.out.println("International trip canceled with refund policy");
    }
}
