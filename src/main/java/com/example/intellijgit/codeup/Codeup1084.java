package com.example.intellijgit.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < g; j++){
                for(int k = 0; k < b; k++){
                    bw.append(i + " " + j + " " + k+"\n");
                    cnt++;
                }
            }
        }
        bw.append(String.valueOf(cnt));
        bw.flush();
    }
}
