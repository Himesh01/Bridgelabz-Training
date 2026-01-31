package streamApi.EventAttendee;

import java.util.List;

public class EventWelcome {
    public static void main(String[] args) {
        List<Attendee> attendees = List.of(
            new Attendee("Himesh kurmi"),
            new Attendee("Rajeev Kurmi"),
            new Attendee("Raj Patidar"),
            new Attendee("Lucky Pal")
        );

        attendees.stream()
            .forEach(attendee -> System.out.println("Welcome to the event, " + attendee.getName() + "!"));
    }
}
