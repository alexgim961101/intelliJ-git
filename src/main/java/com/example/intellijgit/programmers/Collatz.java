package com.example.intellijgit.programmers;

public class Collatz {
    public int solution(long num) {
        if(num == 1) return 0;
        int count = 0;
        while(count < 500) {
            if(num == 1) return count;
            if(num % 2 == 0) {
                num /= 2;
            }else {
                num = (num * 3) + 1;
            }
            count++;
        }
        return -1;
    }
}
