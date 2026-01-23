package com.TreeGraph.HospitalQueueManagement;

public class PatientNode {

    int time;         
    String name;
    int height;

    PatientNode left, right;

    public PatientNode(int time, String name) {
        this.time = time;
        this.name = name;
        this.height = 1;
    }
}