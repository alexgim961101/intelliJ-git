package com.example.intellijgit.week2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 7, 9};

        for(int i = arr.length-1; i >= 0; i--){
            for(int j = 0; j < i - 1; j++){
                boolean check = arr[j] > arr[j+1];
                if(check) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
