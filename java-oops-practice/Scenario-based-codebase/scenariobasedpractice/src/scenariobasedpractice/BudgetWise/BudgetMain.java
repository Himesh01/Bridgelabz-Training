package scenariobasedpractice.BudgetWise;
import java.util.*;

public class BudgetMain {
    public static void main(String[] args) {

        Map<String, Double> categories = new HashMap<>();
        categories.put("Food", 5000.0);
        categories.put("Travel", 3000.0);
        categories.put("Shopping", 2000.0);

        Budget monthly = new MonthlyBudget(20000, 15000, categories);

        monthly.addTransaction(new Transaction(4000, "EXPENSE", "Food"));
        monthly.addTransaction(new Transaction(3500, "EXPENSE", "Travel"));
        monthly.addTransaction(new Transaction(2000, "EXPENSE", "Shopping"));

        monthly.generateReport();
        monthly.detectOverspend();

        Budget annual = new AnnualBudget(240000, 180000, categories);

        annual.addTransaction(new Transaction(190000, "EXPENSE", "Overall"));

        annual.generateReport();
        annual.detectOverspend();
    }
}
