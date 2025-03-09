package org.example.lld.solidPrinciple.O.correct;

public class Invoice {
    private Marker marker;
    private int quantity;

    Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public Marker getMarker(){
        return this.marker;
    }

    public int calculateTotal(){
        return ((marker.getPrice())* this.quantity);
    }

}
