package org.example.lld.DecoratorDesignPattern.Topping;

import org.example.lld.DecoratorDesignPattern.BasePizza;

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
