package com.example.intellijgit.week1;

public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isSameXY() {
        return this.x == this.y;
    }

    public double getDistance(Point p2) {
        double w = this.x - p2.x;
        double h = this.y - p2.y;

        return Math.sqrt(w*w + h*h);
    }

    public static void main(String[] args) {
        Point p = new Point(2, 3);
        Point p2 = new Point(2, 4);
        System.out.printf("%d %d\n", p.getX(), p.getY());

        System.out.printf("x와 y가 같은지?? : %b", p.isSameXY());
        System.out.println(p.getDistance(p2));
    }
}
