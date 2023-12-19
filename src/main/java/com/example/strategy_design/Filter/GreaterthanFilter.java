package com.example.strategy_design.Filter;

public class GreaterthanFilter implements Filter {
    public void filter(int[] arr, int value){
        for (int j : arr) {
            if (j > value) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
}
