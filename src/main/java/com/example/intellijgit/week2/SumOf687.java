package com.example.intellijgit.week2;

public class SumOf687 {
    private static int NUM = 687;
    public static void main(String[] args) {

        int sum = 0;
        while(NUM > 0) {
            sum += NUM % 10;
            NUM /= 10;
        }
        System.out.print(sum);
    }
}
