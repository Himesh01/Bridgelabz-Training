package streamApi.StockPriceLogger;

import java.util.List;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<Stock> stockFeed = List.of(
            new Stock("SWI", 185.50),
            new Stock("FLI", 142.10),
            new Stock("HAG", 210.35),
            new Stock("AMZN", 175.05),
            new Stock("VAST", 402.15)
        );

        System.out.println("--- Live Stock Feed Started ---");

        stockFeed.stream()
            .forEach(stock -> System.out.println(stock));
            
    }
}
