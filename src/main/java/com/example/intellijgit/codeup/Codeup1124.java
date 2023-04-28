package com.example.intellijgit.codeup;

import java.util.Scanner;

public class Codeup1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ch = sc.next();

        int hIdx = ch.indexOf("H");

        int x = Integer.parseInt(ch.substring(1, hIdx));
        int y = Integer.parseInt(ch.substring(hIdx + 1, ch.length()));

        System.out.println(x * 12 + y);
    }
}
