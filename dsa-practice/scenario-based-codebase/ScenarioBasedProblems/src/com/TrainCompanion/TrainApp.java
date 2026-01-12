package com.TrainCompanion;

public class TrainApp {

    public static void main(String[] args) {

        TrainCompanion train = new TrainCompanion();

        train.addCompartment("C1", false, true);
        train.addCompartment("C2", true, false);
        train.addCompartment("C3", false, true);
        train.addCompartment("C4", true, true);

        train.traverseForward();
        System.out.println();

        train.traverseBackward();
        System.out.println();

        train.searchService("pantry");
        System.out.println();

        train.showAdjacent("C3");
        System.out.println();

        train.removeCompartment("C2");
        System.out.println();

        train.traverseForward();
    }
}
