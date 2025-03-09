package org.example.lld.FactoryDesignPattern;

import org.example.lld.FactoryDesignPattern.Factory.ShapeFactory;
import org.example.lld.FactoryDesignPattern.Factory.ShapeFactoryImpl;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactoryImpl();
        Shape shapeObj = shapeFactory.getShape("circle");
        shapeObj.draw();
    }
}
