package scenariobasedpractice.AddressBook;

public class Main {

    public static void main(String[] args) {
        AddressBook myBook = new AddressBook();

        Address addr1 = new Address("Sagar", "Madhya pradesh", "400001");
        Contact c1 = new Contact("Himesh", "Kurmi", "9876543210", "himesh@email.com", addr1);
        
        Address addr2 = new Address("Katni", "Madhya pradesh", "462022");
        Contact c2 = new Contact("Nag", "Patel", "9123456789", "nag@email.com", addr2);

        myBook.addContact(c1);
        myBook.addContact(c2);

        System.out.println("--- All Contacts (Sorted) ---");
        myBook.displaySorted();

        System.out.println("\n--- Searching for Maharashtra ---");
        myBook.searchByLocation("Madhya pradesh");

        System.out.println("\n--- Editing Himesh Kurmi ---");
        myBook.editContact("Himesh", "Kurmi", "0000000000", "himesh_new@email.com");
        myBook.displaySorted();
    }
}
