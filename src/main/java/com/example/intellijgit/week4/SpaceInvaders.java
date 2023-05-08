package com.example.intellijgit.week4;

public class SpaceInvaders {
    int location;

    public SpaceInvaders() {
    }

    public SpaceInvaders(int location) {
        this.location = location;
    }

    public void moveRight() {
        this.location += 1;
    }

    public void moveLeft() {
        this.location -= 1;
    }
}
