package scenariobasedpractice.fittrack;

public class CardioWorkout extends Workout implements Trackable{
	
	public CardioWorkout(double duration) {
		super("Cardio", duration);
	}
	
	@Override
	public void calculateCalories() {
		double calories = getDuration()*8;
		setCaloriesBurned(calories);
	}
	
	@Override
	public void startWorkout() {
		System.out.println("Starting cardio workout");
	}
	
	@Override
	public void stopWorkout() {
		System.out.println("Stoping cardio workout");
	}
}