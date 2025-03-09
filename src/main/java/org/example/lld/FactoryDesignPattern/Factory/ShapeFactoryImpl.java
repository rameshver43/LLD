package org.example.lld.FactoryDesignPattern.Factory;

import org.example.lld.FactoryDesignPattern.Circle;
import org.example.lld.FactoryDesignPattern.Rectangle;
import org.example.lld.FactoryDesignPattern.Shape;
import org.example.lld.FactoryDesignPattern.Square;

public class ShapeFactoryImpl implements ShapeFactory {
    @Override
    public Shape getShape(String input){
        switch (input){
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
