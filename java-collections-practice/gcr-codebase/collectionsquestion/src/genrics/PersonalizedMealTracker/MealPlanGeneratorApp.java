package genrics.PersonalizedMealTracker;

public class MealPlanGeneratorApp {
	 public static void main(String[] args) {

		 Meal<VegetarianMeal> vegMeal =
				 new Meal<>(new VegetarianMeal());
		 
		 Meal<VeganMeal> veganMeal =
				 new Meal<>(new VeganMeal()); 
		 
		 Meal<KetoMeal> ketoMeal =
				 new Meal<>(new KetoMeal());
		 
		 Meal<HighProteinMeal> proteinMeal =
				 new Meal<>(new HighProteinMeal());

		 MealPlanGenerator.generateMealPlan(vegMeal.getMealPlan());
		 MealPlanGenerator.generateMealPlan(veganMeal.getMealPlan());
		 MealPlanGenerator.generateMealPlan(ketoMeal.getMealPlan());
		 MealPlanGenerator.generateMealPlan(proteinMeal.getMealPlan());
	 }
}
