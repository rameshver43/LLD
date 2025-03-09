package org.example.lld.AbsractFactoryDesignPattern;

import org.example.lld.AbsractFactoryDesignPattern.Factory.Factory;
import org.example.lld.AbsractFactoryDesignPattern.Factory.FactoryImpl;
import org.example.lld.AbsractFactoryDesignPattern.Factory.VehicleFactory.VehicleFactory;

public class Demo {
    public static void main(String[] args) {
        Factory factory = new FactoryImpl();
        VehicleFactory vehicleFactory = factory.getShape("lux");
        Vehicle obj = vehicleFactory.getShape("bmw");
        obj.about();
    }
}
