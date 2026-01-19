package genrics.PersonalizedMealTracker;

public class MealPlanGenerator {
	public static <T extends MealPlan> void generateMealPlan(T meal) {

        if (meal.getDailyCalories() < 1500) {
            System.out.println(" Invalid Meal Plan: Calories too low");
            return;
        }

        System.out.println("Personalized Meal Plan Generated");
        System.out.println("Meal Type: " + meal.getMealType());
        System.out.println("Daily Calories: " + meal.getDailyCalories());
    }
}
