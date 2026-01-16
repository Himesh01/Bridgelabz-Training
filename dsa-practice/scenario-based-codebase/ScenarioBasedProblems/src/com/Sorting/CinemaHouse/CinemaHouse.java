package com.Sorting.CinemaHouse;

public class CinemaHouse {

    public static void main(String[] args) {
    	
        Movie[] schedule = {
            new Movie("Police wala gunda", 1830),
            new Movie("Batting Raja", 1400),
            new Movie("The Super Khiladi", 1100),
            new Movie("Meri Taqat mera Failsa", 2100),
            new Movie("Dangerous Khiladi", 1030)
        };

        System.out.println("--- Original Schedule ---");
        printSchedule(schedule);

        bubbleSortMovies(schedule);

        System.out.println("\n--- Sorted Schedule (Chronological) ---");
        printSchedule(schedule);
    }

    public static void bubbleSortMovies(Movie[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
            	
                if (array[j].showTime > array[j + 1].showTime) {
                 
                    Movie temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printSchedule(Movie[] array) {
        for (Movie movie : array) {
            System.out.println(movie);
        }
    }
}
