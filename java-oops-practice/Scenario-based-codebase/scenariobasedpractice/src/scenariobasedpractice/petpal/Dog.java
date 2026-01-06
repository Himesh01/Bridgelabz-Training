package scenariobasedpractice.petpal;

class Dog extends Pet implements IInteractable {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void feed() {
        decreaseHunger(20);
        increaseEnergy(10);
    }

    @Override
    public void play() {
        decreaseEnergy(20);
        increaseHunger(15);
    }

    @Override
    public void sleep() {
        increaseEnergy(30);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
