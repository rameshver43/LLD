package org.example.lld.singletonDesignPattern.lazy;

public class DBConnection {
    private static DBConnection conObject;
    public static int count =0;

    private DBConnection(){
        count++;
    }

    public static DBConnection getInstance(){
        if(conObject == null){
            conObject = new DBConnection();
        }
        return conObject;
    }
}
