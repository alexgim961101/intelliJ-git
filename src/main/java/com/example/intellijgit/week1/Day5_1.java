package com.example.intellijgit.week1;

public class Day5_1 {
    int location;

    public void left(){
        location -= 1;
    }

    public void right() {
        location += 1;
    }
    public static void main(String[] args) {
        Day5_1 d = new Day5_1();

        d.left();
        d.left();
        d.right();

        System.out.print(d.location);
    }
}
