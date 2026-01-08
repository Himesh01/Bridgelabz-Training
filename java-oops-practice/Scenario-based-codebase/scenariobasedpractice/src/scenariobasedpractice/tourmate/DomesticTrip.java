package scenariobasedpractice.tourmate;

import java.util.*;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration, Transport transport,
                        Hotel hotel, List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    @Override
    public void book() {
        System.out.println("Booking domestic trip to " + destination);
    }

    @Override
    public void cancel() {
        System.out.println("Domestic trip canceled");
    }
}
