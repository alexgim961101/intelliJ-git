package com.example.intellijgit.codeup;

import java.util.Scanner;

public class Codeup1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 == num2 && num1 == 0 ? 1 : 0);
    }
}
