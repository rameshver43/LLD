package org.example.hibernate.DecoratorDesignPattern;

public class Margherita implements BasePizza{
    @Override
    public int cost() {
        return 100;
    }
}
