package streamApi.EmailNotification;

import java.util.List;

public class NotificationService {
    public static void main(String[] args) {
        List<User> users = List.of(
            new User("himesh@example.com"),
            new User("yash@system.org"),
            new User("virat123@webmail.com")
        );

        users.forEach(user -> sendEmailNotification(user.getEmail()));
    }

    private static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }
}
