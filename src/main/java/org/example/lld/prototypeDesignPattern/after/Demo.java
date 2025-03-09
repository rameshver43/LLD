package org.example.lld.prototypeDesignPattern.after;

public class Demo {
    public static void main(String[] args) {
        Student student  = new Student(20, 1,"Arun");
        Student cloneStudent = (Student) student.clone();
        System.out.println(cloneStudent);
    }
}
