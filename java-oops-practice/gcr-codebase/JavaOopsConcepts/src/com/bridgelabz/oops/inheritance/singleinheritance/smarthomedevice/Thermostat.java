package com.bridgelabz.oops.inheritance.singleinheritance.smarthomedevice;

public class Thermostat extends Device{
	double temperatureSetting;

    Thermostat(String deviceId, boolean isOn, double temperatureSetting) {
        super(deviceId, isOn); // Passes deviceId and isOn to the Device constructor
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Power Status: " + getStatusString());
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
