package com.example.intellijgit.codeup;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int answer = 0;
        for(int i = 0; i <= num; i++){
            if(i % 2 == 0) answer += i;
        }

        System.out.println(answer);
    }
}
