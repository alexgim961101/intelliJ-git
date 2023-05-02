package com.example.intellijgit.codeup;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.printf("%s ", i % 3 == 0 ? "X" : String.valueOf(i));
        }
    }
}
