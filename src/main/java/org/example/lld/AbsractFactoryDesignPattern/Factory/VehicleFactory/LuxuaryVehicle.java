package org.example.lld.AbsractFactoryDesignPattern.Factory.VehicleFactory;

import org.example.lld.AbsractFactoryDesignPattern.BMW;
import org.example.lld.AbsractFactoryDesignPattern.Mercedes;
import org.example.lld.AbsractFactoryDesignPattern.Vehicle;

public class LuxuaryVehicle implements VehicleFactory{
    @Override
    public Vehicle getShape(String input) {
        switch (input){
            case "bmw":
                return new BMW();
            case "mercedes":
                return new Mercedes();
            default:
                return null;
        }
    }
}
