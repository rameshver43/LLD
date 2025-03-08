package org.example.hibernate.solidPrinciple.S.wrong;

public class Invoice {
    private Marker marker;
    private int quantity;

    Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        return ((marker.getPrice())* this.quantity);
    }

    public void printInvoice(){
        System.out.println("Printing invoice: "  + this.marker);
    }

    public void saveToDB(){
        System.out.println("Saving to DB: " + this.marker);
    }
}
