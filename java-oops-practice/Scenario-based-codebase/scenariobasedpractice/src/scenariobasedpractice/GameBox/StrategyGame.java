package scenariobasedpractice.GameBox;

public class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    public StrategyGame(String title, double rating) {
        super(title, "Strategy", rating);
    }

    @Override
    public void playDemo() {
        System.out.println("Playing strategic tutorial demo of " + title);
    }
}
