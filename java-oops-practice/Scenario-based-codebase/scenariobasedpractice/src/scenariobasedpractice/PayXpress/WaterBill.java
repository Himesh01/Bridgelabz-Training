package scenariobasedpractice.PayXpress;

import java.time.LocalDate;

public class WaterBill extends Bill{
	public WaterBill(double amount, LocalDate dueDate) {
		super("Water", amount, dueDate);
	}

	@Override
	public void sendReminder() {
		if (!isPaid()) {
			System.out.println("💧 Water Bill Reminder: Ensure uninterrupted water supply.");
		}
	}
}