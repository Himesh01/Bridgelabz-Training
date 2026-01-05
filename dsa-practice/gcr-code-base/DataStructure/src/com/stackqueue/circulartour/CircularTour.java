package com.stackqueue.circulartour;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {

    public int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        Queue<Integer> queue = new LinkedList<>();
        int currentPetrol = 0;
        int i = 0;

        while (queue.size() < n) {
            currentPetrol += pumps[i].petrol - pumps[i].distance;
            queue.add(i);

            // If petrol becomes negative, remove from front
            while (currentPetrol < 0 && !queue.isEmpty()) {
                int removed = queue.poll();
                currentPetrol -= pumps[removed].petrol - pumps[removed].distance;
            }

            i = (i + 1) % n;

            // Full loop and queue empty → impossible
            if (i == 0 && queue.isEmpty()) {
                return -1;
            }
        }
        return queue.peek();
    }
}
