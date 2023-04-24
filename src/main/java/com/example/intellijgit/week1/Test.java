package com.example.intellijgit.week1;

import java.io.IOException;

/**
 * 주석 추가 1234
 * */
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReaderEx bufferedReaderEx = new BufferedReaderEx();
        ScannerEx sc = new ScannerEx();

        bufferedReaderEx.readALine();
        sc.readTwoNumberPlus();

        User user = new User("alexgim", "010-xxxx-xxxx", 32);
        System.out.println(user.toString());
    }
}
