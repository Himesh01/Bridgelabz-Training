package collectionsquestion.mapinterface.InsurancePolicyManagementSystem;

import java.time.LocalDate;

public class InsuranceSystemMain {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P101", "Himesh",
                LocalDate.now().plusDays(10), "Health", 5000));

        manager.addPolicy(new Policy("P102", "Nageshwar",
                LocalDate.now().plusDays(40), "Auto", 7000));

        manager.addPolicy(new Policy("P103", "Lucky",
                LocalDate.now().minusDays(5), "Home", 6000)); 

        manager.addPolicy(new Policy("P104", "Rajeev",
                LocalDate.now().plusDays(20), "Life", 8000));

        manager.displayAllMaps();

        manager.getPolicyByNumber("P102");

        manager.showExpiringSoon();

        manager.showPoliciesByHolder("Alice");

        manager.removeExpiredPolicies();

        System.out.println("\nAfter removing expired policies:");
        manager.displayAllMaps();
    }
}
