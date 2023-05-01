package com.example.intellijgit.codeup;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.next().charAt(0);

        for(int i = 'a'; i <= ch; i++){
            System.out.print((char) i + " ");
        }
    }
}
