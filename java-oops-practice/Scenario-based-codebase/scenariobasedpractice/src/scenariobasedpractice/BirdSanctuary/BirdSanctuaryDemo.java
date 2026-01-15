package scenariobasedpractice.BirdSanctuary;

public class BirdSanctuaryDemo {

    public static void main(String[] args) {

        BirdSanctuary sanctuary = new BirdSanctuary();

        sanctuary.addBird(new Eagle("Rocky", 1));
        sanctuary.addBird(new Duck("Daisy", 2));
        sanctuary.addBird(new Penguin("Pingu", 3));
        sanctuary.addBird(new Ostrich("Ozzy", 4));

        sanctuary.displayAllBirds();
        sanctuary.generateReport();
    }
}
