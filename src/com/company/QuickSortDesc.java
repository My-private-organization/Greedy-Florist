package com.company;

public class QuickSortDesc {

    static int partition( int[] arr, int left, int right ) {
        int pivot = arr[left];
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if (arr[j] > pivot) {
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;

        return i;

    }

    static void quickSortDesc( int[] arr, int left, int right ) {
        if (left < right) {
            int q = partition(arr, left, right);
            quickSortDesc(arr, left, q);
            quickSortDesc(arr, q + 1, right);
        }
    }
}
