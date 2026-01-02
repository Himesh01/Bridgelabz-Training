package scenariobasedpractice.hospitalmanagement;

public class HospitalManagementSystem {
public static void main(String[] args) {
        
        Doctor drSmith = new Doctor("Himesh", "Orthopedist");

        
        Patient p1 = new InPatient("P001", "Raj", 101); 
        Patient p2 = new OutPatient("P002", "nitin", "10:30 AM");  

        
        drSmith.assignPatient(p1);
        drSmith.assignPatient(p2);

        
        drSmith.showMySchedule();

        
        Bill aliceBill = new Bill(p1, 1500.0);
        aliceBill.printInvoice();

        
        System.out.println("\nMedical Log Access:");
        System.out.println(p2.getSummary());
    }
}
