package org.example.lld.prototypeDesignPattern.before;

public class Student {
    int age;
    private int rollNumber;
    String name;

    Student(){
    }

    Student(int age, int rollNumber, String name){
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }
}
