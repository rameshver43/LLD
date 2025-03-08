package org.example.hibernate.DecoratorDesignPattern;

public class FarmHouse implements BasePizza{
    @Override
    public int cost() {
        return 200;
    }
}
