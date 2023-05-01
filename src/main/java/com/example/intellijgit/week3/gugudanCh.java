package com.example.intellijgit.week3;

public class gugudanCh {
    public static void main(String[] args) {
        gugudanCh gu = new gugudanCh();
        gu.gugudan(8);
        gu.gugudan(4);
    }

    public void gugudan(int num) {
        System.out.println(num + "단 시작");
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
        System.out.println();
    }
}
