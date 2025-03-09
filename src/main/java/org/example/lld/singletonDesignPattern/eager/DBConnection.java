package org.example.lld.singletonDesignPattern.eager;

public class DBConnection {
    private static DBConnection conObject = new DBConnection();

    // Make constructor private so that other can not call it
    private DBConnection(){
        System.out.println("DB connection created...");
    }

    public static DBConnection getInstance(){
        return conObject;
    }
}
