package org.example.hibernate.solidPrinciple.O.wrong;

public class Marker {
    private String name;
    private String color;
    private int year;
    private int price;

    Marker(String name, String color, int year, int price){
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString(){
        return "Name: " + this.name + " Color: "+ this.color;
    }
}
