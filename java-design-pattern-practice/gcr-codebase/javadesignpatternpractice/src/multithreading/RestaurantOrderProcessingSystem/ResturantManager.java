package multithreading.RestaurantOrderProcessingSystem;

public class ResturantManager {

    public static void main(String[] args) {

        Chef chef1 = new Chef("Chef-1", "Pizza", 3);
        Chef chef2 = new Chef("Chef-2", "Pasta", 2);
        Chef chef3 = new Chef("Chef-3", "Salad", 1);
        Chef chef4 = new Chef("Chef-4", "Burger", 2.5);

        chef1.start();
        chef2.start();
        chef3.start();
        chef4.start();

        try {
            chef1.join();
            chef2.join();
            chef3.join();
            chef4.join();
        } catch (InterruptedException e) {
            System.out.println("Manager interrupted!");
        }

        System.out.println("Kitchen closed - All orders completed");
    }
}
