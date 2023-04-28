package com.example.intellijgit.week2;

import java.util.Arrays;

// 배열에서 자리 바꾸
// 추가학습 겸 반복문을 추가해서 버블정렬을 만들어보면 좋을듯
public class AutoSwap {
    public static void main(String[] args) {
        // 오름차순 정렬
        int[] arr = {2,1,7,9};
        boolean check = arr[0] > arr[1];
        // loop
        if(check) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
