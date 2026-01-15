package scenariobasedpractice.BirdSanctuary;
import java.util.*;

class BirdSanctuary {

    private List<Bird> birds = new ArrayList<>();

    // Add bird
    public void addBird(Bird bird) {
        birds.add(bird);
    }

    // Display all birds
    public void displayAllBirds() {
        for (Bird b : birds) {
            b.displayInfo();
            if (b instanceof Flyable) ((Flyable) b).fly();
            if (b instanceof Swimmable) ((Swimmable) b).swim();
            System.out.println();
        }
    }

    // Search flying birds
    public void displayFlyingBirds() {
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                b.displayInfo();
                ((Flyable) b).fly();
            }
        }
    }

    // Search swimming birds
    public void displaySwimmingBirds() {
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                b.displayInfo();
                ((Swimmable) b).swim();
            }
        }
    }

    // Remove bird by ID
    public void removeBirdById(int id) {
        birds.removeIf(b -> b.getId() == id);
    }

    // Sanctuary report
    public void generateReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("\n--- Sanctuary Report ---");
        System.out.println("Flyable Birds: " + fly);
        System.out.println("Swimmable Birds: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }
}
