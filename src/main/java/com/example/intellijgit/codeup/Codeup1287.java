package com.example.intellijgit.codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1287 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            for(int j = 0; j < i * n; j++){
                bw.append('*');
            }
            bw.append('\n');
        }

        bw.flush();
        bw.close();
    }
}
