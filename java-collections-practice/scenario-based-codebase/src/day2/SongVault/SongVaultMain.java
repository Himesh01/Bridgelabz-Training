package day2.SongVault;
public class SongVaultMain {

    public static void main(String[] args) throws Exception {

        SongVault vault = new SongVault();
        vault.loadSongsFromFolder("songs");

        System.out.println("All Songs:");
        vault.getAllSongs().forEach(System.out::println);

        System.out.println("\nGrouped By Genre:");
        vault.groupByGenre().forEach((g, s) -> {
            System.out.println(g + " -> " + s);
        });

        System.out.println("\nUnique Artists:");
        vault.getUniqueArtists().forEach(System.out::println);

        System.out.println("\nSorted Songs:");
        vault.sortByTitle().forEach(System.out::println);
    }
}