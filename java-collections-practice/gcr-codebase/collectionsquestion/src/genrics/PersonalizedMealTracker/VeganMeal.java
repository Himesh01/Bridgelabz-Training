package genrics.PersonalizedMealTracker;

public class VeganMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public int getDailyCalories() {
        return 2000;
    }
}