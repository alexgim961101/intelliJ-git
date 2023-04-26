package com.example.intellijgit.week2;

public class Test {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();

        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "alexgim";
        classInSchool.teacher.age = 31;
        classInSchool.students = new Student[30];

        System.out.println(classInSchool.teacher.name);
    }
}
