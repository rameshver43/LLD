package org.example.lld.singletonDesignPattern.synchronizedMethod;

public class DBConnection {
    private static DBConnection conObject;
    public static int count =0;

    private DBConnection(){
        count++;
    }

    synchronized public static DBConnection getInstance(){
        if(conObject == null){
            conObject = new DBConnection();
        }
        return conObject;
    }
}
