package com.Sorting.HospitalQueue;

public class HospitalQueue {

    public static void bubbleSortByCriticality(Patient[] patients) {

        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (patients[j].criticality < patients[j + 1].criticality) {

                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }
}