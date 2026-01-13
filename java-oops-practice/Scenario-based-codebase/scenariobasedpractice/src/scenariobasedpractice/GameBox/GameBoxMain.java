package scenariobasedpractice.GameBox;

public class GameBoxMain {
    public static void main(String[] args) {

        Game g1 = new ArcadeGame("Speed Rush", 299, 4.5);
        Game g2 = new StrategyGame("Empire Builder", 499, 4.7);
        Game g3 = new ArcadeGame("Pixel Jump", 4.2);

        g1.applySeasonalOffer(20);
        g2.applySeasonalOffer(10);

        User user = new User("Himesh");

        user.purchaseGame(g1);
        user.purchaseGame(g3);

        g1.download();
        g1.playDemo();
        g2.playDemo();

        user.showLibrary();
    }
}
