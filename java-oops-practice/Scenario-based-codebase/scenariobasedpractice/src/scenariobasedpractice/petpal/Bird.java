package scenariobasedpractice.petpal;

class Bird extends Pet implements IInteractable {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        decreaseHunger(10);
    }

    @Override
    public void play() {
        decreaseEnergy(10);
        increaseHunger(10);
    }

    @Override
    public void sleep() {
        increaseEnergy(20);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
}
