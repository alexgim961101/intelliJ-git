package com.example.intellijgit.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public static void readAChar() throws IOException {
        InputStreamReader javaInput = new InputStreamReader(System.in);
        int ascii = javaInput.read();
        System.out.println(ascii);
    }

    public static void readTwoChar() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);

        int ascii1 = is.read();
        int ascii2 = is.read();

        System.out.println(ascii1);
        System.out.println(ascii2);
    }

    public static void main(String[] args) throws IOException {
        readAChar();
        readTwoChar();
    }
}
