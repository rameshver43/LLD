package org.example.lld.singletonDesignPattern.lazy;

public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100000000;i++) {
            DBConnection dbConnection = DBConnection.getInstance();
        }
    }
}
