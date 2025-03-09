package org.example.lld.singletonDesignPattern.doublelocking;

public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<1000;i++) {
            DBConnection dbConnection = DBConnection.getInstance();
        }
    }
}
