package day1.TravelLog;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLogManager {

    private static final String FILE = "trips.dat";

    public static void main(String[] args) throws Exception {

        List<Trip> trips = new ArrayList<>();

        trips.add(new Trip("Paris", "France", 7, "Amazing Eiffel Tower experience"));
        trips.add(new Trip("Rome", "Italy", 4, "Colosseum and history walk"));
        trips.add(new Trip("Paris", "France", 3, "Food & culture"));
        trips.add(new Trip("Berlin", "Germany", 6, "Night life and museums"));
        trips.add(new Trip("Rome", "Italy", 8, "Ancient architecture"));

        saveTrips(trips);

        List<Trip> loadedTrips = loadTrips();

        System.out.println("\n All Trips:");
        loadedTrips.forEach(System.out::println);

        findCitiesUsingRegex(loadedTrips);

        printTripsLongerThan5Days(loadedTrips);

        printUniqueCountries(loadedTrips);

        printTop3Cities(loadedTrips);
    }

    private static void saveTrips(List<Trip> trips) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE));
        oos.writeObject(trips);
        oos.close();
        System.out.println(" Trips saved successfully.");
    }

    private static List<Trip> loadTrips() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE));
        List<Trip> trips = (List<Trip>) ois.readObject();
        ois.close();
        return trips;
    }

    private static void findCitiesUsingRegex(List<Trip> trips) {
        System.out.println("\n📍 Cities Extracted Using Regex:");
        Pattern p = Pattern.compile("\\b[A-Z][a-z]+\\b");

        for (Trip t : trips) {
            Matcher m = p.matcher(t.getNotes());
            while (m.find()) {
                System.out.println(m.group());
            }
        }
    }

    private static void printTripsLongerThan5Days(List<Trip> trips) {
        System.out.println("\n Trips Longer Than 5 Days:");
        trips.stream()
             .filter(t -> t.getDays() > 5)
             .forEach(System.out::println);
    }

    private static void printUniqueCountries(List<Trip> trips) {
        Set<String> countries = new HashSet<>();
        for (Trip t : trips) {
            countries.add(t.getCountry());
        }

        System.out.println("\n Unique Countries Visited:");
        countries.forEach(System.out::println);
    }

    private static void printTop3Cities(List<Trip> trips) {
        Map<String, Integer> cityCount = new HashMap<>();

        for (Trip t : trips) {
            cityCount.put(t.getCity(),
                    cityCount.getOrDefault(t.getCity(), 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(cityCount.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("\n Top 3 Most Visited Cities:");
        list.stream().limit(3)
            .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue() + " times"));
    }
}