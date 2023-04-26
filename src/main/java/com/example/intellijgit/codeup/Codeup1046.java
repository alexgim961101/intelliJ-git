package com.example.intellijgit.codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long num3 = sc.nextLong();

        System.out.println(num1 + num2 + num3);
        System.out.printf("%.01f", ((float) num1 + (float) num2 + (float) num3) / 3f);
    }
}
