package day2.DealTracker;

public class DealTrackerMain {

    public static void main(String[] args) throws Exception {

        DealTracker<String> tracker = new DealTracker<>();

        tracker.loadDeals("deals.txt");

        System.out.println("Valid Deals:");
        tracker.getAllDeals().values()
                .forEach(System.out::println);

        System.out.println("\nSorted By Discount:");
        tracker.sortByDiscountDesc()
                .forEach(System.out::println);
    }
}