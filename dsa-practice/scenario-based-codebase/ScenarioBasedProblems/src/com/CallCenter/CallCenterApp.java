package com.CallCenter;

public class CallCenterApp {

    public static void main(String[] args) {

        CallQueueManager manager = new CallQueueManager();

        Customer c1 = new Customer("C101", "Nitin", false);
        Customer c2 = new Customer("C102", "Raj", false);
        Customer c3 = new Customer("C103", "Vansh", false);
        Customer c4 = new Customer("C104", "Rajeev", true);

        manager.addCall(c1);
        manager.addCall(c2);
        manager.addCall(c3);
        manager.addCall(c4);
        manager.addCall(c2);

        manager.serveNextCall();
        manager.serveNextCall();
        manager.serveNextCall();

        manager.displayCallStats();
    }
}
