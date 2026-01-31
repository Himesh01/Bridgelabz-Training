package collectors.LibraryBookStatistics;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryStatistics {
    public static void main(String[] args) {
        List<Book> books = List.of(
            new Book("The Hobbit", "Fantasy", 310),
            new Book("Foundation", "Sci-Fi", 255),
            new Book("Dune", "Sci-Fi", 612),
            new Book("Harry Potter", "Fantasy", 309),
            new Book("The Alchemist", "Fiction", 167)
        );

        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
            .collect(Collectors.groupingBy(
                Book::getGenre,
                Collectors.summarizingInt(Book::getPages)
            ));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println(" - Total Pages: " + stats.getSum());
            System.out.println(" - Avg Pages:   " + stats.getAverage());
            System.out.println(" - Max Pages:   " + stats.getMax());
        });
    }
}
