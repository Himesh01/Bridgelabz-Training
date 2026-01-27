package day2.SongVault;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class SongVault {

    private final List<Song> songs = new ArrayList<>();

    public void loadSongsFromFolder(String folderPath) throws IOException {

        File folder = new File(folderPath);
        for (File file : Objects.requireNonNull(folder.listFiles())) {

            if (file.getName().endsWith(".txt")) {
                songs.add(SongParser.parseSongFile(file));
            }
        }
    }

    public Map<String, List<Song>> groupByGenre() {
        return songs.stream()
                .collect(Collectors.groupingBy(Song::getGenre));
    }

    public Set<String> getUniqueArtists() {
        return songs.stream()
                .map(Song::getArtist)
                .collect(Collectors.toSet());
    }

    public List<Song> filterByArtist(String artist) {
        return songs.stream()
                .filter(s -> s.getArtist().equalsIgnoreCase(artist))
                .collect(Collectors.toList());
    }

    public List<Song> sortByTitle() {
        return songs.stream()
                .sorted(Comparator.comparing(Song::getTitle))
                .collect(Collectors.toList());
    }

    public List<Song> getAllSongs() {
        return songs;
    }
}