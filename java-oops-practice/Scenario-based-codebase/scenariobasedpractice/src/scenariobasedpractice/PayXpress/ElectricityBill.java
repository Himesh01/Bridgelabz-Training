package scenariobasedpractice.PayXpress;

import java.time.LocalDate;

public class ElectricityBill extends Bill{
	
	public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            System.out.println("Electricity Bill Reminder: Pay before power disconnection!");
        }
    }
}