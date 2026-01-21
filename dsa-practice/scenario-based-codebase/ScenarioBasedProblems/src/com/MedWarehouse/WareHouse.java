package com.MedWarehouse;
import java.util.*;

public class WareHouse {

    public void sortInventory(Medicine[] inventory) {
        if (inventory == null || inventory.length < 2) {
            return; 
        }
        mergeSort(inventory, inventory.length);
    }

    private void mergeSort(Medicine[] array, int length) {
        if (length < 2) return;

        int mid = length / 2;
        Medicine[] leftSide = Arrays.copyOfRange(array, 0, mid);
        Medicine[] rightSide = Arrays.copyOfRange(array, mid, length);

        mergeSort(leftSide, mid);
        mergeSort(rightSide, length - mid);

        merge(array, leftSide, rightSide, mid, length - mid);
    }

    private void merge(Medicine[] target, Medicine[] l, Medicine[] r, int leftLen, int rightLen) {
        int i = 0, j = 0, k = 0;

        while (i < leftLen && j < rightLen) {
            if (l[i].expiryDays <= r[j].expiryDays) {
                target[k++] = l[i++];
            } else {
                target[k++] = r[j++];
            }
        }

        while (i < leftLen) target[k++] = l[i++];
        while (j < rightLen) target[k++] = r[j++];
    }
}
