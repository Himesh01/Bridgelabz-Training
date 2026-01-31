package streamApi.TrendingMovie;
import java.util.*;
public class TopFiveMovies {
	public static void main(String[] args) {
		List<Movie> movies = List.of(new Movie("Khatarnak khiladi",9.3,2014),
									new Movie("Dangerous khiladi",9.2,2015),
									new Movie("Khiladi no.1",9.1,2009),
									new Movie("Batting Raja",9.0,2011),
									new Movie("Bahubali",9.9,2016)
									);
		
		movies.stream().sorted(
				Comparator.comparingDouble((Movie m) -> m.getRating()).reversed()
		.thenComparingInt((Movie m) -> m.getReleaseYear()).reversed()).limit(5).forEach(System.out::println);
	}
}
