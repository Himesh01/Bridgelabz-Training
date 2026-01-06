package scenariobasedpractice.petpal;
import java.util.*;
import java.util.Random;

abstract class Pet {

    protected String name;
    protected String type;
    protected int age;

    private int hunger; // 0 = full, 100 = very hungry
    private int energy; // 0 = tired, 100 = energetic
    private String mood;

    public Pet(String name, String type, int age) {
        Random rand = new Random();
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = rand.nextInt(50) + 20;
        this.energy = rand.nextInt(50) + 30;
        updateMood();
    }

    public Pet(String name, String type, int age, int hunger, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        updateMood();
    }

    private void updateMood() {
        if (hunger < 30 && energy > 60) {
            mood = "Happy";
        } else if (hunger > 70) {
            mood = "Hungry";
        } else if (energy < 30) {
            mood = "Tired";
        } else {
            mood = "Calm";
        }
    }

    protected void decreaseHunger(int value) {
        hunger -= value; // operator usage
        if (hunger < 0) hunger = 0;
        updateMood();
    }

    protected void increaseHunger(int value) {
        hunger += value;
        if (hunger > 100) hunger = 100;
        updateMood();
    }

    protected void increaseEnergy(int value) {
        energy += value;
        if (energy > 100) energy = 100;
        updateMood();
    }

    protected void decreaseEnergy(int value) {
        energy -= value;
        if (energy < 0) energy = 0;
        updateMood();
    }

    public void showStatus() {
        System.out.println(name + " | Hunger: " + hunger +
                " | Energy: " + energy +
                " | Mood: " + mood);
    }

    public abstract void makeSound();
}
