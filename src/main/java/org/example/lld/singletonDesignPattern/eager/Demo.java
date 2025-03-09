package org.example.lld.singletonDesignPattern.eager;

public class Demo {
    public static void main(String[] args) {

        DBConnection dbConnection = DBConnection.getInstance();
        // This will not call constructor
        DBConnection dbConnection1 = DBConnection.getInstance();

    }
}
