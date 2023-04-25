package com.example.intellijgit.codeup;

import java.io.*;

public class Codeup1019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        String[] token = input.split("\\.");

        System.out.printf("%04d.%02d.%02d", Integer.parseInt(token[0]), Integer.parseInt(token[1]), Integer.parseInt(token[2]));

    }
}
