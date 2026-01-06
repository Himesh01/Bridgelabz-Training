package scenariobasedpractice.eventease;

class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String eventName, String location,
                            String date, int attendees, User organizer,
                            double venueCost, double serviceCost) {
        super(eventId, eventName, location, date, attendees,
              organizer, venueCost, serviceCost, 1000); // higher discount
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with technical setup & seating.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled. Vendors notified.");
    }
}
