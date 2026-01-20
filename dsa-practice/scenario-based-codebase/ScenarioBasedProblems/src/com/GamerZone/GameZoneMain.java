package com.GamerZone;

public class GameZoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player[] players = {new Player("Himesh", 34.9), new Player("Nageshwar", 67.3), new Player("Lucky", 24.1)};
		QuickSort.quickSort(players, 0, players.length-1);
		
		for(Player player: players) {
			System.out.println(player.playerName + " - " + player.score);
		}
	}

}