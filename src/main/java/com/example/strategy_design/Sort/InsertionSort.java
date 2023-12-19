package com.example.strategy_design.Sort;

public class InsertionSort implements Sort{

    public void sort(int[] arr) {
        System.out.println("Using Insertion Sort");
        if (arr == null || arr.length <= 1) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
