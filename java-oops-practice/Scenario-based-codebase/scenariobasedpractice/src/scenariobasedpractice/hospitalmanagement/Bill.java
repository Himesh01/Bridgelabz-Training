package scenariobasedpractice.hospitalmanagement;

public class Bill implements Payable{
	private Patient patient;
    private double baseCharge;
    private double taxRate = 0.12; // 12%

    public Bill(Patient patient, double baseCharge) {
        this.patient = patient;
        this.baseCharge = baseCharge;
    }

    @Override
    public double calculatePayment() {
        // Simple logic: base + tax
        return baseCharge + (baseCharge * taxRate);
    }

    public void printInvoice() {
        System.out.println("\n--- INVOICE ---");
        System.out.println("Patient: " + patient.getName());
        System.out.println("Total Due: $" + calculatePayment());
    }
}