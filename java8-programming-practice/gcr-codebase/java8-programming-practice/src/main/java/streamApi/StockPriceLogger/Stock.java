package streamApi.StockPriceLogger;

public class Stock {
    private String ticker;
    private double price;

    public Stock(String ticker, double price) {
        this.ticker = ticker;
        this.price = price;
    }

    public String getTicker() { return ticker; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return String.format("Stock Update -> %-5s: $%.2f", ticker, price);
    }
}
