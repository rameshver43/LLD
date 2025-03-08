package org.example.hibernate.StrategyDesignPattern.after;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports drive strategy");
    }
}
