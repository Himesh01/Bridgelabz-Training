package scenariobasedpractice.AddressBook;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Address address;

    public Contact(String firstName, String lastName, String phoneNumber, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setEmail(String email) { this.email = email; }
    public Address getAddress() { return address; }

    @Override
    public String toString() {
        return String.format("Name: %s %s | Phone: %s | Email: %s | Address: [%s]", 
                             firstName, lastName, phoneNumber, email, address);
    }
}
