package collectionsquestion.setinterface.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class PolicyManager {

    private HashSet<Policy> hashSet = new HashSet<>();
    private LinkedHashSet<Policy> linkedHashSet = new LinkedHashSet<>();

    private TreeSet<Policy> treeSet =new TreeSet<>(Comparator.comparing(Policy::getExpiryDate));

    public void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    public void showAllPolicies() {
        System.out.println("All Unique Policies (HashSet):");
        hashSet.forEach(System.out::println);
    }

    public void showExpiringSoon() {
        System.out.println("\nPolicies expiring in next 30 days:");
        LocalDate today = LocalDate.now();

        for (Policy p : hashSet) {
            long days = ChronoUnit.DAYS.between(today, p.getExpiryDate());
            if (days >= 0 && days <= 30) {
                System.out.println(p + " | Days left: " + days);
            }
        }
    }

    public void showByCoverage(String type) {
        System.out.println("\nPolicies of type: " + type);

        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    public void findDuplicates(List<Policy> list) {
        System.out.println("\nDuplicate Policy Numbers:");

        HashSet<String> seen = new HashSet<>();
        HashSet<String> dup = new HashSet<>();

        for (Policy p : list) {
            if (!seen.add(p.getPolicyNumber())) {
                dup.add(p.getPolicyNumber());
            }
        }

        System.out.println(dup.isEmpty() ? "No duplicates found." : dup);
    }

    public void comparePerformance(List<Policy> policies) {

        System.out.println("\n==== PERFORMANCE COMPARISON (ns) ====");

        long t1 = System.nanoTime();
        new HashSet<>(policies);
        long hashAdd = System.nanoTime() - t1;

        t1 = System.nanoTime();
        new LinkedHashSet<>(policies);
        long linkedAdd = System.nanoTime() - t1;

        t1 = System.nanoTime();
        TreeSet<Policy> t = new TreeSet<>(Comparator.comparing(Policy::getExpiryDate));
        t.addAll(policies);
        long treeAdd = System.nanoTime() - t1;

        System.out.println("Add Time:");
        System.out.println("HashSet      : " + hashAdd);
        System.out.println("LinkedHashSet: " + linkedAdd);
        System.out.println("TreeSet      : " + treeAdd);

        Policy key = policies.get(0);

        t1 = System.nanoTime();
        hashSet.contains(key);
        long hashSearch = System.nanoTime() - t1;

        t1 = System.nanoTime();
        linkedHashSet.contains(key);
        long linkedSearch = System.nanoTime() - t1;

        t1 = System.nanoTime();
        treeSet.contains(key);
        long treeSearch = System.nanoTime() - t1;

        System.out.println("\nSearch Time:");
        System.out.println("HashSet      : " + hashSearch);
        System.out.println("LinkedHashSet: " + linkedSearch);
        System.out.println("TreeSet      : " + treeSearch);
    }
}