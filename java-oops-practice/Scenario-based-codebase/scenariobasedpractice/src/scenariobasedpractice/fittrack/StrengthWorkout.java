package scenariobasedpractice.fittrack;

public class StrengthWorkout extends Workout implements Trackable {
	public StrengthWorkout(double duration) {
		super("Strength", duration);
	}
	
	@Override
	public void calculateCalories() {
		double calories = getDuration()*5;
		setCaloriesBurned(calories);
	}
	
	@Override
	public void startWorkout() {
		System.out.println("Starting streangth workout");
	}
	
	@Override
	public void stopWorkout() {
		System.out.println("Stopping strngth workout");
	}	
}
