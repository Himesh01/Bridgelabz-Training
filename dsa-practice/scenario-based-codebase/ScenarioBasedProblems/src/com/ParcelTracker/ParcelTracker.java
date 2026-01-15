package com.ParcelTracker;

public class ParcelTracker {
    private StageNode head;

    public ParcelTracker() {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

    public void trackParcel() {
        StageNode current = head;

        if (current == null) {
            System.out.println("Parcel is LOST. Tracking unavailable.");
            return;
        }

        System.out.println("Parcel Tracking:");
        while (current != null) {
            System.out.print(current.stage + " → ");
            current = current.next;
        }
        System.out.println("END");
    }

    public void addCheckpoint(String afterStage, String newStage) {
        StageNode current = head;

        while (current != null && !current.stage.equals(afterStage)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Stage not found. Cannot add checkpoint.");
            return;
        }

        StageNode newNode = new StageNode(newStage);
        newNode.next = current.next;
        current.next = newNode;

        System.out.println("Checkpoint '" + newStage + "' added after '" + afterStage + "'");
    }

    public void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as LOST");
    }
}
