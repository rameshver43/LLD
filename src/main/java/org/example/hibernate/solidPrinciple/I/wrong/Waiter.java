package org.example.hibernate.solidPrinciple.I.wrong;

// as waiter is implementing RestaurantEmployee interface then it have to implement all its method.
public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {

    }

    @Override
    public void serveCustomers() {

    }

    @Override
    public void cookFood() {

    }

    @Override
    public void decideMenu() {

    }
}
