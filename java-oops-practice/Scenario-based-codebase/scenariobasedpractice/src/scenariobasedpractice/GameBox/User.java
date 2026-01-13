package scenariobasedpractice.GameBox;
import java.util.*;

public class User {
    private String username;
    private List<Game> ownedGames;

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    // Encapsulation: controlled game ownership
    public void purchaseGame(Game game) {
        ownedGames.add(game);
        System.out.println(username + " purchased " + game.title);
    }

    public void showLibrary() {
        System.out.println("\n🎮 " + username + "'s Game Library:");
        for (Game game : ownedGames) {
            System.out.println("- " + game.title + " (" + game.genre + ")");
        }
    }
}
