package scenariobasedpractice.eventease;

class BirthdayEvent extends Event {

    public BirthdayEvent(int eventId, String eventName, String location,
                          String date, int attendees, User organizer,
                          double venueCost, double serviceCost) {
        super(eventId, eventName, location, date, attendees,
              organizer, venueCost, serviceCost, 500); // flat discount
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event scheduled with fun decorations 🎉");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday Event cancelled.");
    }
}
