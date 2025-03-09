package org.example.lld.singletonDesignPattern.doublelocking;

public class DBConnection {
    private static DBConnection conObject;
    public static int count =0;

    private DBConnection(){
        count++;
    }

    public static DBConnection getInstance(){
        if(conObject == null){
            // only locking happen when multiple threads come here
            synchronized (DBConnection.class){
                // checking again here to ensure that only one instance created.
                if(conObject == null){
                    conObject = new DBConnection();
                }
            }
        }
        return conObject;
    }
}
