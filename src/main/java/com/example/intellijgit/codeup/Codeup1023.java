package com.example.intellijgit.codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] tmp = str.split("\\.");

        System.out.println(tmp[0]);
        System.out.println(tmp[1]);
    }
}
