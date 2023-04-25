package com.example.intellijgit.codeup;

import java.io.*;

public class Codeup1020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '-') continue;
            bw.append(input.charAt(i));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
