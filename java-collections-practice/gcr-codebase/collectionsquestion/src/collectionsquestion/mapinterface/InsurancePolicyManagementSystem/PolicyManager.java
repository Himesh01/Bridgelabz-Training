package collectionsquestion.mapinterface.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class PolicyManager {

    private HashMap<String, Policy> hashMap = new HashMap<>();

    private LinkedHashMap<String, Policy> linkedHashMap = new LinkedHashMap<>();

    private TreeMap<LocalDate, Policy> treeMap = new TreeMap<>();

    public void addPolicy(Policy p) {
        hashMap.put(p.getPolicyNumber(), p);
        linkedHashMap.put(p.getPolicyNumber(), p);
        treeMap.put(p.getExpiryDate(), p);
    }

    public void getPolicyByNumber(String policyNo) {
        System.out.println("\nSearching for Policy: " + policyNo);

        Policy p = hashMap.get(policyNo);

        if (p == null)
            System.out.println("Policy not found!");
        else
            System.out.println(p);
    }

    public void showExpiringSoon() {
        System.out.println("\nPolicies expiring within 30 days:");

        LocalDate today = LocalDate.now();

        for (Policy p : hashMap.values()) {
            long days = ChronoUnit.DAYS.between(today, p.getExpiryDate());
            if (days >= 0 && days <= 30) {
                System.out.println(p + " | Days left: " + days);
            }
        }
    }
    public void showPoliciesByHolder(String name) {
        System.out.println("\nPolicies of holder: " + name);

        for (Policy p : hashMap.values()) {
            if (p.getPolicyHolder().equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    public void removeExpiredPolicies() {
        System.out.println("\nRemoving expired policies...");

        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<String, Policy>> it = hashMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Policy> entry = it.next();
            if (entry.getValue().getExpiryDate().isBefore(today)) {
                it.remove();  
            }
        }

        System.out.println("Expired policies removed.");
    }

    public void displayAllMaps() {

        System.out.println("\nHashMap (random order):");
        hashMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        System.out.println("\nLinkedHashMap (insertion order):");
        linkedHashMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        System.out.println("\nTreeMap (sorted by expiry date):");
        treeMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}