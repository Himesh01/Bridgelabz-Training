package scenariobasedpractice.fittrack;

import java.util.List;
import java.util.ArrayList;

public class UserProfile {


	private String name;
	private int age;
	private double weight;
	private int goal;
	private List<Workout> workouts;
	
	public UserProfile(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.goal = 2000;
		this.workouts = new ArrayList<>();
	}
	
	public UserProfile(String name, int age, double weight, int goal) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.goal = goal;
		this.workouts = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public int getGoal() {
		return goal;
	}
	
	public void addWorkout(Workout workout) {
		workouts.add(workout);
	}
	public double getTotalCaloriesBurned() {
        double totalCalories = 0;
        for (Workout workout : workouts) {
            totalCalories += workout.getCaloriesBurned();
        }
        return totalCalories;
    }

    public void viewWorkouts() {
        for (Workout workout : workouts) {
            System.out.println(workout.getType() + " workout for " + workout.getDuration() + " minutes");
        }
    }	
    
    public void displayInfo() {
    	System.out.println("name: "+name);
    	System.out.println("age: "+age);
    	System.out.println("goal: "+goal);
    	System.out.println("weight: "+weight);
    }
}