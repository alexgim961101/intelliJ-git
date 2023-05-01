package com.example.intellijgit.codeup;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hv = Integer.parseInt(sc.next(), 16);

        for(int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", hv, i, hv*i);
        }
    }
}
