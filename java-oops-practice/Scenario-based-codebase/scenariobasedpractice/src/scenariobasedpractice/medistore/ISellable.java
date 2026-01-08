package scenariobasedpractice.medistore;

import java.time.LocalDate;

public interface ISellable {
	public boolean checkExpiry(LocalDate date);
	
	public void sell(int quantity);
}