package com.example.intellijgit.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int zeroCnt = 4;

        for(char x : input.toCharArray()) {
            int num = x - '0';
            for(int j = 0; j < zeroCnt; j++){
                num *= 10;
            }
            zeroCnt--;
            System.out.printf("[%d]\n", num);
        }
    }
}
