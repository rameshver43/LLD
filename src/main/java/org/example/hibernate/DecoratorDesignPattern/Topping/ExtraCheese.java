package org.example.hibernate.DecoratorDesignPattern.Topping;

import org.example.hibernate.DecoratorDesignPattern.BasePizza;

public class ExtraCheese implements ToppingDecorator{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza  = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
