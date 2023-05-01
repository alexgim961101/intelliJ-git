package com.example.intellijgit.programmers;

public class PeriodQuery3 {
    public int[] solution(int[] arr, int[][] queries) {

        for(int i = 0; i < queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];

            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }

        return arr;
    }
}
