package scenariobasedpractice.GameBox;

public abstract class Game implements IDownloadable {
    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    // Constructor for paid games
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Constructor for free games
    public Game(String title, String genre, double rating) {
        this(title, genre, 0.0, rating);
    }

    // Operator usage: seasonal discount
    public void applySeasonalOffer(double discountPercent) {
        price = price - (price * discountPercent / 100);
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully.");
    }

    public abstract void playDemo(); // Polymorphism
}
