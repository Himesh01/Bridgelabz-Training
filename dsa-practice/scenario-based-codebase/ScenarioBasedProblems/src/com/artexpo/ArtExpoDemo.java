package com.artexpo;

import java.time.LocalDateTime;

public class ArtExpoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Artist[] artists = {new Artist("Ravi", "2026-01-17T11:43"), new Artist("Ashish", "2026-01-04T15:13"), new Artist("Swaraj", "2025-12-27T09:30"), new Artist("Shriyansh", "2025-12-31T19:33")};
		InsertionSort.insertionSort(artists);
		
		System.out.println("Artists Sort by Registration Time......");
		for(Artist artist: artists)
			System.out.println(artist.name + " - " + artist.registrationTime);
	}

}