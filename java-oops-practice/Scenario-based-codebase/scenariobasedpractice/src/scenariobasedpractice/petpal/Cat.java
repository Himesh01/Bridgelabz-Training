package scenariobasedpractice.petpal;

class Cat extends Pet implements IInteractable {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        decreaseHunger(15);
    }

    @Override
    public void play() {
        decreaseEnergy(15);
        increaseHunger(10);
    }

    @Override
    public void sleep() {
        increaseEnergy(40);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
