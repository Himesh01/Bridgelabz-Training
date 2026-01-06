package scenariobasedpractice.petpal;

public class PetPalDemo {
    public static void main(String[] args) {

        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Luna", 2);
        Pet bird = new Bird("Kiwi", 1);

        dog.makeSound();
        ((IInteractable) dog).play();
        dog.showStatus();

        cat.makeSound();
        ((IInteractable) cat).sleep();
        cat.showStatus();

        bird.makeSound();
        ((IInteractable) bird).feed();
        bird.showStatus();
    }
}
