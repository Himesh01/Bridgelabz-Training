package day2.SongVault;

public class Song extends Media<String> {

    private final String title;
    private final String artist;
    private final String duration;
    private final String genre;

    public Song(String title, String artist, String duration, String genre) {
        super("AUDIO");
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getDuration() { return duration; }
    public String getGenre() { return genre; }

    @Override
    public String toString() {
        return title + " | " + artist + " | " + duration + " | " + genre;
    }
}