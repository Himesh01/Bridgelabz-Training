package com.TreeGraph.GamingApp;

public class Main {
 
    public static void main(String[] args) {

    	GamingApp leaderboard = new GamingApp();

        leaderboard.insertOrUpdate(new Player("Nageshwar", 1200));
        leaderboard.insertOrUpdate(new Player("Lucky", 1500));
        leaderboard.insertOrUpdate(new Player("Himesh", 900));
        leaderboard.insertOrUpdate(new Player("Rajeev", 1800));
        leaderboard.insertOrUpdate(new Player("Raj", 1100));

        leaderboard.displayTopPlayers(10);

        System.out.println("\nRemoving player with 1200 points");
        leaderboard.remove(1200);

        leaderboard.displayTopPlayers(10);
    }
}