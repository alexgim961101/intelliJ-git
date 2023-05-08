package com.example.intellijgit.week4;

public class Main {
    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders(0);

        si.moveRight();
        System.out.println(si.location);
        si.moveLeft();
        System.out.println(si.location);
    }
}
