package com.bridgelabz.oops.inheritance.singleinheritance.smarthomedevice;

public class Device {
	String deviceId;
    boolean isOn;

    Device(String deviceId, boolean isOn) {
        this.deviceId = deviceId;
        this.isOn = isOn;
    }

    // Returns a string representation of the power status
    String getStatusString() {
        return isOn ? "ON" : "OFF";
    }
}
