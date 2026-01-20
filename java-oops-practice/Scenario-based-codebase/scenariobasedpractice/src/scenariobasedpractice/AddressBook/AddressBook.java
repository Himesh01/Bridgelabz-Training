package scenariobasedpractice.AddressBook;

import java.util.*;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public boolean addContact(Contact newContact) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(newContact.getFirstName()) && 
                c.getLastName().equalsIgnoreCase(newContact.getLastName())) {
                return false; // Duplicate found
            }
        }
        contacts.add(newContact);
        return true;
    }

    public boolean editContact(String firstName, String lastName, String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName) && c.getLastName().equalsIgnoreCase(lastName)) {
                c.setPhoneNumber(newPhone);
                c.setEmail(newEmail);
                return true;
            }
        }
        return false;
    }

    public boolean deleteContact(String firstName, String lastName) {
        return contacts.removeIf(c -> c.getFirstName().equalsIgnoreCase(firstName) && 
                                     c.getLastName().equalsIgnoreCase(lastName));
    }

    public void searchByLocation(String location) {
        contacts.stream()
            .filter(c -> c.getAddress().getCity().equalsIgnoreCase(location) || 
                         c.getAddress().getState().equalsIgnoreCase(location))
            .forEach(System.out::println);
    }

    public void displaySorted() {
        contacts.sort(Comparator.comparing(Contact::getFirstName));
        contacts.forEach(System.out::println);
    }
}
