package scenariobasedpractice.eventease;

abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    // eventId should not be editable once assigned
    private final int eventId;

    // Encapsulated pricing details
    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    // Constructor without services
    public Event(int eventId, String eventName, String location,
                 String date, int attendees, User organizer, double venueCost) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = venueCost;
        this.serviceCost = 0;
        this.discount = 0;
    }

    // Constructor with catering/decoration services
    public Event(int eventId, String eventName, String location,
                 String date, int attendees, User organizer,
                 double venueCost, double serviceCost, double discount) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }
}

