package com.example.intellijgit.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.valueOf(br.readLine(), 8);

        System.out.printf("%d", num);
    }
}
