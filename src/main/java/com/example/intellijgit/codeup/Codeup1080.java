package com.example.intellijgit.codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;
        int idx = 1;
        while (sum < num) {
            sum += idx;
            idx++;
        }

        System.out.println(--idx);
    }
}
