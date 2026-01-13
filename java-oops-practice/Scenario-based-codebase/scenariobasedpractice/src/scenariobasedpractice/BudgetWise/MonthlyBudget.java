package scenariobasedpractice.BudgetWise;
import java.util.*;

public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit, Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("📅 Monthly Budget Report");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + getTotalExpenses());
        System.out.println("Net Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        Map<String, Double> spent = new HashMap<>();

        for (Transaction t : transactions) {
            if (t.getType().equals("EXPENSE")) {
                spent.put(
                    t.getCategory(),
                    spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount()
                );
            }
        }

        for (String cat : categoryLimits.keySet()) {
            if (spent.getOrDefault(cat, 0.0) > categoryLimits.get(cat)) {
                System.out.println("⚠ Overspending in category: " + cat);
            }
        }
    }
}
