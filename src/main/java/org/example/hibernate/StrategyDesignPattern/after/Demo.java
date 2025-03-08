package org.example.hibernate.StrategyDesignPattern.after;

public class Demo {
    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}
