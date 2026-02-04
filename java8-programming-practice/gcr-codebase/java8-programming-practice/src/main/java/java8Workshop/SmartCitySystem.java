package java8Workshop;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class SmartCitySystem {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService("A1", 20, LocalTime.of(10, 30)),
                new MetroService("A1", 30, LocalTime.of(10, 15)),
                new TaxiService("B2", 100, LocalTime.of(10, 45)),
                new Ambulance("Emergency", 0, LocalTime.now())
        );

        // 1️ Lambda - Filter & Sort by earliest departure
        System.out.println("Sorted by Earliest Departure:");
        services.stream()
                .sorted(Comparator.comparing(
                        TransportService::getDepartureTime))
                .forEach(TransportService::printServiceDetails);

        // 2️ Filter the lowest fare
        System.out.println("\nLowest Fare:");
        services.stream()
                .min(Comparator.comparing(
                        TransportService::getFare))
                .ifPresent(TransportService::printServiceDetails);

        // 3️ Detect an Emergency Services
        System.out.println("\nEmergency Priority:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s ->
                        System.out.println("Priority: " + s.getServiceName()));

        // 4️ Reports of Passenger Revenue
        List<Passenger> passengers = Arrays.asList(
                new Passenger("Himesh", "A1", 20, true),
                new Passenger("Nageshwar", "A1", 30, false),
                new Passenger("Lucky", "B2", 100, true)
        );

        // groupingBy route
        Map<String, List<Passenger>> grouped =
                passengers.stream()
                        .collect(Collectors.groupingBy(
                                Passenger::getRoute));

        System.out.println("\nPassengers Grouped by Route:");
        grouped.forEach((route, list) ->
                System.out.println(route + " -> " + list.size()));

        // partitioningBy peakTime
        Map<Boolean, List<Passenger>> peakPartition =
                passengers.stream()
                        .collect(Collectors.partitioningBy(
                                Passenger::isPeakTime));

        System.out.println("\nPeak Time Trips: "
                + peakPartition.get(true).size());

        DoubleSummaryStatistics stats =
                passengers.stream()
                        .collect(Collectors.summarizingDouble(
                                Passenger::getFare));

        System.out.println("\nRevenue Report:");
        System.out.println("Total: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());

        // 5️ Functional Interface with Lambda
        FareCalculator calculator =
                (distance, rate) -> distance * rate;

        double distance =
                GeoUtils.calculateDistance(0,0,3,4);

        double fare = calculator.calculateFare(distance, 5);

        System.out.println("\nCalculated Fare: " + fare);
    }
}
