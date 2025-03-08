package org.example.hibernate.StrategyDesignPattern.after;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal drive strategy");
    }
}
