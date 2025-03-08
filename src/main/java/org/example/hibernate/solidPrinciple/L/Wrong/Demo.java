package org.example.hibernate.solidPrinciple.L.Wrong;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
       List<Vehicle> vehicleList = new ArrayList<>();
       vehicleList.add(new MotorCycle());
       vehicleList.add(new Car());
       vehicleList.add(new Bicycle());

       for(Vehicle vehicle: vehicleList){
           System.out.println(vehicle.hasEngine().toString());
       }
    }
}
