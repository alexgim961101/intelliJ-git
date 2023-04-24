package com.example.intellijgit.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char ch = br.readLine().charAt(0);

        System.out.print((int) ch);
    }
}
