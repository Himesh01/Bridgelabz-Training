package scenariobasedpractice.tourmate;

import java.util.Arrays;

public class TourMateApp {
    public static void main(String[] args) {

        Transport transport = new Transport(5000);
        Hotel hotel = new Hotel(8000);
        Activity a1 = new Activity(2000);
        Activity a2 = new Activity(1500);

        Trip trip = new InternationalTrip(
                "Paris",
                7,
                transport,
                hotel,
                Arrays.asList(a1, a2)
        );

        trip.book();
        System.out.println("Total Budget: " + trip.getBudget());
        trip.cancel();
    }
}
