package day2.SongVault;

import java.io.*;
import java.util.regex.*;

public class SongParser {

    private static final Pattern TITLE = Pattern.compile("Title:\\s*(.*)");
    private static final Pattern ARTIST = Pattern.compile("Artist:\\s*(.*)");
    private static final Pattern DURATION = Pattern.compile("Duration:\\s*(.*)");
    private static final Pattern GENRE = Pattern.compile("Genre:\\s*(.*)");

    public static Song parseSongFile(File file) throws IOException {

        String title = "", artist = "", duration = "", genre = "";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {

                if (TITLE.matcher(line).matches())
                    title = TITLE.matcher(line).replaceAll("$1");

                else if (ARTIST.matcher(line).matches())
                    artist = ARTIST.matcher(line).replaceAll("$1");

                else if (DURATION.matcher(line).matches())
                    duration = DURATION.matcher(line).replaceAll("$1");

                else if (GENRE.matcher(line).matches())
                    genre = GENRE.matcher(line).replaceAll("$1");
            }
        }
        return new Song(title, artist, duration, genre);
    }
}