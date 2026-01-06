package scenariobasedpractice.fittrack;

public abstract class Workout {
	private String type;
	private double duration;
	private double caloriesBurned;
	
	public Workout(String type, double duration) {
		this.type = type;
		this.duration = duration;
		this.caloriesBurned = 0.0;
	}
	public String getType() {
		return type;
	}
	public double getDuration() {
		return duration;
	}
	public double getCaloriesBurned() {
		return caloriesBurned;
	}
	public void setCaloriesBurned(double calories) {
		caloriesBurned = calories;
	}
	public abstract void calculateCalories();
}