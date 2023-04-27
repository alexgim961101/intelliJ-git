package com.example.intellijgit.codeup;

import java.util.Scanner;

public class Codeup1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print(num1 == num2 && num1 == 1 ? 1 : 0);
    }
}
