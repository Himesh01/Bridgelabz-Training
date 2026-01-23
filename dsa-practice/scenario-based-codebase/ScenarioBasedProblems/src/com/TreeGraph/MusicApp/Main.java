package com.TreeGraph.MusicApp;

public class Main {
	
    public static void main(String[] args) {

        MusicBST library = new MusicBST();

        library.insert(new Music(101, "Believer"));
        library.insert(new Music(105, "Closer"));
        library.insert(new Music(103, "Animals"));
        library.insert(new Music(102, "Despacito"));
        library.insert(new Music(104, "Shape of You"));

        library.displaySorted();

        System.out.println("\n🔍 Searching for Track ID 102:");
        Music song = library.search(102);
        System.out.println(song != null ? song : "Song not found");
    }
}