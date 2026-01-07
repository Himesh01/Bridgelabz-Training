package scenariobasedpractice.parkease;

public class ParkEaseApp {

    public static void main(String[] args) {

        Vehicle car = new Car("KA01AB1234");
        Vehicle bike = new Bike("KA02CD5678");

        ParkingSlot slot1 = new ParkingSlot("P1", "Car");
        ParkingSlot slot2 = new ParkingSlot("P2", "Bike");

     
        slot1.assignSlot(car);
        slot2.assignSlot(bike);

        
        slot1.releaseSlot(car, 7);   
        slot2.releaseSlot(bike, 4);

       
        slot1.showLogs();
        slot2.showLogs();
    }
}