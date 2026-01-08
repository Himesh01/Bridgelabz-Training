package scenariobasedpractice.tourmate;

public class Transport {
    private double cost;

    public Transport(double cost) {
        this.cost = cost;
    }

    double getCost() {   // package-private
        return cost;
    }
}
