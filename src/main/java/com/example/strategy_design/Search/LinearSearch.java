package com.example.strategy_design.Search;

public class LinearSearch implements Search {
    public int search(int[] array, int target){
        System.out.println("Using Linear Search");
        if (array == null || array.length == 0) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
