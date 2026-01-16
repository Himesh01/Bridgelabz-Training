package com.Sorting.CropMonitor;

public class CropMonitor {

    public static void quickSort(SensorData[] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);

            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
    }

    private static int partition(SensorData[] data, int low, int high) {
        long pivot = data[high].timestamp; 
        int i = (low - 1); 

        for (int j = low; j < high; j++) {
        	
            if (data[j].timestamp <= pivot) {
                i++;
                SensorData temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        SensorData temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        SensorData[] logs = {
            new SensorData(1705420000L, 22.5),
            new SensorData(1705410000L, 20.1),
            new SensorData(1705430000L, 21.8),
            new SensorData(1705400000L, 19.5)
        };

        quickSort(logs, 0, logs.length - 1);

        System.out.println("Sorted Sensor Data (Timestamps):");
        for (SensorData log : logs) {
            System.out.println(log.timestamp + " -> " + log.temperature + "°C");
        }
    }
}
