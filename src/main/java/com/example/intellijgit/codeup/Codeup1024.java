package com.example.intellijgit.codeup;

import java.io.*;

public class Codeup1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        for(char x : input.toCharArray()){
            System.out.printf("\'%c\'\n", x);
        }
    }
}
