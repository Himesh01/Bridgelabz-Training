package scenariobasedpractice.eventease;

public class EventEaseDemo {
    public static void main(String[] args) {

        User organizer = new User("Himesh", "himesh@eventease.com");

        Event birthday = new BirthdayEvent(
                101, "Himesh's Birthday", "Banquet Hall",
                "10-08-2026", 50, organizer,
                20000, 8000
        );

        Event conference = new ConferenceEvent(
                201, "TIT college", "Auditorium hall",
                "20-09-2026", 300, organizer,
                80000, 25000
        );

        birthday.schedule();
        System.out.println("Total Cost: ₹" + birthday.calculateTotalCost());

        conference.schedule();
        System.out.println("Total Cost: ₹" + conference.calculateTotalCost());
    }
}

