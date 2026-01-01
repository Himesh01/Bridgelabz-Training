package com.bridgelabz.oops.inheritance.singleinheritance.smarthomedevice;

public class DeviceMain {
	public static void main(String[] args) {
        // Create an instance of Thermostat for the year 2026
        Thermostat livingRoomTstat = new Thermostat("T-26-01", true, 21.5);

        System.out.println("--- Smart Home Dashboard ---");
        livingRoomTstat.displayStatus();
    }
}
