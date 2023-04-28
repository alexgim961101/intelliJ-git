package com.example.intellijgit.codeup;

import java.util.Scanner;

public class Codeup1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int height = sc.nextInt();

        System.out.printf("%.1f", (float)(width * height) / 2);
    }
}
