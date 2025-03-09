package org.example.lld.singletonDesignPattern.lazy;

import org.example.lld.singletonDesignPattern.lazy.DBConnection;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        DBConnection dbConnection = DBConnection.getInstance();
        DBConnection dbConnection1 = DBConnection.getInstance();
        DBConnection dbConnection2 = DBConnection.getInstance();

        List<Thread> threadList = new ArrayList<>();
        for(int i=0;i<100000;i++) {
            Thread thread = new MyThread();
            thread.start();
            threadList.add(thread);
        }
        for(Thread th: threadList){
            th.join();
        }

        System.out.println("Count: " + DBConnection.count);
    }
}
