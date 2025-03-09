package org.example.lld.prototypeDesignPattern.before;

public class Demo {
    public static void main(String[] args) {
        Student student  = new Student(20, 1,"Arun");
        Student cloneStudent = new Student();
        cloneStudent.age  = student.age;
        // this will create a problem
        //cloneStudent.rollNumber = student.rollNumber;
        cloneStudent.name  = student.name;
    }
}
