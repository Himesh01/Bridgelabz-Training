package com.TrafficManager;

class Roundabout {
    private Vehicle tail;

    public void addVehicle(String plateNumber) {
        Vehicle newVehicle = new Vehicle(plateNumber);

        if (tail == null) {
            tail = newVehicle;
            tail.next = tail;
        } else {
            newVehicle.next = tail.next;
            tail.next = newVehicle;
            tail = newVehicle;
        }
        System.out.println("Vehicle " + plateNumber + " entered roundabout.");
    }

    public void removeVehicle() {
        if (tail == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle head = tail.next;

        if (head == tail) {
            System.out.println("Vehicle " + head.plateNumber + " exited roundabout.");
            tail = null;
        } else {
            System.out.println("Vehicle " + head.plateNumber + " exited roundabout.");
            tail.next = head.next;
        }
    }

    public void printRoundabout() {
        if (tail == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle current = tail.next;
        System.out.print("Roundabout: ");

        do {
            System.out.print(current.plateNumber + " -> ");
            current = current.next;
        } while (current != tail.next);

        System.out.println("(back to start)");
    }
}
