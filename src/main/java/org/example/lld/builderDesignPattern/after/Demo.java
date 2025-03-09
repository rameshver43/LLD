package org.example.lld.builderDesignPattern.after;

public class Demo {
    public static void main(String[] args) {
        StudentBuilder studentBuilder  = new EngineeringStudentBuilder();
        Director director = new Director(studentBuilder);
        Student student = director.createStudent();
        System.out.println(student);
    }
}
