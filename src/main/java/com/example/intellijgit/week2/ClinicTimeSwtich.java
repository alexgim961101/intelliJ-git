package com.example.intellijgit.week2;

public class ClinicTimeSwtich {
    public static void main(String[] args) {
        String day = "월";
        String time = "휴진";

        switch (day) {
            case "월", "수", "금" : time = "am 9:00 ~ 6:00"; break;
            case "화", "목" : time = "am 9:00 ~ 8:00"; break;
            case "토" : time = "am 9:00 ~ pm 1:00"; break;
            default: time = "휴진입니다";
        }
        System.out.println(time);
        System.out.println("점심시간은 pm 1:00 ~ pm 2:00 입니다");
    }
}
